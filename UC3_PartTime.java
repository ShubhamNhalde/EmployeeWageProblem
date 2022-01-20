package day3;

public class UC3_PartTime {
	
	public static void main(String[] args) {
		
		//Constants
		int isPartTime = 1;
		int isFullTime = 2;
		int empRatePerHrs = 20;
		
		//Variables
		int empHrs = 0;
		int empWage = 0;
		
		//Computation
		double empCheck = Math.floor(Math.random() * 10) % 3;
		
			if (empCheck == isFullTime)
				empHrs = 8;
			else if (empCheck == isPartTime)
				empHrs = 4;
			empWage = empHrs * empRatePerHrs;
			System.out.println("Emp Wage: " + empWage);
	}

}
