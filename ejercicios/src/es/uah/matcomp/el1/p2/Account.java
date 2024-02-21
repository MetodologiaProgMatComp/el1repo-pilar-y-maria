package es.uah.matcomp.el1.p2;
import es.uah.matcomp.el1.p2.Customer2;
public class Account {
    private int id;
    private Customer2 customer;
    private double balance=0.0;

    public Account(int id, Customer2 customer, double balance){
        this.id=id;
        this.customer=customer;
        this.balance=balance;
    }
    public Account(int id, Customer2 customer){
        this.id=id;
        this.customer=customer;
    }
    public int getId(){
        return this.id;
    }
    public Customer2 getCustomer2(){
        return this.customer;
    }
    public double getBalance(){
        return this.balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public String toString(){
        return customer.getName()+"("+customer.getId()+") balance= $"+balance;
    }
    public String getCustomerName(){
        return customer.getName();
    }
    public double deposit(double amount){
        return balance+amount;
    }
    public double withdraw(double amount){
        if (balance>=amount){
            balance-=amount;
        }
        else{
            System.out.println("Amount withdrawn exceeds the current balance!");
        }
        return balance;
    }

}
