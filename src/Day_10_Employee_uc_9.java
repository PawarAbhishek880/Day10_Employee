public class Day_10_Employee_uc_9 {
	    final int parttime = 1;
	    final int fulltime = 2;
	    
	    final String companyname;
	    final int wageperhour;
	    final int Maximumworkingdays;
	    final int Maximumworkinghours;
	    
	    int totalWage;

	    Day_10_Employee_uc_9(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs)
	    {
	        companyname = companyName;
	        wageperhour = wagePerHr;
	        Maximumworkingdays = maxWorkingDays;
	        Maximumworkinghours = maxWorkingHrs;
	        totalWage = 0;
	    }

	    int generateEmployeeType()
	    {
	        return (int) (Math.random() * 100) % 3;
	    }

	    int getWorkingHrs(int employee)
	    {
	        switch (employee)
	        {
	            case fulltime:
	                return 8;
	            case parttime:
	                return 4;
	            default:
	                return 0;
	        }
	    }

	    void calculateTotalWage()
	    {
	        System.out.println("Computation of total wage of " + companyname + " employee");
	        System.out.println("-----------------------------------------------------");
	        System.out.printf("%5s     %5s     %5s     %5s\n", "Day", "Workinghrs", "Wage", "Total working hrs");
	        int workingHrs;
	        for (int day = 1, totalWorkingHrs = 0; day <= Maximumworkingdays
	                && totalWorkingHrs <= Maximumworkinghours; day++, totalWorkingHrs += workingHrs)
	        {
	            int empType = generateEmployeeType();
	            workingHrs = getWorkingHrs(empType);
	            int wage = workingHrs * wageperhour;
	            totalWage += wage;
	            System.out.printf("%5d       %5d      %5d      %5d\n", day, workingHrs, wage, totalWorkingHrs + workingHrs);
	        }

	    }

	    public String toString()
	    {
	        System.out.println("Information of " + companyname + " employee");
	        System.out.println("-----------------------------------------------------");
	        System.out.println("Wage per hour:" + wageperhour);
	        System.out.println("Maximum working days:" + Maximumworkingdays);
	        System.out.println("Maximum working hours:" + Maximumworkinghours);
	        return "Total wage for a month of " + companyname + " employee is " + totalWage + "\n";
	    }

	    public static void main(String args[])
	    {
	        Day_10_Employee_uc_9 bridgelabz = new 	 Day_10_Employee_uc_9("bridgelabz", 10, 20, 100);
	        Day_10_Employee_uc_9 indiamart = new Day_10_Employee_uc_9("indiamart", 5, 30, 2000);

	        bridgelabz.calculateTotalWage();
	        System.out.println(bridgelabz);

	        indiamart.calculateTotalWage();
	        System.out.println(indiamart);
	    }
	}

