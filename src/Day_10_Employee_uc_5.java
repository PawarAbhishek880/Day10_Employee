public class Day_10_Employee_uc_5 {

	public static void main(String args[]) {

		final int parttime = 1;
		final int fulltime = 2;
		final int wageperhour = 20;
		final int workinghour = 20;

	        int totalWage = 0;
	        for (int day = 1; day <= workinghour; day++)

			{
	            int employee = (int) (Math.random() * 100) % 3;
	            int workingHours =0;

				switch (employee)
	            {
	                case fulltime:
	                    workingHours = 8;
	                    break;
	                case parttime:
	                    workingHours = 4;
	                    break;
	                default:
	            }
	            int wage = workingHours*wageperhour;
	            System.out.println("Day " + day + " wage is:" + wage);
	            totalWage += wage;
	        }
	        System.out.println("Total wage for a month is " + totalWage);
	    }
}
