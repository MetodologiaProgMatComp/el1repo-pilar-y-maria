package es.uah.matcomp.el1.p1;

public class Account {
    private String id;
    private String name;
    private int balance;
    //CONSTRUCTORES
    public Account(String id, String name){
        this.id=id;
        this.name=name;
    }
    public Account(String id, String name, int balance){
        this.id=id;
        this.name=name;
        this.balance=balance;
    }

    //MÉTODOS
    public String getID(){return this.id;}
    public String getName(){return this.name;}
    public int getBalance(){return this.balance;}
    public int credit(int amount){this.balance+= amount; return this.balance;}
    public int debit(int amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return this.balance; // Devolver el saldo actualizado después de la operación de débito
    }

    public int transferTo (Account destinationAccount, int amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            destinationAccount.credit(amount);
        } else {
            System.out.println("Amount exceeded balance");
        }
        return this.balance; }
    public String toString(){return "Account[id="+id+",name="+name+",balance="+balance+"]";}


}
