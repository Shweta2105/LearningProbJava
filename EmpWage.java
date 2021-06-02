package comPackage;

public class EmpWage {
	   public static final int IS_FULLTIME=1;
	   public static final int IS_PARTTIME=2;
	   private final String company;
	   private static int empWagePerHr;
	   private static int Max_Working_Days;
	   private static int Max_Working_Hrs;
	   private int total_Emp_Wage;
	   
	
	   
	   
	public EmpWage(String company, int empWagePerHr, int Max_Working_Days, int Max_Working_Hrs)
	{
	   this.company = company;
	   this.empWagePerHr = empWagePerHr;
	   this.Max_Working_Days = Max_Working_Days;
	   this.Max_Working_Hrs = Max_Working_Hrs;
	}

	public void Wages()
	{
		int empHr=0, total_Emp_Hrs=0, totalWorkingDays=0;
		  while(total_Emp_Hrs<=Max_Working_Hrs && totalWorkingDays<=Max_Working_Days)
	      {
	         totalWorkingDays++;
	         double empCheck= Math.floor(Math.random()*10)%3;
	         System.out.println(empCheck);

	         switch ((int)empCheck)
	         {
	            case IS_FULLTIME:
	               System.out.println("Employee is Present");
	               empHr=8;
	               break;
	            case IS_PARTTIME:

	              System.out.println("Parttime");
	               empHr=4;
	               break;
	            default:
	              System.out.println("Employee is Absent");
	               empHr=0;
	         }
	         total_Emp_Hrs += empHr;
	         System.out.println(totalWorkingDays);
	         System.out.println("Day#: "+ totalWorkingDays + "Emp Hr: " +empHr);
	         System.out.println(total_Emp_Hrs);
	      }
		  total_Emp_Wage=total_Emp_Hrs*empWagePerHr;
		 // System.out.println("Total emp wage for company "+company+ " is ="+total_Emp_Wage);
		  
	}
	@Override
	public String toString() {
		
		return "total emp wage for company : "+company+ "is :" + total_Emp_Wage;
		
	}
	
	 public static void main(String[] args) {

		EmpWage dMart = new EmpWage("Dmart",20, 20, 100);
		EmpWage Reliance = new EmpWage("Reliance",15,25,80);
		//int totalWage = Wages("dMart",20,20,100);
		
		//System.out.println(totalWage);
	    dMart.Wages(); 
	    Reliance.Wages();
	    
	    System.out.println(dMart);
	    System.out.println(Reliance);
	   }
	}


