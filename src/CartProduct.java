public class CartProduct {
    private String nameProduct;
    private int quantityBuy;

    public CartProduct(String nameProduct, int quantityBuy) {
        this.nameProduct = nameProduct;
        this.quantityBuy = quantityBuy;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setQuantityBuy(int quantityBuy) {
        this.quantityBuy = quantityBuy;
    }

    public int getQuantityBuy() {
        return quantityBuy;
    }

    @Override
    public String toString() {
        return "CartProduct{" +
                "nameProduct='" + nameProduct + '\'' +
                ", quantityBuy=" + quantityBuy +
                '}';
    }
}
