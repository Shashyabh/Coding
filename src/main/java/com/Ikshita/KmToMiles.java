package com.Ikshita;

import com.coding.All.FirstLetterPrinting;

import java.util.Scanner;

public class KmToMiles {
    public static void main(String args[]){
        //float km = 1;
        //float mile = .62f;
        //float kM = 10;
        //float miLe = 10*.62f;
       //System.out.println(miLe);
        Scanner sc = new Scanner(System.in);
        System.out.println("Kilometer to miles");
        float km1 = 1;
        float mile1 = .62f;
        System.out.println("Enter kilometer");
        float input = sc.nextFloat();
        System.out.println(input*mile1);
    }
}
