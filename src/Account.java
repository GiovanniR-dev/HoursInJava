import javax.xml.crypto.dom.DOMCryptoContext;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withDrowLimit;

    public Account() {
    }

    public Account(Integer number, String holder, Double balance, Double withDrowLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withDrowLimit = withDrowLimit;
    }


    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithDrowLimit() {
        return withDrowLimit;
    }

    public void setWithDrowLimit(Double withDrowLimit) {
        this.withDrowLimit = withDrowLimit;
    }


    public void deposit(Double amount){
        if (amount<=0){
            throw new IllegalArgumentException("O valor do depósito deve ser maior que zero.");
        }
        balance+=amount;
    }

    public void WithDraw(Double amount){
        if (amount<=0){
           throw new IllegalArgumentException("O valor tem que ser maior que zero");
        }
        if (amount>withDrowLimit){
          throw new IllegalArgumentException("O valor excede o limite saque!!!!");
        }
        if (amount>balance){
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        balance-=amount;
    }
}
