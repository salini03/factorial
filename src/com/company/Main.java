package com.company;

public class Main {

    public static void main(String[] args) {

        int i,fact=1;
        int number=5;
        for (i=1;i<=number;i++)
        {
            fact=fact*i;

        }

        
        System.out.println("factoril is" +fact);
          int result=fact1(number);
        System.out.println("factorial is "+fact1(number));

}
    static int fact1 (int n){
        if(n==0){
            retuit in}
        else {
            return(n*fact1(n-1));

        }

    }
}