package day3;

public class UC5_MonthlyWage {
	
    public static final int fullTimeEmp = 1;
    public static final int partTimeEmp =2;
    public static final int empRatePerHrs = 20;
    public static final int numOfWorkingDays = 20;

    public static void main(String[] args){


        int empHrs = 0;
        int total_Wage = 0;

        for (int day = 1; day <= numOfWorkingDays; day++) {
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
            total_Wage = total_Wage + empwage;
            System.out.println("day" + day);
            System.out.println("Employee Wage Is " + empwage);
        }
        System.out.println("Total Wage:"+total_Wage);
    }

}
