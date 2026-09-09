import entities.Account;
import entities.BussinesAccount;
import entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        Account acc1=new Account(1001,"Alex",1000.0);
        acc1.withdrow(200);
        System.out.println(acc1.getBalance());

        Account acc2=new SavingsAccount(1002,"ana",1000.0,0.01);
        acc2.withdrow(200);
        System.out.println(acc2.getBalance());

        Account acc3=new BussinesAccount(1003,"bob",1000.0,500.0);
        acc3.withdrow(200.0);
        System.out.println(acc3.getBalance());
    }
}