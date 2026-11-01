public class SportFactory extends ClothingFactory {
    private String collectionName;
    private String season;
    private int discountPercent;
    public SportFactory(String collectionName, String season, int discountPercent,
                        String brandName, String country) {
        super(brandName, country);
        this.collectionName = collectionName;
        this.season = season;
        this.discountPercent = discountPercent;
    }
    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }
    public String getCollectionName() {
        return collectionName;
    }
    public void setSeason(String season) {
        this.season = season;
    }
    public String getSeason() {
        return season;
    }
    public void setDiscountPercent(int discountPercent) {
        if (discountPercent < 0 || discountPercent > 100) {
            this.discountPercent = 0;
        } else {
            this.discountPercent = discountPercent;
        }
    }
    public int getDiscountPercent() {
        return discountPercent;
    }
    @Override
    public Clothing createClothing() {
        registerCreated();
        return new SportClothing("бег", 150, true, 1, 3000, getBrandName());
    }
    @Override
    public Shoes createShoes() {
        registerCreated();
        return new SportShoes("гелевая", 250, false, 42, "текстиль", season);
    }
    @Override
    public Hat createHat() {
        registerCreated();
        return new SportHat("синий", true, 6, 28, discountPercent, false);
    }
    public void infoSportFactory() {
        System.out.println("Коллекция: " + collectionName + ", сезон: " + season
                + ", скидка: " + discountPercent + "%"
                + ", бренд: " + getBrandName() + ", страна: " + getCountry()
                + ", создано вещей: " + getCreatedCount());
    }
    public boolean isSaleSeason() {
        return discountPercent >= 20;
    }
    public void createFullSet() {
        createClothing();
        createShoes();
        createHat();
        System.out.println("Создан полный комплект из коллекции " + collectionName);
    }
}