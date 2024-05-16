public class ItemProduct {
    private int idProduct;
    private String nameProduct;

    public ItemProduct(int idProduct, String nameProduct) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    @Override
    public String toString() {
        return "ItemProduct{" +
                "idProduct=" + idProduct +
                ", nameProduct='" + nameProduct + '\'' +
                '}';
    }
}
