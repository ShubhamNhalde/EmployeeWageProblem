package day3;

public class UC2_DailyWage {

	public static void main(String[] args) {
		
		//Constants
		int isFullTime = 1;
		int empRatePerHour = 20;
		
		//Variables
		int empHrs = 0;
		int empWage = 0;
		
		//Computation
		double empCheck = Math.floor(Math.random() * 10) % 2;
		
			if (empCheck == isFullTime)
				empHrs = 8;
			empWage = empHrs * empRatePerHour;
			System.out.println("Emp Wage: " + empWage);
	}

}
