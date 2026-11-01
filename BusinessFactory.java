public class BusinessFactory extends ClothingFactory {
    private String collectionName;
    private String dressStyle;
    private int priceLevel;
    public BusinessFactory(String collectionName, String dressStyle, int priceLevel,
                           String brandName, String country) {
        super(brandName, country);
        this.collectionName = collectionName;
        this.dressStyle = dressStyle;
        this.priceLevel = priceLevel;
    }
    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }
    public String getCollectionName() {
        return collectionName;
    }
    public void setDressStyle(String dressStyle) {
        this.dressStyle = dressStyle;
    }
    public String getDressStyle() {
        return dressStyle;
    }
    public void setPriceLevel(int priceLevel) {
        if (priceLevel < 1 || priceLevel > 5) {
            this.priceLevel = 1;
        } else {
            this.priceLevel = priceLevel;
        }
    }
    public int getPriceLevel() {
        return priceLevel;
    }
    @Override
    public Clothing createClothing() {
        registerCreated();
        return new BusinessClothing(dressStyle, true, 4, 1, 5000 * priceLevel, getBrandName());
    }
    @Override
    public Shoes createShoes() {
        registerCreated();
        return new BusinessShoes(30, "чёрный", true, 42, "кожа", "Winter");
    }
    @Override
    public Hat createHat() {
        registerCreated();
        return new BusinessHat("шёлк", true, 3000 * priceLevel, 29, 10, true);
    }
    public void infoBusinessFactory() {
        System.out.println("Коллекция: " + collectionName + ", стиль: " + dressStyle
                + ", уровень цен: " + priceLevel
                + ", бренд: " + getBrandName() + ", страна: " + getCountry()
                + ", создано вещей: " + getCreatedCount());
    }
    public boolean isPremium() {
        return priceLevel >= 4;
    }
    public void createFullSet() {
        createClothing();
        createShoes();
        createHat();
        System.out.println("Создан полный деловой комплект из коллекции " + collectionName);
    }
}