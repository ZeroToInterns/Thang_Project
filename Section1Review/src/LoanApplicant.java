
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
		if(annualSalary > 100000) { //check to see if applicant makes more than 100,000
			return true;
		}
		else if(annualSalary > 50000 && annualSalary <= 100000 && yearsOnJob >= 2) { //check to see if applicant make less than 100,000 , more than 50,000 but work more than 2 years
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
		if (years <= 0) {
			this.yearsOnJob = 0;
		}
		this.yearsOnJob = years;
	}
	
	//return the applicant's years on the job
	public int getYearsOnJob() {
		return this.yearsOnJob;
	}
	
	//set a new annual salary for the applicant
	public void setAnnualSalary(double salary) {
		if (salary <= 0) {
			this.annualSalary = 0;
		}
		this.annualSalary = salary;
	}
	
	
}
