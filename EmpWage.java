public class EmpWage {
	public static void main(String[] args) {
	   int IS_FULLTIME=1;
      double empCheck=Math.floor(Math.random()*10)%2;
		System.out.println(empCheck);
      if (empCheck==IS_FULLTIME)
      {
         System.out.println("Employee is Present");
      }
      else
      {
         System.out.println("Employee is Absent");
      }
   }
}


