package OperatorsAndIfStatement;

public class Task03_biggerNumber {

	public static void main(String[] args) {
		
		//Task3	
		int n1 = 11, n2 = 22, n3 = 33;
		String bigger;
		if (n2>n1 && n2>n3) {
			bigger= "n2";
		}
		else if (n1>n2 && n1>n3) {
			bigger= "n1";
		}
		else{
			bigger= "n3";
		}

System.out.println(bigger + " is bigger");
		
	/*
	int n1 = 11, n2 = 22, n3 = 33;
		int maX;
		String bigger;
		if (n2>n1 && n2>n3) {
			max=n2;
			bigger= "n2";
		}
		else if (n1>n2 && n1>n3) {
			max=n1;
			bigger= "n1";
		}
		else{
			max=n3;
			bigger= "n3";
		}
System.out.println(max + "is bigger value" );
System.out.println(bigger + " is bigger");
	*/	

		
		
		
		
		
		
		
		
		
		
		
	}
	
}
