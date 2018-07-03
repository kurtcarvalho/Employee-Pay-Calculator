import java.util.Scanner;


public class getDetails {
	
	
	
	//==========================================================================	
	
	public static boolean checkHours(double hours, boolean stmt) {
		
	Scanner reader = new Scanner(System.in);
	Scanner in = new Scanner(System.in);
		
	if (hours < 20 || hours > 60) {
		stmt = false;
		return stmt;
		};
	stmt = true;
	return stmt;
	};
	
	//===========================================================================
	
	public static boolean checkEmpID (String EmpID, boolean stmt) {
		
		Scanner reader = new Scanner(System.in);
		Scanner in = new Scanner(System.in);
		
		if (EmpID.matches("[0-9]{5}")) {
			stmt = true;
			return stmt;
			};
		stmt = false;
		return stmt;
		};
		
	//============================================================================
		
	public static boolean checkEmpType(String EmpType, boolean stmt) {
	
	Scanner reader = new Scanner(System.in);
	Scanner in = new Scanner(System.in);

	if ((EmpType.contains("C") || EmpType.contains("P") || EmpType.contains("F")) && EmpType.length() == 1) {
		stmt = true;
		return stmt;
		};
	stmt = false;
	return stmt;
	};
	
	//=============================================================================
	
	public static boolean getRate(String EmpType, double rate, boolean stmt) {

	Scanner reader = new Scanner(System.in);
	Scanner in = new Scanner(System.in);
	
		switch (EmpType) {
		case "C": 
			if (rate >= 20 && rate <= 35) 
				{
				stmt = true;
				}
			else
			{
				stmt = false;
			}
			return stmt;
		case "P": 
			{
			if (rate >= 30 && rate <= 45) 
				{
					stmt = true;
				}
			else 
				{
					stmt = false;
				}	
			return stmt;
			}
		case "F": 
			if (rate >= 35 && rate <= 50) 
				{ 
					stmt = true;
				}
			else
				{
					stmt = false;
				}
			return stmt;
		default: 
				{
					return false;
				}	
		}
	};
	
	//============================================================================
	public static void printDetails(String EmpID, String EmpType, double rate, double hours) {
		
		double WeeklyPay = (rate * hours);
		
		System.out.println("Employee ID: " + EmpID + ", Employee Type: " + EmpType + ", Employee Rate: " + rate);
		System.out.println("This Weeks Wage is: $" + WeeklyPay);
	}
	
	
	//=============================================================================
	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		Scanner in = new Scanner(System.in);
	
	boolean stmt = false;
	System.out.println("Enter the Employee ID (5 Digits): ");
	String EmpID = in.nextLine();
	stmt = checkEmpID(EmpID, stmt);
	
	while (stmt == false) {
		System.out.println("Enter the Employee ID (Must be a 5 Digit number): ");
		EmpID = in.nextLine();
		stmt = checkEmpID(EmpID, stmt);
		};
	
	//==============================================================================
	
	System.out.println("Enter the number of hours worked: (20 - 60 Hours) ");
	double hours = 0;
	if (hours == 0){
	while (true) {
	try{
		hours = reader.nextDouble();
		break;
	}
	catch(Exception e){
		reader.nextLine();
		System.out.println("Please enter a valid input");
		
			};
		}
	}
	stmt = false;
	stmt = checkHours(hours, stmt);
	
	while (stmt == false) {
		System.out.println("Enter the number of hours (Must be between 20 - 60 Hours): ");
		hours = reader.nextDouble();
		stmt = checkHours(hours, stmt);
		continue;
		};
	
	//===============================================================================
	
	System.out.println("Enter Employee Type (C,P,F): ");
	String EmpType = in.next();
	stmt = false;
	stmt = checkEmpType(EmpType, stmt);
	while (stmt == false) {
		System.out.println("Enter Employee Type (Must be C,P,F): ");
		EmpType = in.next();
		stmt = checkEmpType(EmpType, stmt);
		};
	
	//==============================================================================
	
	
	System.out.println("Enter Rate: ");
	double rate = 0;
	if (rate == 0) {
	while (true) {
	try {
		rate = reader.nextDouble();
		break;
	}
	catch (Exception e) {
		reader.nextLine();
		System.out.println("Please Enter a Valid Number: ");
			};
		};
	};
	stmt = getRate(EmpType, rate, stmt);
	
	while (stmt == false) {
		System.out.println("Rate for type C must be between 20 - 35 \n"
							+ "Rate for type P must be between 30 - 45 \n"
							+ "Rate for type F must be between 35 - 50 \n"
							+ "Enter Rate: ");
		rate = reader.nextDouble();
		stmt = getRate(EmpType, rate, stmt);
		
		}
	
	

	
	
	
	//===============================================================================
	
	printDetails(EmpID, EmpType, rate, hours);
	reader.close();
	}

	
}
