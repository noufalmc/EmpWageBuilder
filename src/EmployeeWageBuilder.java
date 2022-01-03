
import java.util.Random;

class Emp {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    private final String company;
    private final int empRateHour;
    private final int noOfWorkingDays;
    private final int maxHourPerMonth;
    private int totalWage;
    public Emp(String CompanyName, int EmpRateHour, int noOfWorkingDays, int maxHourPerMonth) {
        this.company = CompanyName;
        this.empRateHour = EmpRateHour;
        this.noOfWorkingDays = noOfWorkingDays;
        this.maxHourPerMonth = maxHourPerMonth;
    }

    public void computeWage() {
        int EMP_HOUR = 0;
        int I = 0;
        int DailyWage = 0;
        totalWage=0;
        while ((I < noOfWorkingDays) && (EMP_HOUR < maxHourPerMonth)) {
            Random random = new Random();
            int empCheck = random.nextInt(3);
            switch (empCheck) {
                case IS_FULL_TIME:
                    EMP_HOUR = 8;
                    break;
                case IS_PART_TIME:
                    EMP_HOUR = 4;
                    break;
                default:
                    EMP_HOUR = 0;
            }
            I++;
            DailyWage =EMP_HOUR*empRateHour;
            totalWage+= DailyWage;
        }
    }
    public String toString()
    {
        return "Company= "+company+" Total wage= "+totalWage;
    }
}
class EmployeeWageBuilder
{
    public  static void  main(String[] args)
    {
        System.out.println("Welcome To Employee Wage Builder");
        Emp Tcs=new Emp("TCS",200,4,20);
        Tcs.computeWage();
        System.out.println(Tcs);
        Emp Infosys=new Emp("Infosys",250,4,20);
        Infosys.computeWage();
        System.out.println(Infosys);

    }
}
