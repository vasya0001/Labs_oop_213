public class SportClothing extends Clothing {
    private String sportType;
    private int weight;
    private boolean compression;

    public SportClothing(String sportType, int weight, boolean compression, int wear, int cost, String brand) {
        super(wear, cost, brand);
        this.sportType = sportType;
        this.weight = weight;
        this.compression = compression;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setSportType(String sportType) {
        this.sportType = sportType;
    }

    public void setCompression(boolean compression) {
        this.compression = compression;
    }

    public int getWeight() {
        return weight;
    }

    public boolean isCompression() {
        return compression;
    }

    public String getSportType() {
        return sportType;
    }

    public void info_sport_clothing() {
        System.out.println("Вес: " + weight + " ,  вид спорта: " + sportType + " копмрессионная: " + compression
                + " , бренд: " + getBrand() + " , цена: " + getCost() + " , износ: " + getWear());
    }

    public boolean is_light() {
        return weight < 200;
    }

    public boolean to_sport(String sport) {
        return sport.equals(sportType);
    }
    public boolean needsWash() {
        return getWear() > 3;
    }
}

