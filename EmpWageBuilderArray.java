package comPackage;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class EmpWageBuilderArray implements IComputeWage {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	private int numOfCompany = 0;

	private LinkedList<CompanyWage> companyWageList;
	private Map<String, CompanyWage> companyWageMap;

	public EmpWageBuilderArray() {
		companyWageList = new LinkedList<>();
		companyWageMap = new HashMap<>();
	}


	public int getTotalWage(String company) {
		return companyWageMap.get(company).totalEmpwage;
	}

	private int computeEmpWage(CompanyWage companyEmpWage) {

		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		while (totalEmpHrs <= companyEmpWage.maxHoursPerMonth && totalWorkingDays < companyEmpWage.numOfWorkingDays) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;

			switch (empCheck) {

			case IS_PART_TIME:

				empHrs = 4;

				break;

			case IS_FULL_TIME:

				empHrs = 8;
				break;
			default:

				empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day: " + totalWorkingDays + " Emp Hr: " + empHrs);
		}
		return totalEmpHrs * companyEmpWage.empRatePerHour;
	}

	public static void main(String[] args) {

		EmpWageBuilderArray empWageBuilder = new EmpWageBuilderArray();
		empWageBuilder.addCompanyEmpWage("DMart ", 28, 20, 50);
		empWageBuilder.addCompanyEmpWage("Reliance", 10, 25, 80);
		empWageBuilder.computeEmpWage();
	}

	@Override
	public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		// TODO Auto-generated method stub
		CompanyWage companyEmpWage = new CompanyWage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
		companyWageList.add(companyEmpWage);
		companyWageMap.put(company, companyEmpWage);
		
	}

	@Override
	public void computeEmpWage() {
		// TODO Auto-generated method stub
		for (int i = 0; i < companyWageList.size(); i++) {

			CompanyWage companyWage = companyWageList.get(i);
			companyWage.setTotalEmpWage(this.computeEmpWage(companyWage));
			System.out.println(companyWage);
		}
		
	}

}
