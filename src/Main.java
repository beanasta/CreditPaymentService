public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        int loanAmount = 1_000_000;

        int loanDurationYears = 3;

        double interestRate = 0.0999;

        double monthlyPayment = service.calculate (loanAmount, loanDurationYears, interestRate);

        System.out.println(monthlyPayment);




    }
}
