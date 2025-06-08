public abstract class Hogwarts {
    private int spellStrength;
    private int teleportRange;

    public Hogwarts(int spellStrength, int teleportRange) {
        this.spellStrength = Math.max(0, Math.min(100, spellStrength));
        this.teleportRange = Math.max(0, Math.min(100, teleportRange));
    }

    public int retrieveSpellStrength() {
        return spellStrength;
    }

    public int retrieveTeleportRange() {
        return teleportRange;
    }

    public void evaluateWizards(Hogwarts wizard1, Hogwarts wizard2) {
        String name1 = wizard1.getClass().getSimpleName();
        String name2 = wizard2.getClass().getSimpleName();

        if (wizard1.retrieveSpellStrength() > wizard2.retrieveSpellStrength()) {
            System.out.println(name1 + " обладает большей силой заклинаний, чем " + name2);
        } else if (wizard1.retrieveSpellStrength() < wizard2.retrieveSpellStrength()) {
            System.out.println(name2 + " обладает большей силой заклинаний, чем " + name1);
        } else {
            System.out.println(name1 + " и " + name2 + " имеют равную силу заклинаний");
        }
    }

    public abstract void displayWizardProfile();
}