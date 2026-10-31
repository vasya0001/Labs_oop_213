public class Main {
    public static void main(String[] args) {
        //1-й класс
        ElectronicDocument doc = new ElectronicDocument("Отчёт", 1, 250.5);
        doc.info();
        doc.setName("Главный");
        System.out.println(doc.getName());
        doc.setNumber(111);
        System.out.println(doc.getNumber());
        doc.setSizeKb(2.5);
        System.out.println(doc.getSizeKb());
        System.out.println(doc.large(1.5));
        doc.rename("Second");
        doc.info();
        //2-ой класс
        ComputerFile cf = new ComputerFile("Договор", 7000, 120.0, "Аня", "C:/docs/contract.txt", "txt");
        cf.info();
        cf.from_to();
        cf.checkTxt();
        cf.numberSize();
        cf.info();
        //3-й класс
        DownloadedFile d = new DownloadedFile("Игра", 7, 500.0, "Аня", "C:/g.exe",
                "http://site.com", false, "exe", 3);
        d.infect();
        d.change(-10);
        d.change(5);
        d.info();
    }

}
