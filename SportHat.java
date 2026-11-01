public class SportHat extends Hat {
    private String color; //цвет
    private boolean visor; //козырек
    private int ventHoles; //число отверстий
    public SportHat(String color, boolean visor, int ventHoles,
                    int radius, int discount, boolean warm) {
        super(radius, discount, warm);
        this.color = color;
        this.visor = visor;
        this.ventHoles = ventHoles;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setVisor(boolean visor) {
        this.visor = visor;
    }
    public boolean isVisor() {
        return visor;
    }
    public void setVentHoles(int ventHoles) {
        if (ventHoles < 0) {
            this.ventHoles = 0;
        } else {
            this.ventHoles = ventHoles;
        }
    }
    public int getVentHoles() {
        return ventHoles;
    }
    public void infoSportHat() {
        System.out.println("Цвет: " + color + ", козырёк: " + visor
                + ", вентиляционных отверстий: " + ventHoles
                + ", радиус: " + getRadius() + ", скидка: " + getDiscount() + "%"
                + ", утеплена: " + isWarm());
    }
    public boolean protectsFromSun() {
        return visor && !isWarm();
    }
    public boolean isWellVentilated() {
        return ventHoles >= 4;
    }
}