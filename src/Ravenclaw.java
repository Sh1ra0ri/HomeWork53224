public class Ravenclaw extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, int spellStrength, int teleportRange,
                     int intelligence, int wisdom, int wit, int creativity) {
        super(spellStrength, teleportRange);
        this.intelligence = Math.max(0, Math.min(100, intelligence));
        this.wisdom = Math.max(0, Math.min(100, wisdom));
        this.wit = Math.max(0, Math.min(100, wit));
        this.creativity = Math.max(0, Math.min(100, creativity));
    }

    @Override
    public void displayWizardProfile() {
        System.out.println("Студент Когтеврана: " + getClass().getSimpleName());
        System.out.println("Сила заклинаний: " + retrieveSpellStrength());
        System.out.println("Дальность телепортации: " + retrieveTeleportRange());
        System.out.println("Интеллект: " + intelligence);
        System.out.println("Мудрость: " + wisdom);
        System.out.println("Остроумие: " + wit);
        System.out.println("Творчество: " + creativity);
    }

    public void assessRavenclawSkills(Ravenclaw other) {
        int thisScore = intelligence + wisdom + wit + creativity;
        int otherScore = other.intelligence + other.wisdom + other.wit + other.creativity;

        String thisName = getClass().getSimpleName();
        String otherName = other.getClass().getSimpleName();

        if (thisScore > otherScore) {
            System.out.println(thisName + " является лучшим когтевранцем, чем " + otherName);
        } else if (thisScore < otherScore) {
            System.out.println(otherName + " является лучшим когтевранцем, чем " + thisName);
        } else {
            System.out.println(thisName + " и " + otherName + " равно хорошие когтевранцы");
        }
    }
}