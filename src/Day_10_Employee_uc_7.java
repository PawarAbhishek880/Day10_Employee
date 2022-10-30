public class Day_10_Employee_uc_7 {
	 public static void calculateTotalWage()
	    {
	        final int parttime = 1;
	        final int fulltime = 2;
	        final int wageperhour = 20;
	        final int maximumworkingday = 20;
	        final int maximumworkinghour = 100;

	        int totalWage = 0;
	        int workinghours = 0;
	        System.out.printf("%5s     %5s     %5s     %5s\n", "Day", "Workinghours", "Wage", "Total workinghours");
	        for (int day = 1, totalworkinghours = 0; day <= maximumworkingday
	                && totalworkinghours < maximumworkinghour; day++, totalworkinghours += workinghours)
	        {

	            int employee = (int) (Math.random() * 100) % 3;
	            switch (employee)
	            {
	            case fulltime:
	                workinghours = 8;
	                break;
	            case parttime:
	                workinghours = 4;
	                break;
	            default:
	                workinghours = 0;
	                break;
	            }
	            int wage = workinghours * wageperhour;
	            totalWage += wage;
	            System.out.printf("%5d       %5d      %5d      %5d\n", day, workinghours, wage, totalworkinghours + workinghours);

	        }
	        System.out.println("Total wage for a month is " + totalWage);
	    }

	    public static void main(String args[])
	    {
	        calculateTotalWage();
	    }
}
