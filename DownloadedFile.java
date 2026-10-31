public class DownloadedFile extends ComputerFile {
    private String site;
    private boolean virus;
    private int power_of_virus;
    DownloadedFile(String name, int number,  double sizeKb, String whose, String path,String site, boolean virus, String format, int power_of_virus){
        super(name, number, sizeKb, whose, path, format);
        this.site = site;
        this.virus = virus;
        this.power_of_virus = power_of_virus;
    }
    public void setVirus(boolean virus) {
        this.virus = virus;
    }
    public boolean isVirus() {
        return virus;
    }
    public void setSite(String site) {
        this.site = site;
    }
    public String getSite() {
        return site;
    }
    public void setPower_of_virus(int power_of_virus) {
        if (power_of_virus < 0) {
            this.power_of_virus = 0;
        } else {
            this.power_of_virus = power_of_virus;
        }
    }
    public int getPower_of_virus() {
        return power_of_virus;

    }
    public void InfoOfViruses(){
        if (virus) {
            System.out.println("Файл заражён");
        } else {
            System.out.println("Файл безопасен");
        }
    }
    public void infect(){
        if(virus){
            System.out.println("Файл заражён");
        }else if(getSizeKb() < 1.00){
            System.out.println("Файл никак е заразить, его размер слишком мал!");
        }else{
            virus = true;
            System.out.println("Файл был успешно заражен!");
        }
    }
    public void change(int count){
        if(count + getPower_of_virus() < 0){
            System.out.println("Сила вируса не может опуститься ниже 0!");
        }else{
            power_of_virus = power_of_virus + count;
        }
    }
}
