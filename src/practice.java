import java.util.*;
public class practice {
    public static void main(String[] args) {
    String s = "foobar";
    char letter = 'o';
    percentageLetter(s,letter);

    }
    public static void percentageLetter(String s, char letter) {
        HashMap<Character , Integer> map = new HashMap<>();
        int size = s.length();
        System.out.println(size);
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        double ans = 0;
            if(map.containsKey(letter)){
                int value = map.get(letter);
                double get = value/size;
                ans = get*100 ;
                System.out.println(ans);
            }
        System.out.println(ans);
    }
}
