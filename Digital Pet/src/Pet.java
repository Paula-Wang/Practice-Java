public class Pet {
    String name;
    int hunger;
    int energy;
    int happiness;

    public Pet(String petName) {
        name = petName;
        hunger = 40;
        energy = 60;
        happiness = 70;
    }

    public void play() {
        happiness += 10;
        energy -= 5;
        hunger += 10;
    }

    public void feed(int foodAmount) {
        hunger -= foodAmount;
    }

    public void sleep() {
        energy += 20;
    }

    // 🔁 Return the actual hunger value
    public int getHunger() {
        return hunger;
    }

    // 🔁 Return the actual energy value
    public int getEnergy() {
        return energy;
    }

    // 🔁 Return the actual happiness value
    public int getHappiness() {
        return happiness;
    }

    // 🔁 Return a basic string summary
    public String getPetSummary() {
        return name + "'s current stats: Hunger = " + hunger + ", Energy = " + energy + ", Happiness = " + happiness;
    }

    //New Method
    public int getTotalMood(){
        int mood = happiness + energy - hunger;
        return mood;
    }

    public String toString() {
        return "Pet: " + name;
    }
}
