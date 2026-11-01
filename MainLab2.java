public class MainLab2 {
    public static void main(String[] args) {
        // 1. Спортивная фабрика
        ClothingFactory factory = new SportFactory("Весна", "Summer", 25, "SportLine", "Германия");
        Clothing c = factory.createClothing();
        Shoes s = factory.createShoes();
        Hat h = factory.createHat();
        c.info();
        s.shoes_info();
        h.info_hat();
        factory.factoryInfo();
        factory = new BusinessFactory("Осень", "офис", 4, "Office", "Италия");
        c = factory.createClothing();
        s = factory.createShoes();
        h = factory.createHat();
        c.info();
        s.shoes_info();
        h.info_hat();
        factory.factoryInfo();
    }
}