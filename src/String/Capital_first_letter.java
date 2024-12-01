package String;

public class Capital_first_letter {
    public static void main(String[] args) {
        String str = "Hello bhai kaise ho";
        Capital(str);
    }
    public static void Capital(String str){
        String words[] = str.split(" ");
        for(String key : words){
            String capitalize = key.substring(0,1).toUpperCase() + key.substring(1);

            System.out.println(capitalize);
        }
    }
}
