package interview;

import java.util.ArrayList;
import java.util.List;

public class Coding2 {
    public static void main(String[] args) {
        String str="PhonePe Private Limited Office-2, Floor-5, Wing-A, Block-A, Salarpuria Softzone, Bellandur Village, Varthur Hobli, Outer Ring Road, Bangalore South, Bangalore, Karnataka, India, 560103";

        int limit=30;
        String [] words=str.split(" ");
        int max=limit;
        List<List<String>> ans=new ArrayList<>();
        List<String> temp=new ArrayList<>();
        int k=0;
        for(int i=0;i<words.length;i++){
            k=i;
            if (max>=words[i].length()){
                temp.add(words[i]);
                max=max-words[i].length();
            }
            else {
                ans.add(temp);
                max=limit;
                temp=new ArrayList<>();
                i=k-1;
            }
        }
        ans.add(temp);

        for(List<String> list:ans){
            for(String s:list){
                System.out.print(s+" ");
            }
            System.out.println();
        }
    }
}
