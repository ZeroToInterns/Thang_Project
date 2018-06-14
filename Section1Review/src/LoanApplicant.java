
public class LoanApplicant {
	//instance variable for the class loan applicant
	private double annualSalary;
	private int yearsOnJob;
	
	public static void main(String[] arg) {
		LoanApplicant person = new LoanApplicant(29000, 5);
		System.out.println(person.qualifies());
	}
	
	//constructor for the loan applicant class
	public LoanApplicant(double annualSalary, int yearsOnJob) {
		this.annualSalary = annualSalary;
		this.yearsOnJob = yearsOnJob;
	}
	
	//check to see if the applicant is qualify for loan
	public boolean qualifies() {
		if(annualSalary > 100000) {
			return true;
		}
		else if(annualSalary > 50000 && annualSalary <= 100000 && yearsOnJob >= 2) {
			return true;
		}
		else if (annualSalary > 30000 && annualSalary <= 50000 && yearsOnJob >= 5) {
			return true;
		}
		else {
			return false;
		}
	}

	//set a new year on job
	public void setYearsOnJob(int years) {
		this.yearsOnJob = years;
	}
	
	//return the applicant's years on the job
	public int getYearsOnJob() {
		return this.yearsOnJob;
	}
	
	//set a new annual salary for the applicant
	public void setAnnualSalary(double salary) {
		this.annualSalary = salary;
	}
	
	
}
