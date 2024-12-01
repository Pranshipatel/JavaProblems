package String;

import java.util.*;

public class Anagrams {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        Anagram(s,t);
        System.out.println(Anagram(s,t));
    }
    public static boolean Anagram(String s, String t){
        HashMap<Character , Integer> wordsCount = new HashMap<>();
        if(s.length() != t.length())return false;
        for(char ch : s.toCharArray()){
            wordsCount.put(ch , wordsCount.getOrDefault(ch,0)+1);
        }
        for(char ch : t.toCharArray()){
            if(!wordsCount.containsKey(ch)){
                return false;
            }
            wordsCount.put(ch,wordsCount.get(ch)-1);

            if(wordsCount.get(ch) == 0){
                wordsCount.remove(ch);
            }

        }

        return wordsCount.isEmpty();
    }
}
