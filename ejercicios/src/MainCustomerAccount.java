
import es.uah.matcomp.el1.p2.Account;
import es.uah.matcomp.el1.p2.Customer2;

public class MainCustomerAccount {
    public static void main(String[] args) {
        // Test Customer2 class
        Customer2 c1 = new Customer2(5555, "Alfonso", 'm');
        System.out.println(c1);
        System.out.println("id is: " + c1.getId());
        System.out.println("name is: " + c1.getName());
        System.out.println("gender is: " + c1.getGender());
        // Test Account class
        Account a1 = new Account(2222, c1, 8.8);
        System.out.println(a1);
        a1.setBalance(9.9);
        System.out.println(a1);
        System.out.println(a1);
        System.out.println("id is: " + a1.getId());
        System.out.println("balance is: " + a1.getBalance());
        System.out.println("Customer is: " + a1.getCustomer2());
        System.out.println("Customer name: " + a1.getCustomerName());
        System.out.println("Customer id: " + a1.getCustomer2().getId());
        System.out.println("Customer gender: " + a1.getCustomer2().getGender());
        System.out.println("Deposit is: " + a1.deposit(20));
        System.out.println("Withdraw is: " + a1.withdraw(20));
    }
}
