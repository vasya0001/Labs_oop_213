public abstract class Hat {
    private int radius;
    private int discount;
    private boolean warm;

    public Hat(int radius, int discount, boolean warm){
        this.radius = radius;
        this.discount = discount;
        this.warm = warm;
    }
    public void setDiscount(int discount) {
        this.discount = discount;
    }
    public int getDiscount(){
        return discount;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }
    public void setWarm(boolean warm) {
        this.warm = warm;
    }
    public boolean isWarm() {
        return warm;
    }
    public void info_hat(){
        System.out.println("Радиус обхвата: " + radius + " , скидка: " + discount+"%, утеплена: " + warm);
    }
    public void changeDiscount(int count) {
        if (discount < count) {
            System.out.println("Недопустима отрицательная скидка!");
        } else {
            discount = discount + count;
            System.out.println("Cкидка изменена! Сейчас: " + discount+"%");
        }
    }
    public double priceWithDiscount(int price){
        price = price - price*(discount/100);
        return price;
    }

}
