package entities;

public class BussinesAccount  extends Account{

    private Double loanlimit;

    public BussinesAccount(){
        super();

    }

    public BussinesAccount(Integer number, String holder, Double balance, Double loanlimit) {
        super(number, holder, balance);
        this.loanlimit = loanlimit;
    }

    public Double getLoanlimit() {
        return loanlimit;
    }

    public void setLoanlimit(Double loanlimit) {
        this.loanlimit = loanlimit;
    }

    public void loan(double amont){
        if (amont<=loanlimit){
        balance +=amont -10.0;
        }
    }

    @Override
    public void withdrow(double amount){
        super.withdrow(amount);
        balance-=2.0;
    }

}
