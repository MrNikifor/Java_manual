package patterns.generating.prototype;

public class SheepFarm {
    public static void main(String[] args) {
        Sheep blackSheep = new BlackSheep("Anna");
        Sheep whiteSheep = new WhiteSheep("Bob");

        Sheep clonedBlackSheep = blackSheep.clone();
        Sheep clonedWhiteSheep = whiteSheep.clone();

        clonedBlackSheep.setName("Igor");
        clonedWhiteSheep.setName("Max");

        System.out.println(blackSheep.getName());
        System.out.println(whiteSheep.getName());

        System.out.println("Clones: " + clonedBlackSheep.getName());
        System.out.println("Clones: " + clonedWhiteSheep.getName());
    }
}
