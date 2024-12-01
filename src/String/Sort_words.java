package String;

import java.util.Arrays;

public class Sort_words {
    public static void main(String[] args) {
        String words = "They take the bus to work. ";
        String newstr[] = words.split(" ");
        Arrays.sort(newstr);
        System.out.println(String.join(" ",newstr));
    }
}
