public class BusinessHat extends Hat {
    private String lining; //материал подкладки
    private boolean ribbon; //есть ли декоративная лента
    private int price; //цена
    public BusinessHat(String lining, boolean ribbon, int price,
                       int radius, int discount, boolean warm) {
        super(radius, discount, warm);
        this.lining = lining;
        this.ribbon = ribbon;
        this.price = price;
    }
    public void setLining(String lining) {
        this.lining = lining;
    }
    public String getLining() {
        return lining;
    }
    public void setRibbon(boolean ribbon) {
        this.ribbon = ribbon;
    }
    public boolean isRibbon() {
        return ribbon;
    }
    public void setPrice(int price) {
        if (price < 0) {
            this.price = 0;
        } else {
            this.price = price;
        }
    }
    public int getPrice() {
        return price;
    }
    public void infoBusinessHat() {
        System.out.println("Подкладка: " + lining + ", лента: " + ribbon
                + ", цена: " + price
                + ", радиус: " + getRadius() + ", скидка: " + getDiscount() + "%"
                + ", утеплена: " + isWarm());
    }
    public boolean isLuxury() {
        return price > 5000 && "шёлк".equals(lining);
    }
    public double finalPrice() {
        return price - price * getDiscount() / 100.0;
    }
}