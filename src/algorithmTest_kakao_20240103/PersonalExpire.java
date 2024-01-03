package algorithmTest_kakao_20240103;

import java.util.HashMap;
import java.util.Map;

public class PersonalExpire {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};
        Map<String, Integer> expireMap = eachAlphabetExpire(terms);

        return answer;
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

    }
}
