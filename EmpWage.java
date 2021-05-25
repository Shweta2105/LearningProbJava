public class EmpWage {
	public static void main(String[] args) {
	   int IS_FULLTIME=1;
		int empWagePerHr=20;
		int empHr;
      double empCheck=Math.floor(Math.random()*10)%2;
		System.out.println(empCheck);
      if (empCheck==IS_FULLTIME)
      {
         System.out.println("Employee is Present");
			empHr=8;
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


