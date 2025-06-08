public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int powerHunger;

    public Slytherin(String name, int spellStrength, int teleportRange,
                     int cunning, int determination, int ambition,
                     int resourcefulness, int powerHunger) {
        super(spellStrength, teleportRange);
        this.cunning = Math.max(0, Math.min(100, cunning));
        this.determination = Math.max(0, Math.min(100, determination));
        this.ambition = Math.max(0, Math.min(100, ambition));
        this.resourcefulness = Math.max(0, Math.min(100, resourcefulness));
        this.powerHunger = Math.max(0, Math.min(100, powerHunger));
    }

    @Override
    public void displayWizardProfile() {
        System.out.println("Студент Слизерина: " + getClass().getSimpleName());
        System.out.println("Сила заклинаний: " + retrieveSpellStrength());
        System.out.println("Дальность телепортации: " + retrieveTeleportRange());
        System.out.println("Хитрость: " + cunning);
        System.out.println("Решительность: " + determination);
        System.out.println("Амбициозность: " + ambition);
        System.out.println("Находчивость: " + resourcefulness);
        System.out.println("Жажда власти: " + powerHunger);
    }

    public void assessSlytherinSkills(Slytherin other) {
        int thisScore = cunning + determination + ambition + resourcefulness + powerHunger;
        int otherScore = other.cunning + other.determination + other.ambition +
                other.resourcefulness + other.powerHunger;

        String thisName = getClass().getSimpleName();
        String otherName = other.getClass().getSimpleName();

        if (thisScore > otherScore) {
            System.out.println(thisName + " является лучшим слизеринцем, чем " + otherName);
        } else if (thisScore < otherScore) {
            System.out.println(otherName + " является лучшим слизеринцем, чем " + thisName);
        } else {
            System.out.println(thisName + " и " + otherName + " равно хорошие слизеринцы");
        }
    }
}