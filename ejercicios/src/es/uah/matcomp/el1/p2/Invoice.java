package es.uah.matcomp.el1.p2;
import es.uah.matcomp.el1.p2.Customer;
public class Invoice {
    private int id;
    private Customer customer;
    private double amount;

    //CONSTRUCTORES
    public Invoice(int id, Customer customer, double amount){
        this.id=id;
        this.customer=customer;
        this.amount=amount;
    }

    //MÉTODOS
    public int getId(){return this.id; }
    public Customer getCustomer(){return this.customer; }
    public void setCustomer(Customer customer){this.customer=customer; }
    public double getAmount(){return this.amount; }
    public void setAmount(double amount){this.amount=amount; }
    public int getCustomerId(){return this.customer.getId(); }
    public String getCustomerName(){return this.customer.getName();}
    public int getCustomerDiscount(){return this.customer.getDiscount(); }
    public double getAmountAfterDiscount(){return this.amount*(1-this.customer.getDiscount()/100.0); }
    public String toString(){return "Invoice [id="+id+",customer="+customer+",amount="+amount;}

}
