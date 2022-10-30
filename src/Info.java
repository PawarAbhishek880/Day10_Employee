import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
public class Info {
	public final String companyname;
	public final int wageperhour;
	public int Maximumworkingdays;
	public int Maximumworkinghour;
	public int totalWage;

	public Info(String company, int empPerHrWage, int numOFWorkingDays, int totalHourPerMonth) {
		this.companyname = company;
		this.wageperhour = empPerHrWage;
		this.Maximumworkingdays = numOFWorkingDays;
		this.Maximumworkinghour = totalHourPerMonth;
	}

	public void setTotalWage(int totalWage) {
		this.totalWage = totalWage;
	}

	public String toString() {
		return "Total emp wage For " + companyname + " is: " + totalWage;
	}


	public interface IEmployeeWageCompution {
		public void addCompanyEmpWage(String company, int wagehour, int maximumworkingdays, int maximumworkinghour);

		public void empWageCompute();

		public int getTotalWage(String company);
	}

	public static class EmpWageBuilder implements IEmployeeWageCompution {

		public static final int fulltime = 1;
		public static final int parttime = 2;

		private LinkedList<Info> employeeWageComputionsList;
		private Map<String, Info> employeeWageComputionMap;

		public EmpWageBuilder() {
			employeeWageComputionsList = new LinkedList<>();
			employeeWageComputionMap = new HashMap<>();
		}

		public void addCompanyEmpWage(String company, int empPerHrWage, int numOFWorkingDays, int totalHourPerMonth) {
			Info employeeWageCompution = new Info(company, empPerHrWage,
					numOFWorkingDays, totalHourPerMonth);
			employeeWageComputionsList.add(employeeWageCompution);
			employeeWageComputionMap.put(company, employeeWageCompution);
		}

		public void empWageCompute() {
			for (int i = 0; i < employeeWageComputionsList.size(); i++) {
				Info employeeWageCompution = employeeWageComputionsList.get(i);
				employeeWageCompution.setTotalWage(this.empWageCompute(employeeWageCompution));
				System.out.println(employeeWageCompution);
			}

		}

		public int getTotalWage(String company) {
			return employeeWageComputionMap.get(company).totalWage;
		}

		public int empWageCompute(Info employeeWageCompution) {
			int empHour = 0;
			int totalEmpHrs = 0;
			int totalWorkingDays = 0;
			
			while (totalEmpHrs <= employeeWageCompution.Maximumworkinghour
					&& totalWorkingDays < employeeWageCompution.Maximumworkingdays) {
				totalWorkingDays++;
				int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
				switch (empCheck) {
				case fulltime:
					empHour = 8;
					break;
				case parttime:
					empHour = 4;
					break;
				default:
					empHour = 0;
				}
				totalEmpHrs += empHour;
				System.out.println("Day#: " + totalWorkingDays + " Emp Hr: " + empHour);
			}
			return totalEmpHrs * employeeWageCompution.wageperhour;
		}
		public static void main(String[] args) {
			IEmployeeWageCompution empWageBuilder = new EmpWageBuilder();
			empWageBuilder.addCompanyEmpWage("Bridgelabz", 60, 10, 70);
			empWageBuilder.addCompanyEmpWage("Indiamart", 80, 20, 100);
			empWageBuilder.addCompanyEmpWage("Justdial", 50, 8, 55);
			empWageBuilder.addCompanyEmpWage("Amazon", 100, 20, 60);
			empWageBuilder.empWageCompute();
			System.out.println();
			System.out.println("Total wage For Bridgelabz Company: " + empWageBuilder.getTotalWage("Bridgelabz"));
			System.out.println();
			System.out.println("Total wage For Indiamart Company: " + empWageBuilder.getTotalWage("Indiamart"));
			System.out.println();
			System.out.println("Total wage For Justdial Company: " + empWageBuilder.getTotalWage("Justdial"));
			System.out.println();
			System.out.println("Total wage For Amazon Company: " + empWageBuilder.getTotalWage("Amazon"));
			System.out.println();

		}
	}

}