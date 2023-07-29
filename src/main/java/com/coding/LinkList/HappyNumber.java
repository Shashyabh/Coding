package com.coding.LinkList;
import java.util.Scanner;
public class HappyNumber {
    public int findSquare(int val){
        int sum=0;
        while (val>0){
            int rem=val%10;
            sum=sum+rem*rem;
            val=val/10;
        }
        return sum;
    }
    public boolean happyNumber(int no){
        int slow=no;
        int fast=slow;
        do{
            slow=findSquare(slow);
            fast=findSquare(findSquare(fast));
        }
        while (slow!=fast);
        if (slow==1){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        HappyNumber sl=new HappyNumber();
        System.out.println("\nEnter your happy number\t\t");
        Scanner sc=new Scanner(System.in);
        int val=sc.nextInt();
        System.out.println(sl.happyNumber(val));
    }
}
