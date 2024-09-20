//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        double balance = 5000.0;
        double monthlyInterestRate = 0.17 / 12;
        double firstMonthInterest = balance * monthlyInterestRate;
        double secondMonthInterest = (balance + firstMonthInterest) * monthlyInterestRate;
        System.out.println("Interest after first month: " + firstMonthInterest);
        System.out.println("Interest after second month: " + secondMonthInterest);
    }