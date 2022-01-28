package Random;

public interface TaxCalculator {
    int TAX_PERCENTENT = 15;

    double yearlyIncomeTax();

    double yearlyIncomeWithoutTax();
}