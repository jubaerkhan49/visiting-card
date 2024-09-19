package com.example.visitingcard;

    /**
    * This class is responsible for calculation of numbers
    */

public class test {
    public int num1, num2, sum;
    public test(){

    }

    /**
     * This method sets up the attributes of the class
     * @param x is the number 1
     * @param y is the number 2
     */
    public void setter(int x, int y){
        num1 = x;
        num2 = y;
    }

    /**
     * This method returns the sum of two numbers
     * @return The sum of numbers
     */
    public int getter(){
        return num1+num2;
    }


        /**
         * This method prints all numbers in the class
         */
    public void printThis(){
        System.out.println("This is print function"+num1+" "+num2);
    }
}
