public class BusinessShoes extends Shoes {
    private int heelHeight; //высота каблука
    private String color; //цвет
    private boolean laces; //есть ли шнурки или нет
    public BusinessShoes(int heelHeight, String color, boolean laces,
                         int size, String material, String season) {
        super(size, material, season);
        this.heelHeight = heelHeight;
        this.color = color;
        this.laces = laces;
    }
    public void setHeelHeight(int heelHeight) {
        if (heelHeight < 0) {
            this.heelHeight = 0;
        } else {
            this.heelHeight = heelHeight;
        }
    }
    public int getHeelHeight() {
        return heelHeight;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setLaces(boolean laces) {
        this.laces = laces;
    }
    public boolean isLaces() {
        return laces;
    }
    public void infoBusinessShoes() {
        System.out.println("Каблук: " + heelHeight + " мм, цвет: " + color
                + ", шнурки: " + laces
                + ", размер: " + getSize() + ", материал: " + getMaterial()
                + ", сезон: " + getSeason());
    }
    public boolean isHighHeel() {
        return heelHeight > 50;
    }
    public boolean suitsOffice() {
        return ("чёрный".equals(color) || "коричневый".equals(color)) && "leather".equals(getMaterial());
    }
}