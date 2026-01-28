package practice1;

public class task5 {

	public static void main(String[] args) {
        double balance = 100000; 
        double interestRate = 0.05; 

        double interest = balance * interestRate;
        double newBalance = balance + interest;

        System.out.println("Initial balance: " + balance);
        System.out.println("Interest added: " + interest);
        System.out.println("New balance: " + newBalance);

	}

}
