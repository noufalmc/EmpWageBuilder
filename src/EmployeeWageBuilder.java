
import java.util.Random;
public class EmployeeWageBuilder {
    public static final int IS_FULL_TIME=1;
    public static final int IS_PART_TIME=2;
    public static final int PER_RATE_HOUR=20;
    public static final int TOTAL_WORKING_DAYS=20;
    public  static void  main(String[] args)
    {
        System.out.println("Welcome To Employee Wage Builder");
        int EMP_HOUR=0;
        int EMP_WAGES=0;
        for(int i=0;i<TOTAL_WORKING_DAYS;i++) {
            Random random = new Random();
            int empCheck = random.nextInt(3);
            switch (empCheck) {
                case IS_FULL_TIME:
                    EMP_HOUR+= 8;
                    break;
                case IS_PART_TIME:
                    EMP_HOUR+= 4;
                    break;
                default:
                    EMP_HOUR = 0;
            }
        }
        EMP_WAGES=EMP_HOUR*PER_RATE_HOUR;
        System.out.println("Daily Wages is"+EMP_WAGES);
    }
}
