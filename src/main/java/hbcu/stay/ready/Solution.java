package hbcu.stay.ready;

import java.util.*;

public class Solution {

    public String isPalindrome(String input){

        HashMap<String, Integer> dictionary = createDictionary(input);
        if(checkToSeeIfTrue(dictionary)) {
            return "YES";
        }
        return "NO";
    }

    private HashMap<String, Integer> createDictionary(String input){
        String[] list = input.split("");

        HashMap<String, Integer> dictionary = new HashMap<String, Integer>();

        for (String letter: list){
            if (!dictionary.containsKey(letter)){
                dictionary.put(letter, 1);
            }
            else{
                dictionary.put(letter, dictionary.get(letter) + 1);
            }
        }
        return dictionary;
    }

    private boolean checkToSeeIfTrue(HashMap<String, Integer> hashMap){

        Integer count = 0;

        for (Map.Entry<String, Integer> entry: hashMap.entrySet()){

            if(count == 2){
                return false;
            }
            if(entry.getValue() % 2 != 0){
                count ++;
            }
        }
        return true;
    }


}
