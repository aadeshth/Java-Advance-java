package code.first.program.string;

public class ReverseString {
    public static void main(String[] args) {
        String input= "aabbc";
        char [] s = input.toCharArray();
        int half = input.length()/2;
        for(int i=0; i<half;i++)
        {
            char c = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i]=c;
        }
        System.out.println(new String(s));
    }
}
