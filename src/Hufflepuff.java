public class Hufflepuff extends Hogwarts {
    private int hardWork;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int spellStrength, int teleportRange,
                      int hardWork, int loyalty, int honesty) {
        super(spellStrength, teleportRange);
        this.hardWork = Math.max(0, Math.min(100, hardWork));
        this.loyalty = Math.max(0, Math.min(100, loyalty));
        this.honesty = Math.max(0, Math.min(100, honesty));
    }

    @Override
    public void displayWizardProfile() {
        System.out.println("Студент Пуффендуя: " + getClass().getSimpleName());
        System.out.println("Сила заклинаний: " + retrieveSpellStrength());
        System.out.println("Дальность телепортации: " + retrieveTeleportRange());
        System.out.println("Трудолюбие: " + hardWork);
        System.out.println("Верность: " + loyalty);
        System.out.println("Честность: " + honesty);
    }

    public void assessHufflepuffSkills(Hufflepuff other) {
        int thisScore = hardWork + loyalty + honesty;
        int otherScore = other.hardWork + other.loyalty + other.honesty;

        String thisName = getClass().getSimpleName();
        String otherName = other.getClass().getSimpleName();

        if (thisScore > otherScore) {
            System.out.println(thisName + " является лучшим пуффендуйцем, чем " + otherName);
        } else if (thisScore < otherScore) {
            System.out.println(otherName + " является лучшим пуффендуйцем, чем " + thisName);
        } else {
            System.out.println(thisName + " и " + otherName + " равно хорошие пуффендуйцы");
        }
    }
}