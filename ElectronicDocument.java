public class ElectronicDocument {
    // атрибуты
    private String name;
    private int number;
    private double sizeKb;

    // конструктор
    public ElectronicDocument(String name, int number, double sizeKb) {
        this.name = name;
        this.number = number;
        this.sizeKb = sizeKb;
    }

    // геттеры и сеттеры
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public double getSizeKb() {
        return sizeKb;
    }
    public void setSizeKb(double sizeKb) {
        this.sizeKb = sizeKb;
    }
    public void info() {
        System.out.println("Имя: " + name + ", номер: " + number + ", размер: " + sizeKb + " КБ");
    }
    public boolean large(double limitKb) {
        return sizeKb > limitKb;
    }
    public void rename(String newName) {
        if (newName == null || newName.isEmpty()) {
            System.out.println("Имя не может быть пустым");
        } else {
            this.name = newName;
        }
    }
}