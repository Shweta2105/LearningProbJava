package comPackage;

public class EmpWage {
	   public static final int IS_FULLTIME=1;
	   public static final int IS_PARTTIME=2;
	   
	   private static int empWagePerHr;
	   private static int Max_Working_Days;
	   private static int Max_Working_Hrs;
	   
	   


	public static int Wages(String company,int empWagePerHr, int Max_Working_Days, int Max_Working_Hrs)
	{
		int empHr=0,total_Emp_Wage=0, total_Emp_Hrs=0, totalWorkingDays=0;
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
	         System.out.println(total_Emp_Hrs);
	      }
		  total_Emp_Wage=total_Emp_Hrs*empWagePerHr;
		  System.out.println("Total emp wage for company "+company+ " is ="+total_Emp_Wage);
		  return total_Emp_Wage;
	}
	 public static void main(String[] args) {

		
		int totalWage = Wages("dMart",20,20,100);
		
		System.out.println(totalWage);
	    
	   }
	}

