import java.util.Date;

public class Warehouse {
    private int idWareHouse;
    private Date date;
    private int quantity;

    public Warehouse(int idWareHouse, Date date, int quantity) {
        this.idWareHouse = idWareHouse;
        this.date = date;
        this.quantity = quantity;
    }

    public int getIdWareHouse() {
        return idWareHouse;
    }

    public Date getDate() {
        return date;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "idWareHouse=" + idWareHouse +
                ", date=" + date +
                ", quantity=" + quantity +
                '}';
    }
}
