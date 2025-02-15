class OrderItem {
    private StockItem item;
    private int quantity;

    public OrderItem(StockItem item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public StockItem getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalPrice() {
        return item.getPrice() * quantity;
    }
}
