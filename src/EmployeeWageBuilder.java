
import java.util.Random;
class Employee
{
    public static final int IS_FULL_TIME=1;
    public static final int IS_PART_TIME=2;
    public static final int PER_RATE_HOUR=100;
    public static final int TOTAL_WORKING_DAYS=20;
    public static  final int TOTAL_WORKING_HOURS=100;
    int EMP_HOUR=0;
    int EMP_WAGE=0;
    int I=0;
    public void  CalcHour()
    {

        while( (I<20) && (EMP_HOUR<TOTAL_WORKING_HOURS))
        {
            Random random = new Random();
            int empCheck = random.nextInt(3);
            switch (empCheck) {
                case IS_FULL_TIME:
                    EMP_HOUR+=8;
                    break;
                case IS_PART_TIME:
                    EMP_HOUR+=4;
                    break;
                default:
                    EMP_HOUR+=0;
            }
            I++;
        }

    }
}
public class EmployeeWageBuilder
{
    public  static void  main(String[] args)
    {
        System.out.println("Welcome To Employee Wage Builder");
        Employee emp=new Employee();
        emp.CalcHour();
        System.out.println("MONTH Salary is = "+emp.EMP_HOUR*emp.PER_RATE_HOUR);
        System.out.println("EMP Hour is"+emp.EMP_HOUR);
        System.out.println("Day  is "+emp.I);

    }
}
