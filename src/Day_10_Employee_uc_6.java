public class Day_10_Employee_uc_6 {
	 public static void main(String args[])
	    {
	        final int parttime = 1;
	        final int fulltime = 2;
	        final int wageperhour = 20;
	        final int maximumworkingdays = 20;
	        final int maximumworkinghour = 100;

	        int totalWage = 0;
	        int workinghour = 0;
	        System.out.printf("%5s     %5s     %5s     %5s\n", "Day", "workinghours", "wage", "Total workinghours");
	        for (int day = 1, totalworkinghour = 0; day <= maximumworkingdays
	                && totalworkinghour < maximumworkinghour; day++, totalworkinghour += workinghour)
	        {

	            int employee = (int) (Math.random() * 100) % 3;
	            switch (employee)
	            {
	            case fulltime:
	                workinghour = 8;
	                break;
	            case parttime:
	                workinghour = 4;
	                break;
	            default:
	                workinghour = 0;
	                break;
	            }
	            int wage = workinghour * wageperhour;
	            totalWage += wage;
	            System.out.printf("%5d       %5d      %5d      %5d\n", day, workinghour, wage, totalworkinghour + workinghour);

	        }
	        System.out.println("Total wage for a month is " + totalWage);
	    }
}
