package String;

public class Count_Vowel_Coso {
    public static void main(String[] args) {
        String str = "This is how we work";
        int vowel = 0;
        int consonent = 0;
        for(int i=0;i<str.length();i++){
          char ch = Character.toLowerCase(str.charAt(i));
          if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') vowel++;
          else consonent++ ;
        }

        System.out.println("Vowel count = "+vowel);
        System.out.println("Conso count = "+consonent);
    }
}


