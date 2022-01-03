
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
    public String Tostring()
    {
        return "Company= "+company+" Total wage= "+totalWage;
    }
}
class EmployeeWageBuilder
{
    public  static void  main(String[] args)
    {
        System.out.println("Welcome To Employee Wage Builder");
        Emp obj1=new Emp("TCS",200,4,20);
        obj1.computeWage();
        System.out.println(obj1.Tostring());
        Emp obj2=new Emp("Infosys",250,4,20);
        obj2.computeWage();
        System.out.println(obj2.Tostring());

    }
}
