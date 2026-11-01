public class BusinessClothing extends Clothing {
    private String dressCode;
    private boolean formal;
    private int pocketsCount;
    public BusinessClothing(String dressCode, boolean formal, int pocketsCount,
                            int wear, int cost, String brand) {
        super(wear, cost, brand);
        this.dressCode = dressCode;
        this.formal = formal;
        this.pocketsCount = pocketsCount;
    }
    public void setDressCode(String dressCode) {
        this.dressCode = dressCode;
    }
    public String getDressCode() {
        return dressCode;
    }
    public void setFormal(boolean formal) {
        this.formal = formal;
    }
    public boolean isFormal() {
        return formal;
    }
    public void setPocketsCount(int pocketsCount) {
        if (pocketsCount < 0) {
            this.pocketsCount = 0;
        } else {
            this.pocketsCount = pocketsCount;
        }
    }
    public int getPocketsCount() {
        return pocketsCount;
    }
    public void infoBusinessClothing() {
        System.out.println("Дресс-код: " + dressCode + ", строгая: " + formal
                + ", карманов: " + pocketsCount
                + ", бренд: " + getBrand() + ", цена: " + getCost() + ", износ: " + getWear());
    }
    public boolean isOfficeReady() {
        return formal && getWear() <= 5;
    }
    public boolean suitsDressCode(String code) {
        return code != null && code.equals(dressCode);
    }
}