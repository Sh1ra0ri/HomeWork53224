public class Main {
    public static void main(String[] args) {
        Gryffindor harry = new Gryffindor("HarryPotter", 90, 80, 85, 90, 95);
        Gryffindor hermione = new Gryffindor("HermioneGranger", 95, 85, 80, 85, 90);
        Gryffindor ron = new Gryffindor("RonWeasley", 80, 75, 75, 80, 85);

        Hufflepuff zachariah = new Hufflepuff("ZachariahSmith", 70, 65, 75, 80, 85);
        Hufflepuff cedric = new Hufflepuff("CedricDiggory", 85, 80, 90, 85, 90);
        Hufflepuff justin = new Hufflepuff("JustinFinchFletchley", 75, 70, 80, 75, 80);

        Ravenclaw cho = new Ravenclaw("ChoChang", 80, 75, 85, 80, 90, 85);
        Ravenclaw padma = new Ravenclaw("PadmaPatil", 85, 80, 90, 85, 80, 90);
        Ravenclaw marcus = new Ravenclaw("MarcusBelby", 75, 70, 80, 75, 85, 80);

        Slytherin draco = new Slytherin("DracoMalfoy", 85, 80, 90, 85, 95, 80, 90);
        Slytherin graham = new Slytherin("GrahamMontague", 80, 75, 85, 80, 90, 85, 80);
        Slytherin gregory = new Slytherin("GregoryGoyle", 75, 70, 80, 75, 85, 80, 85);

        System.out.println("=== Профили волшебников ===");
        hermione.displayWizardProfile();
        System.out.println();
        draco.displayWizardProfile();
        System.out.println();

        System.out.println("=== Оценка навыков факультетов ===");
        hermione.assessGryffindorSkills(ron);
        cedric.assessHufflepuffSkills(zachariah);
        cho.assessRavenclawSkills(padma);
        draco.assessSlytherinSkills(gregory);
        System.out.println();

        System.out.println("=== Сравнение волшебников ===");
        draco.evaluateWizards(zachariah, graham);
    }
}