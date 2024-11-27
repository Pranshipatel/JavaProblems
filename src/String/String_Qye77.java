package String;

public class String_Qye77 {
    public static void main(String[] args) {
        String words[] = {"pay","attention","practice","attend"};
        String prefix = "at";
        Count(words,prefix);
        System.out.println( Count(words,prefix));
    }
    public static int Count(String words[], String prefix){
        int count = 0;
        for(String key : words){
            if(key.startsWith(prefix)){
                count++;
            }
        }
        return count;
    }
}
