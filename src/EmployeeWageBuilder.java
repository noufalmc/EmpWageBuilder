
import java.util.Random;
public class EmployeeWageBuilder {
    public  static void  main(String[] args)
    {
        System.out.println("Welcome To Employee Wage Builder");
        int IS_PRESENT=1;
        int IS_FULL_TIME=1;
        int IS_PART_TIME=2;
        int PER_RATE_HOUR=20;
        int EMP_HOUR=0;
        int EMP_WAGES=0;
        Random random=new Random();
        int empCheck=random.nextInt(3);
        if(empCheck==IS_FULL_TIME)
        {
            EMP_HOUR=8;
        }
        else if(empCheck==IS_PART_TIME)
        {
            EMP_HOUR=4;
        }
        else
        {
            System.out.println("Employye is Absent");
        }

        EMP_WAGES=EMP_HOUR*PER_RATE_HOUR;
        System.out.println("Daily Wages is"+EMP_WAGES);
    }
}
