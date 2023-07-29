package com.Ikshita;

import javax.sound.midi.Soundbank;

public class CalculatingCGPA {
    public static void main(String args[]){
        float sub1 = 90;
        float sub2 = 92;
        float sub3 = 98;
        float avg = (sub1+sub2+sub3)/3;
        float CGPA = avg/10;
        System.out.print("the CGPA for the given subjects will be ");
        System.out.print(CGPA);
    }
}
