
import java.util.Random;
public class EmployeeWageBuilder {
    public  static void  main(String[] args)
    {
        System.out.println("Welcome To Employee Wage Builder");
        int IS_PRESENT=1;
        int PER_RATE_HOUR=80;
        int EMP_HOUR=0;
        int EMP_WAGES=0;
        Random random=new Random();
        int empCheck=random.nextInt(2);
        if(empCheck==IS_PRESENT)
        {
            EMP_HOUR=8;
            System.out.println("Employee is Present");
        }
        else
        {
            System.out.println("Employee is absent");

        }
        EMP_WAGES=EMP_HOUR*PER_RATE_HOUR;
        System.out.println("Daily Wages is"+EMP_WAGES);
    }
}
