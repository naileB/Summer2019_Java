package Asignments;

public class ArithmaticOperatorsTask {
public static void main(String[] args) {
	
//	1.  Write a Java program that will print a sum of two numbersPlease use variables to store num1,num2,and sumSample output:46 + 90 = 136
	
	int num1 = 46;
	int num2 = 90;
	int sumSample = num1 + num2;	
	
	System.out.println(sumSample);
	
	//2.  Write a Java program to convert Fahrenheit to CelciusF=9*C/5+32
	
	int Celcius = 30;
	
	int Fahrenheit = (9 *Celcius) / 5 + 32;
	
	System.out.println(Fahrenheit);
	
	//3. Write a Java program that converts mile to km1 mile = 1.609344 km
	
	
	double mile1 = 1;
	double mile = 1.609344 ;
	double km = mile1 * mile;
	System.out.println(km);
	
	
	
	
	//task1
	
	double Pi = 3.14;
	double Radius = 5.5;
	double Perimeter = 2 * Radius * Pi;
	
	System.out.println(Perimeter);
	
	//2.   Write a Java program that displays the area of a rectangle with a width of 4.5 and a height of 7.9 using the following formula:area = width * height
	
	double width = 4.5;
	double height = 7.9;
	double area = width * height;
			
		System.out.println(area);	
			
		//3.  Write a Java program that calculates the average of 3 numbers.	
		int a = 10; 
		int b = 20;
		int c = 30;
		int Average = (a+b+c) /3;
		
		System.out.println(Average);
		
		
		//task1
		double pies=10,people=4;
		double piesPerson;
		piesPerson=pies/people;
		System.out.println(piesPerson);//2.0
		
		//task2
		//int pies=10,people=4;
		//double piesPerson;
		piesPerson=(double)pies/people;
		System.out.println(piesPerson);//2.5
		
		//task3
		//int pies=10,people=4;
		//double piesPerson;
		piesPerson=pies/(double)people;
		System.out.println(piesPerson);//2.5
		
		//task4
				
		/*
		//int pies=10,people=4;
		//double piesPerson;
		piesPerson=double(pies/people);
		System.out.println(piesPerson); hata verdi
		 */	
		
	
		
		//task	
	int Num1Num2;
	Num1Num2=(int)(7.9) + (int)(6.7);		
	System.out.println(Num1Num2);	//1. 13
	
	Num1Num2=(int)(7.9+6.7);
	System.out.println(Num1Num2);	//2. 14
	
	double Num3;
	Num3=(double)(17);	
	System.out.println(Num3);  //3. 17.0	
	
	double Num4;
	Num4=(double)(8+3);
	System.out.println(Num4);	//4. 11.0
	
	double Num5;
	Num5=(double)(7)/2;
	System.out.println(Num5);	//5. 3.5
		
	double Num6;
	Num6=(double)(7/2);
	System.out.println(Num6);	//6. 3.0
		
	double Num7;	
	Num7=(7.8+(double)(15)/2);	
	System.out.println(Num7); //7. 15.3
		
		
			
		
	
	
	
}
}
	