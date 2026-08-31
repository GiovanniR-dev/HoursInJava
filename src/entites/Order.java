package entites;

import entities.enums.OrderStatus;

import java.util.Date;

public class Order {

    private Integer id;
    private Date momente;
    private OrderStatus status;


    public Order(Integer id, Date momente, OrderStatus status) {
        this.id=id;
        this.momente=momente;
        this.status=status;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMomente() {
        return momente;
    }

    public void setMomente(Date momente) {
        this.momente = momente;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", momente=" + momente +
                ", status=" + status +
                '}';
    }
}
