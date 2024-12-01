package String;

public class Que79 {
    public static void main(String[] args) {
        String str = "Hello bhai kaise ho";
        capital(str);
    }

    public static void capital(String str) {
        String words[] = str.split(" ");
        for(String key: words){
            String newStr = key.substring(0,1).toUpperCase() + key.substring(1, key.length()-1) + key.substring(key.length()-1, key.length()).toUpperCase();
            System.out.println(newStr);
        }
    }

}
