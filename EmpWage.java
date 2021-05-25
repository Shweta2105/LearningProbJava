public class EmpWage {
	public static final int IS_FULLTIME=1;
   public static final int IS_PARTTIME=2;
	public static final int empWagePerHr=20;
	public static final int Max_Working_Days=20;

	public static void main(String[] args) {

		
		int empHr=0,total_Emp_Wage=0;
		for(int day=0; day<=Max_Working_Days; day++)
		{
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
			int wage=empWagePerHr*empHr;
			total_Emp_Wage=total_Emp_Wage+wage;
			System.out.println(wage);
		}
		System.out.println(total_Emp_Wage);

	}
}

