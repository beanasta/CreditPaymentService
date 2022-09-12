public class CreditPaymentService {

    public double calculate (int loanAmount, int loanDurationYears, double interestRate) {

        int a = loanAmount;
        int n = (loanDurationYears*12);
        double i = ((interestRate)/12);
        double monthlyPayment = a*(Math.pow((1+i),n)*i)/((Math.pow((1+i),n))-1);

        return (monthlyPayment);


    }


}
