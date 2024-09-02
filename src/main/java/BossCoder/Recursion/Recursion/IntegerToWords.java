package BossCoder.Recursion.Recursion;

public class IntegerToWords {
    public static void main(String[] args) {
        int n=1234567;
        System.out.println(noToWords(n));
    }

    public static String f(int n,String str){

        String [] ones={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve", "Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
        String tens[]= {"","", "Twenty ","Thirty ","Forty ","Fifty ","Sixty ","Seventy ","Eighty ","Ninety "};

        String ans="";
        if(n>100){
            String s= noToWords(n);
            ans+=s;
        }
        else if(n<20){
            ans+=ones[n];
        }
        else if(n>=20 && n<100){
            ans+=tens[n/10]+ones[n%10];
        }

        if (n>0){
            ans+=str;
        }

        return ans;
    }

    public static String noToWords(int n){
        String ans="";

        ans+=f(n/1000000000," Billion ");
        ans+=f((n/1000000)%100," Million ");
        ans+=f((n/1000)%1000," Thousand ");
        ans+=f((n/100)%10," Hundred ");
        ans+=f(n%100,"");
        return ans;
    }
}
