public class Day_10_Employee_uc_2 {

	public static void main(String args[])
	    {
	         int fulltime = 1;
	         int wageperhour = 20;
	        int employee = (int)(Math.random()*100)%2;
	        int workinghour= 0;
	        if (employee == fulltime)
	        {
	            System.out.println("employee present");
	            workinghour = 8;
	        } else
	        {
	            System.out.println("employee absent");
	        }
	        int wage = workinghour*wageperhour;
	        System.out.println("daily employee wage=" + wage);
	    }
}
