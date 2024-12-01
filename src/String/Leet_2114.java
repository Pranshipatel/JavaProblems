package String;

public class Leet_2114 {
    public static void main(String[] args) {
        String sentences[] = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        mostWordsFound(sentences);
    }
    public static void mostWordsFound(String[] sentences) {
        int max = 0;
        for(String key : sentences){
            int wordsCount = key.split(" ").length;
            max = Math.max(max,wordsCount);
        }
        System.out.println(max);
    }
}
