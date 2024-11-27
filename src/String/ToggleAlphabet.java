package String;

public class ToggleAlphabet {
    public static void main(String[] args) {
        String str = "AbcDeef";
        String NewStr = "";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isLowerCase(ch)){
                NewStr += Character.toUpperCase(ch);
            }
            else{
                NewStr += Character.toLowerCase(ch);
            }
        }
        System.out.println(NewStr);
    }
}
