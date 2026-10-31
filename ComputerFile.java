public class ComputerFile extends ElectronicDocument{
    private String whose;
    private String path;
    private String format;
    public ComputerFile(String name, int number, double sizeKb, String whose, String path, String format) {
        super(name, number, sizeKb);
        this.whose = whose;
        this.path = path;
        this.format = format;
    }
    public void setPath(String path) {
        this.path = path;
    }
    public String getPath() {
        return path;
    }
    public void setWhose(String whose) {
        this.whose = whose;
    }
    public String getWhose() {
        return whose;
    }
    public void setFormat(String format) {
        this.format = format;
    }
    public String getFormat() {
        return format;
    }
    public void from_to(){
        System.out.println("От " + whose + " к " + path);
    }
    public void checkTxt() {
        if (format.equals("txt")) {
            System.out.println("Это текстовый файл");
        } else {
            System.out.println("Это не текстовый файл");
        }
    }
    public void numberSize() {
        if (getNumber() > 5000) {
            setSizeKb(getSizeKb() * 2);
        }
    }
}

