public class EmpWage {
	public static void main(String[] args) {
	   int IS_FULLTIME=1;
		int IS_PARTTIME=2;
		int empWagePerHr=20;
		int empHr;
      double empCheck=Math.floor(Math.random()*10)%3;
		System.out.println(empCheck);
      if (empCheck==IS_FULLTIME)
      {
         System.out.println("Employee is Present");
			empHr=8;
      }
      else if(empCheck==IS_PARTTIME)
		{
			System.out.println("Parttime");
			empHr=4;
		}
		else
      {
         System.out.println("Employee is Absent");
			empHr=0;
      }
		int wage=empWagePerHr*empHr;
		System.out.println(wage);

   }
}


