public class Day_10_Employee_uc_8 {
	  public static void calculateTotalWage(String companyName, int wageperhour, int maximumworkingdays, int maximumworkinghour)
	    {
	        final int parttime = 1;
	        final int fulltime = 2;
	        int totalWage = 0;
	        int workinghours = 0;

	        System.out.println("company enquiry="+companyName);
	        System.err.println("wageperhour:" + wageperhour);
	        System.out.println("Maximumworkingdays:" + maximumworkingdays);
	        System.out.println("Maximumworkinghours:" + maximumworkinghour);
	        System.out.printf("%5s     %5s     %5s     %5s\n", "Day", "Workinghour", "wage", "Total workinghours");

	        for (int day = 1, totalworkinghours = 0; day <= maximumworkingdays
	                && totalworkinghours <= maximumworkinghour; day++, totalworkinghours += workinghours)
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
	        System.out.println("Total wage for a month of " + companyName + " employee is " + totalWage + "\n");
	    }
	    public static void main(String args[])
	    {
	        calculateTotalWage("Brigelabz", 30, 20, 200);
	        calculateTotalWage("Indiamart", 20, 10, 100);
	        calculateTotalWage("justdial" , 10,  5,  50);
	    }
}
