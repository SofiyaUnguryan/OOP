public class Main {
    public static void main(String[] args) {
        GryffindorStudents harryPotter = new GryffindorStudents("Гарри", "Поттер", 89, 90, 100, 100, 99);
        GryffindorStudents hermioneGranger = new GryffindorStudents("Гермиона", "Грейнджер", 95, 87, 99, 99, 99);
        GryffindorStudents ronWeasley = new GryffindorStudents("Рон", "Уизли", 80, 86, 94, 96, 100);
        HufflepuffStudents zachariahSmith = new HufflepuffStudents("Захария", "Смит", 70, 100, 98, 95, 100);
        HufflepuffStudents cedricDiggory = new HufflepuffStudents("Седрик", "Диггори", 93, 83, 100, 100, 100);
        HufflepuffStudents justinFinchFletchley = new HufflepuffStudents("Джастин", "Финч-Флетчли", 76, 50, 88, 90, 77);
        RavenclawStudents zhouChang = new RavenclawStudents("Чжоу", "Чанг", 80, 86, 90, 98, 83, 100);
        RavenclawStudents padmaPatil = new RavenclawStudents("Падма", "Патил", 81, 82, 100, 96, 80, 92);
        RavenclawStudents marcusBelby = new RavenclawStudents("Маркус", "Белби", 85, 90, 87, 100, 72, 89);
        SlytherinStudents dracoMalfoy = new SlytherinStudents("Драко", "Малфой", 86, 92, 90, 68, 100, 84, 100);
        SlytherinStudents grahamMontagu = new SlytherinStudents("Грэхем", "Монтегю", 90, 100, 92, 85, 100, 90, 100);
        SlytherinStudents gregoryGoyle = new SlytherinStudents("Грегори", "Гойл", 74, 75, 57, 90, 80, 78, 95);
        System.out.println(dracoMalfoy);
        ronWeasley.whosBetter(padmaPatil);
        zachariahSmith.whosBetterHufflepuff(cedricDiggory);
        harryPotter.whosBetterGryffindor(hermioneGranger);
        zhouChang.whosBetterRavenclaw(marcusBelby);
        grahamMontagu.whosBetterSlytherin(gregoryGoyle);
    }
}