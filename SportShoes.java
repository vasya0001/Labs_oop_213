public class SportShoes extends Shoes {
    private String cushioning; //ароматизация(тип)
    private int weight; //вес
    private boolean waterproof; //водонепроницаемость

    public SportShoes(String cushioning, int weight, boolean waterproof,
                      int size, String material, String season) {
        super(size, material, season);
        this.cushioning = cushioning;
        this.weight = weight;
        this.waterproof = waterproof;
    }

    public void setCushioning(String cushioning) {
        this.cushioning = cushioning;
    }

    public String getCushioning() {
        return cushioning;
    }

    public void setWeight(int weight) {
        if (weight < 0) {
            this.weight = 0;
        } else {
            this.weight = weight;
        }
    }
    public int getWeight() {
        return weight;
    }
    public void setWaterproof(boolean waterproof) {
        this.waterproof = waterproof;
    }
    public boolean isWaterproof() {
        return waterproof;
    }

    public void infoSportShoes() {
        System.out.println("Амортизация: " + cushioning + ", вес: " + weight
                + " г, водонепроницаемые: " + waterproof
                + ", размер: " + getSize() + ", материал: " + getMaterial()
                + ", сезон: " + getSeason());
    }

    public boolean isLight() {
        return weight < 300;
    }

    public boolean suitsRunning() {
        return isLight() && "Summer".equals(getSeason());
    }

}
