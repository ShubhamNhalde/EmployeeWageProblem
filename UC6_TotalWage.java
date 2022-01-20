package day3;

public class UC6_TotalWage {
	
	public static final int fullTimeEmp = 1;
    public static final int partTimeEmp = 2;
    public static final int empRatePerHrs = 20;
    public static final int numOfWorkingDays = 20;
    public static final int maxHrsPerMonth = 100;

    public static void main(String[] args) {


        int empHrs = 0;
        int total_Wage = 0;
        int totalHrs = 0;

        int day = 1;
        while (day <= numOfWorkingDays && totalHrs < maxHrsPerMonth) {
            double empcheck = Math.floor(Math.random() * 10) % 3;

            switch ((int) empcheck) {
                case fullTimeEmp:
                    empHrs = 8;
                    break;
                case partTimeEmp:
                    empHrs = 4;
                    break;

                default:
                    empHrs = 0;
            }
            int empwage;
            empwage = empHrs * empRatePerHrs;

            totalHrs += empHrs;
            total_Wage += empwage;

            System.out.println("day" + day);
            System.out.println("Employee Wage Is " + empwage);
            day++;


    }

            System.out.println("Total Hrs:" + totalHrs);
        System.out.println("Total Wage:"+total_Wage);
    }

}
