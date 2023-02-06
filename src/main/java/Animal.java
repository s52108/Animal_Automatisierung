public class Animal {

    private String name;

    public Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    private int age;

    private String species;

    private String animalloud;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getAnimalloud() {
        return animalloud;
    }

    public void setAnimalloud(String animalloud) {
        this.animalloud = animalloud;
    }

    public String giveAnimalLoud() {

        switch (species) {
            case "cat":
                return "miau";

            case "dog":
                return "wuff";

            case "lion":
                return "roar";

            default:
                return "We no speak animal.";

        }


    }

    public String getNameAndAge() {
        return name + " | " + age;
    }

    public String ageCategory() {
        if (age <= 2) {
            return "Baby Animal";
        } else if (age <= 4) {
            return "Young Animal";
        } else {
            return "Old Animal";
        }

    }
}
