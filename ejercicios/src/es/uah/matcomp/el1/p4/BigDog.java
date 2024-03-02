package es.uah.matcomp.el1.p4;

public class BigDog extends Dog {
    public BigDog(String name){
        super(name);
    }

    @Override
    public String greets(){
        return "Wooow";
    }

    @Override
    public String greets(Dog another){
        return "Woooooow";
    }

    public String greets(BigDog another){
        return "Woooooooow";
    }
}
