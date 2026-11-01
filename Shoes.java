public abstract class Shoes {
    private int size;
    private String material;
    private String season;

    public Shoes(int size, String material, String season){
        this.size = size;
        this.material = material;
        this.season = season;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public int getSize() {
        return size;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public String getMaterial() {
        return material;
    }
    public void setSeason(String season) {
        this.season = season;
    }
    public String getSeason() {
        return season;
    }
    public boolean CheckSize(int count){
        return count==size;
    }
    public void ToWinter(){
        if("Winter".equals(season)){
            System.out.println("Да, эта обувь предназначена для зимы!");
        }else{
            System.out.println("Это обувь не для зимы!");
        }
    }
    public void shoes_info(){
        System.out.println("Размер обуви: " + size + " , матреиал: " + material + " , сезон:" + season);
    }
}
