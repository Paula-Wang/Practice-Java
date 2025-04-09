public class Main {
    public static void main(String[] args) {
        Pet myPet = new Pet("Mochi");

        System.out.println(myPet); // Prints: Pet: Mochi

        myPet.play();
        System.out.println("Hunger after play: " + myPet.getHunger());
        System.out.println("Energy after play: " + myPet.getEnergy());
        System.out.println("Happiness after play: " + myPet.getHappiness());

        myPet.feed(20);
        int currentHunger = myPet.getHunger(); // storing the return value
        System.out.println("After feeding, hunger is now: " + currentHunger);

        myPet.sleep();
        int energyNow = myPet.getEnergy();
        System.out.println("Energy after sleep: " + energyNow);

        System.out.println(myPet.getPetSummary()); // Return a string

        // ✅ New: Print the total mood
        System.out.println("Total Mood Score: " + myPet.getTotalMood());
    }
}
