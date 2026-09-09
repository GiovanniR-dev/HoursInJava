import entities.Account;
import entities.BussinesAccount;
import entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        Account x=new Account(1020,"Alex",1000.0);
        Account y=new SavingsAccount(1023,"Maria",1000.0,0.01);
        x.withdrow(50.0);
        y.withdrow(50.0);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());
    }
}