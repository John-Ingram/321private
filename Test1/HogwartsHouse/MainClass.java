package Test1.HogwartsHouse;

public class MainClass {

    public static void resetHouse(HogwartsHouse house) {
        house = new HogwartsHouse();
    }

    public static void main(String args[]) {

        HogwartsHouse gryffindor = new HogwartsHouse("Gryffindor", 0);
        HogwartsHouse hufflepuff = new HogwartsHouse("Hufflepuff", 0);
        HogwartsHouse slytherin = new HogwartsHouse("Slytherin", 0);
        HogwartsHouse ravenclaw = new HogwartsHouse();

        ravenclaw.addPoints(25);
        gryffindor.addPoints(50);
        hufflepuff.addPoints(10);

        slytherin.stealAllPoints(ravenclaw.getPoints());
        System.out.println(ravenclaw.getHouseInfo()); // 1
        System.out.println(slytherin.getHouseInfo()); // 2
        System.out.println();

        gryffindor.movePointsTo(hufflepuff);
        System.out.println(gryffindor.getHouseInfo()); // 3
        System.out.println(hufflepuff.getHouseInfo()); // 4
        System.out.println();

        resetHouse(slytherin);
        System.out.println(slytherin.getHouseInfo()); // 5
    }
}
