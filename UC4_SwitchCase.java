package day3;

public class UC4_SwitchCase {
	//Constants
	public static final int isPartTime = 1;
	public static final int isFullTime = 2;
	public static final int empRatePerHrs = 20;
	
	public static void main(String[] args) {
		
		//Variables
		int empHrs = 0;
		int empWage = 0;
		
		//Computation
		int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		
		switch (empCheck) {
				case isFullTime :
					empHrs = 8;
					break;
			 	case isPartTime :
			 		empHrs = 4;
			 		break;
			 	default:	
			 		empHrs = 0;
		    } 	
			empWage = empHrs * empRatePerHrs;
			System.out.println("Emp Wage: " + empWage);
	}
}
