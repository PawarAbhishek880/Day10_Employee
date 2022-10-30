

public class Day_10_Employee_uc_3 {
	 public static void main(String args[])
	    {
	         int parttime = 1;
	         int fulltime = 2;
	         int wageperhour = 20;
	        int employee = (int)(Math.random()*100)%3;
	        int workinghour = 0;
	        if (employee == fulltime)
	        {
	            System.out.println("employee present fulltime");
	            workinghour = 8;
	        } else if (employee == parttime)
	        {
	            System.out.println("employee  present parttime");
	            workinghour = 4;
	        } else
	        {
	            System.out.println("employee  absent");
	        }
	        int wage = workinghour*wageperhour;
	        System.out.println("Daily employee Wage = "+ wage);
	    }
}
