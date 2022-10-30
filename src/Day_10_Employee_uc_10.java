public class Day_10_Employee_uc_10 {
	public final String companyname;
	public final int wageperhour;
	public int Maximumworkingdays;
	public int Maximumworkinghours;
	public int totalWage;

	public Day_10_Employee_uc_10(String company, int wagehour, int maximumworkingdays, int maximumworkinghour) {
		this.companyname = company;
		this.wageperhour = wagehour;
		this.Maximumworkingdays = maximumworkingdays;
		this.Maximumworkinghours = maximumworkinghour;
	}

	public void setTotalEmpWage(int totalWage) {
		this.totalWage = totalWage;
	}

	public String toString() {
		return "Total emp wage For " + companyname + "  " + totalWage;
	}
	public static class EmpWageBuilder {

		public final int fulltime = 1;
		public final int parttime = 2;

		private int numberofCompanies = 0;
		private Day_10_Employee_uc_10[] employeeWageArray;

		public EmpWageBuilder() {
			employeeWageArray = new Day_10_Employee_uc_10[5];
		}

		private void addCompanyEmpWage(String company, int wagehour, int maximumworkingdays, int maximumworkinghour) {
			employeeWageArray[numberofCompanies] = new Day_10_Employee_uc_10(company, wagehour,
					maximumworkingdays, maximumworkinghour);
			numberofCompanies++;
		}
		private void empWageCompute() {
			for (int i = 0; i < numberofCompanies; i++) {
				employeeWageArray[i].setTotalEmpWage(this.empWageCompute(employeeWageArray[i]));
				System.out.println(employeeWageArray[i]);
			}

		}
		private int empWageCompute(Day_10_Employee_uc_10 employeeWage) {
			int empHour = 0;
			int totalEmpHrs = 0;
			int totalWorkingDays = 0;
			
			while (totalEmpHrs <= employeeWage.Maximumworkinghours
					&& totalWorkingDays < employeeWage.Maximumworkingdays) {
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
				System.out.println("----------------------------------");
				System.out.println( "Day#"+ totalWorkingDays + " Emp Hr: " + empHour);
			}
			return totalEmpHrs * employeeWage.wageperhour;
		}
			public static void main(String[] args) {
				EmpWageBuilder empWage = new EmpWageBuilder();
				empWage.addCompanyEmpWage("Bridgelabz", 60, 10, 70);
				empWage.addCompanyEmpWage("Indiamart", 80, 20, 100);
				empWage.addCompanyEmpWage("Justdial", 50, 8, 55);
				empWage.addCompanyEmpWage("Amazon", 100, 20, 60);
				empWage.empWageCompute();
				System.out.println();
		}
	}
}
