public abstract class ClothingFactory {
    private String brandName;
    private String country;
    private int createdCount;
    public ClothingFactory(String brandName, String country) {
        this.brandName = brandName;
        this.country = country;
        this.createdCount = 0;
    }
    public abstract Clothing createClothing();
    public abstract Shoes createShoes();
    public abstract Hat createHat();

    public String getBrandName() { return brandName; }
    public void setBrandName(String brandName) { this.brandName = brandName; }
    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }
    public int getCreatedCount() { return createdCount; }
    public void setCreatedCount(int createdCount) { this.createdCount = createdCount; }
    public void registerCreated() {
        createdCount++;
    }
    public void resetCounter() {
        createdCount = 0;
    }
    public void factoryInfo() {
        System.out.println("Фабрика: " + brandName + ", страна: " + country
                + ", создано вещей: " + createdCount);
    }
}