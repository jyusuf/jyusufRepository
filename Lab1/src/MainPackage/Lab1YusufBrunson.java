package MainPackage;

//By Jama Yusuf and Trey Brunson

import java.util.Scanner;

import org.apache.poi.ss.formula.functions.FinanceLib;  

public class Lab1YusufBrunson {

	public static void main(String[] args) {
		
		System.out.println("How Many Years Do You Plan To Work?: ");
		Scanner scanner = new Scanner(System.in);
		double work = scanner.nextDouble();
		
		System.out.println("Expected average return on investment?: ");
		Scanner scanner2 = new Scanner(System.in);
		double averageReturn = scanner2.nextDouble();
		
		System.out.println("Second Expected average return on investment?: ");
		Scanner scanner3 = new Scanner(System.in);
		double averageReturn2 = scanner3.nextDouble();
		
		System.out.println("Years retired?: ");
		Scanner scanner4 = new Scanner(System.in);
		double yearsRetired = scanner4.nextDouble();
		
		System.out.println("Required income?: ");
		Scanner scanner5 = new Scanner(System.in);
		double requiredIncome = scanner5.nextDouble();
		
		System.out.println("Expected SSI income?: ");
		Scanner scanner6 = new Scanner(System.in);
		double ExpectedSSI = scanner6.nextDouble();
		
		double pv = FinanceLib.pv(averageReturn2/12, (yearsRetired * 12), (requiredIncome - ExpectedSSI), 0, false);
		double pmt = FinanceLib.pmt(averageReturn/12, (work * 12), 0, pv, false);
		System.out.println(pmt);
		
		
	}

}
