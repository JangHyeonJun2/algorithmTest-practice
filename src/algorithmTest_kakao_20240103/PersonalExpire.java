package algorithmTest_kakao_20240103;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonalExpire {
    public int[] solution(String today, String[] terms, String[] privacies) {
        Map<String, Integer> expireMap = eachAlphabetExpire(terms);
        return calcDate(today, expireMap, privacies);
    }
    
    public int[] calcDate(String today, Map<String, Integer> expireMap, String[] privacies) {
        List<Integer> answer = new ArrayList<>();
        String todayDate = today;
        int index = 1;
        for (String privacy : privacies) {
            String[] privacys = privacy.split(" ");
            Integer kindMonth = expireMap.get(privacys[1]);
            String[] split = privacys[0].split("[.]");
            int totalDay = kindMonth*28;
            int countDay = 0;

            String[] todays = todayDate.split("[.]");


            countDay += (Integer.parseInt(todays[0]) - Integer.parseInt(split[0])) * 12 * 28;
            countDay += ((Integer.parseInt(todays[1]) - Integer.parseInt(split[1])) * 28);
            countDay += Integer.parseInt(todays[2]) - Integer.parseInt(split[2]);

            if (totalDay <= countDay) {
                answer.add(index);
            }
            index++;
        }
       return answer.stream().mapToInt(i->i).toArray();
    }
    

    public Map<String, Integer> eachAlphabetExpire(String[] terms) {
        Map<String, Integer> expires = new HashMap<>();

        for(String ex : terms) {
            String[] str = ex.split(" ");
            expires.put(str[0], Integer.valueOf(str[1]));
        }
        return expires;
    }

    public static void main(String[] args) {
        PersonalExpire personalExpire = new PersonalExpire();
        int[] solution = personalExpire.solution("2020.01.01", new String[]{"Z 3", "D 5"}, new String[]{"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"});

        for(int i : solution) {
            System.out.println(i);
        }

    }
}
