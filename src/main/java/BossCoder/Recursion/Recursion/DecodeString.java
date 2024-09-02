package BossCoder.Recursion.Recursion;

public class DecodeString {
    public static void main(String[] args) {
//        Input: s = "3[a2[c]]"
//        Output: "accaccacc"

        String str="3[a2[c]]";

        System.out.println(f(str));

    }
    static  int i=0;
    public static String f(String str){
        String ans="";
        int n=0;

        while (i<str.length()){
            char ch=str.charAt(i);
            if(Character.isDigit(ch)){
                n=n*10+ch-'0';
            }
            else if(ch=='['){
                i++;
                String temp=f(str);
                while (n>0){
                    ans+=temp;
                    n--;
                }
            }

            else if(Character.isAlphabetic(ch)){
                ans+=ch;
            }
            else if(ch==']'){
                break;
            }
            i++;
        }
        return  ans;
    }
}
