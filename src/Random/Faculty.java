package Random;

public class Faculty extends Employee implements TaxCalculator {
    private String initial;
    private int monthlySalary;
    private int yearlyBonus;


    public Faculty(int id, String name, int age, String initial, int monthlySalary, int yearlyBonus) {
        super(id, name, age);
        this.initial = initial;
        this.monthlySalary = monthlySalary;
        if(yearlyBonus <=0){
            throw new IllegalArgumentException("Can't create with a negative yearly bonus");
        }
        else{
            this.yearlyBonus = yearlyBonus;
        }
    }

    public String getInitial() {
        return initial;
    }
    public void setInitial(String initial) {
        this.initial = initial;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }
    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
    public int getYearlyBonus() {
        return yearlyBonus;
    }
    public void setYearlyBonus(int yearlyBonus) {
        if(yearlyBonus <=0){
            throw new IllegalArgumentException("Can't create with a negative yearly bonus");
        }
        else{this.yearlyBonus = yearlyBonus;}
    }

    @Override
    public int yearlySalary() {
        return monthlySalary * 12;
    }

    @Override
    public int yearlyIncome() {
        if (yearlyBonus < 0) {
            throw new IllegalArgumentException("Can't create with a negative yearly bonus");

        } else {
            return yearlySalary() + getYearlyBonus();

        }
    }

    @Override
    public double yearlyIncomeTax() {

        if (yearlyBonus < 0) {
            throw new IllegalArgumentException("Can't create with a negative yearly bonus");
        } else {
            return yearlyIncome() * TAX_PERCENTENT / 100;
        }

    }


    @Override
    public double yearlyIncomeWithoutTax() {

        if (yearlyBonus < 0) {
            throw new IllegalArgumentException("Can't create with a negative yearly bonus");
        } else {
            return yearlyIncome() - yearlyIncomeTax();
        }
    }

    @Override
    public String toString() {
        return "Faculty [initial: " + initial + " , monthlySalary: " + monthlySalary + " , yearlyBonus: " + yearlyBonus + " ,yearlySalary: "+ yearlySalary() + " ,yearlyIncome: " +yearlyIncome() +" ,yearlyIncomeTax: "+yearlyIncomeTax() +" ,yearlyIncomeWithoutTax: "+yearlyIncomeWithoutTax() + " ]";
    }
}