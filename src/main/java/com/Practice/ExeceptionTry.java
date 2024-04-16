package com.Practice;

public class ExeceptionTry {
    public static void main(String[] args) {
        try {
            int i=10/0;
        }

        catch (ArithmeticException e){
            System.out.println("Arithmetic");
        }
        catch (Exception e){
            System.out.println("Exception");
        }
        finally {
            System.out.println("Finally");
        }
    }
}
