package edu.handong.csee.java.lab08;//package name
/**Overloading class help understand overload.
 * Input of getAverage (double , double ) must two double variable method.
 * Input of getAverage (double , double ,  double ) must three double variable method.
 * Input of getAverage (char , char ) is two character variable method.
 * These methods name is same, but parameter is different.
 */
import java.util.Scanner;//use scanner class
public class Overloading {//class name

	public static void main(String[] args) {//call main method
		// TODO Auto-generated method stub
		double average1 = Overloading.getAverage (40.0, 50.0);//input two double variable
		double average2 = Overloading.getAverage (1.0, 2.0, 3.0);//input three double variable
        char average3 = Overloading.getAverage ('a', 'c');//input two character variable
        System.out.println ("average1 = " + average1);//print average1
        System.out.println ("average2 = " + average2);//print average2
        System.out.println ("average3 = " + average3);//print average3

	}
	public static double getAverage (double first, double second)//input two double variable method.
	    {
	        return (first + second) / 2.0;//return average of two variable
	    }
	
	public static double getAverage (double first, double second,  double third)//input three double variable method.
	    {
	        return (first + second + third) / 3.0;//return average of three variable
	    }


	public static char getAverage (char first, char second)//input two char variable method.
	    {
	        return (char) (((int) first + (int) second) / 2);//change char to integer and return average of two variable. change result to char
	    }

    

}
