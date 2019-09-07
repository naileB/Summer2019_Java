package tugba.week1;

import java.util.Scanner;

public class SeckinHello {

	public static void main(String[] args) {
		/* burada String değişkenler tanımlayarak ekrana 
		  yazdırma işlemi yapacağız
		 */
		String name, surname;
		Scanner sc =new  Scanner(System.in);
		System.out.println("ad gir:");
		name=sc.next();
		System.out.println("soyad gir:");
		surname=sc.next();
		System.out.println("Merhaba "+" "+name+" "+surname);
		
	}

}
