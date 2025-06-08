public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int spellStrength, int teleportRange,
                      int nobility, int honor, int bravery) {
        super(spellStrength, teleportRange);
        this.nobility = Math.max(0, Math.min(100, nobility));
        this.honor = Math.max(0, Math.min(100, honor));
        this.bravery = Math.max(0, Math.min(100, bravery));
    }

    @Override
    public void displayWizardProfile() {
        System.out.println("Студент Гриффиндора: " + getClass().getSimpleName());
        System.out.println("Сила заклинаний: " + retrieveSpellStrength());
        System.out.println("Дальность телепортации: " + retrieveTeleportRange());
        System.out.println("Благородство: " + nobility);
        System.out.println("Честь: " + honor);
        System.out.println("Храбрость: " + bravery);
    }

    public void assessGryffindorSkills(Gryffindor other) {
        int thisScore = nobility + honor + bravery;
        int otherScore = other.nobility + other.honor + other.bravery;

        String thisName = getClass().getSimpleName();
        String otherName = other.getClass().getSimpleName();

        if (thisScore > otherScore) {
            System.out.println(thisName + " является лучшим гриффиндорцем, чем " + otherName);
        } else if (thisScore < otherScore) {
            System.out.println(otherName + " является лучшим гриффиндорцем, чем " + thisName);
        } else {
            System.out.println(thisName + " и " + otherName + " равно хорошие гриффиндорцы");
        }
    }
}