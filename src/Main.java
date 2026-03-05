import taxes.DebitMinusCreditCalculator;
import taxes.SixPercentDebitCalculator;
import taxes.TaxSystem;

public class Main {

    public static void main(String[] args) {
        Company companyRoga = new Company("EASY", new TaxSystem());
        Company companyCopyta = new Company("PEASY", new TaxSystem());

        companyRoga.setTaxSystem(new DebitMinusCreditCalculator());
        companyRoga.shiftMoney(1200);
        companyRoga.shiftMoney(-600);
        companyRoga.payTaxes();

        companyCopyta.setTaxSystem(new SixPercentDebitCalculator());
        companyCopyta.shiftMoney(5400);
        companyCopyta.payTaxes();
    }
}
