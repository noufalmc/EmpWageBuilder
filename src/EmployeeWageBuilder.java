import java.util.Random;
class Empinfo
{
    private String Company;
    private int empRatePerHour;
    private int noOfWorkingDays;
    private int maxHourPerMonth;
    private int wage;
    public Empinfo(String company,int empRatePerHour,int noOfWorkingDays,int maxHourPerMonth)
    {
        this.Company=company;
        this.empRatePerHour=empRatePerHour;
        this.noOfWorkingDays=noOfWorkingDays;
        this.maxHourPerMonth=maxHourPerMonth;
    }
    public void setTotalEmpWage(int empWage)
    {
        this.wage=empWage;
    }
    public int getNoOfWorkingDays()
    {
        return noOfWorkingDays;
    }
    public int getMaxHourPerMonth()
    {
        return maxHourPerMonth;
    }
    public int getEmpRatePerHour()
    {
        return empRatePerHour;
    }
    public String toString()
    {
        return "Company= "+Company+" Total wage= "+wage;
    }

}
class Emp  {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    private Empinfo[] empInfoArray;
     private int  noOfCompanies=0;
    public Emp()
    {
        empInfoArray=new Empinfo[5];
    }
    public void addEmpInfo(String CompanyName, int EmpRateHour, int noOfWorkingDays, int maxHourPerMonth)
    {
        empInfoArray[noOfCompanies]=new Empinfo(CompanyName,EmpRateHour,noOfWorkingDays,maxHourPerMonth);
        noOfCompanies++;
    }

    public void computeWage()
    {
        for (int i=0;i<noOfCompanies;i++)
        {
            empInfoArray[i].setTotalEmpWage(this.calcSalary(empInfoArray[i]));
            System.out.println(""+empInfoArray[i]);
        }
    }
        public int calcSalary(Empinfo empinfo)
        {
            int EMP_HOUR = 0;
            int I = 0;
            int DailyWage = 0;
            int totalWage=0;
            while ((I < empinfo.getNoOfWorkingDays()) && (EMP_HOUR < empinfo.getMaxHourPerMonth())) {
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
                DailyWage =EMP_HOUR*empinfo.getEmpRatePerHour();
                totalWage+= DailyWage;
        }
            return totalWage;
    }

}
class EmployeeWageBuilder
{
    public  static void  main(String[] args)
    {
        System.out.println("Welcome To Employee Wage Builder");
        Emp empObj=new Emp();
        empObj.addEmpInfo("Tcs",200,10,50);
        empObj.addEmpInfo("InfoSys",220,10,50);
        empObj.addEmpInfo("Airtel",150,12,50);
        empObj.addEmpInfo("DLF",180,10,50);
        empObj.computeWage();
    }
}
