public abstract class Clothing {
    private int wear;
    private int cost;
    private String brand;

    public Clothing(int wear,int cost,String brand){
        this.wear = wear;
        this.cost = cost;
        this.brand = brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public int getCost() {
        return cost;
    }
    public void setWear(int wear) {
        this.wear = wear;
    }
    public int getWear() {
        return wear;
    }
    public void info(){
        System.out.println("Бренд: " + brand + " , износ: " + wear + " цена: "+cost);
    }
    public void changeCost(int count){
        if(cost + count < 0){
            System.out.println("Цена ниже нуля!");
        }else{
            cost = cost + count;
            System.out.println("Цена изменена, новая цена: " + cost);
        }
    }
    public void wear_check(){
        if(wear > 5){
            System.out.println("Сильный износ!");
        }else{
            System.out.println("Хорошее состояние");
        }
    }

}
