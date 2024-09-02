package BossCoder.Recursion.Recursion;

public class ReverseSubstring_Btn_Parentheses {
    public static void main(String[] args) {
        System.out.println(f("(u(love)i)"));
    }

    static int i=0;
    public static String f(String s){
        StringBuilder sb = new StringBuilder();
        while(i<s.length()){
            char ch=s.charAt(i);
            if(ch=='('){
                i++;
                String temp=f(s);
                sb.append(temp);
            }
            else if(ch==')'){
                i++;
                return sb.reverse().toString();
            }
            else{
                i++;
                sb.append(ch);;
            }

        }

        return sb.toString();
    }
}
