package String;

import java.util.HashMap;

public class String_frequency {
    public static void main(String[] args) {
        String str = "hellofromme";
        String[] ch = str.split("");
        HashMap<String,Integer>  map = new HashMap<>();
        for( String key : ch){
            map.put(key , map.getOrDefault(key,0)+1);
        }
        System.out.println(map);
    }
}
