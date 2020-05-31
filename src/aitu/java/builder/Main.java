package aitu.java.builder;

public class Main {

    public static void main(String[] args) {
        House house = new House();
        house.setDoors(4);
        HouseBuilder builder = new HouseBuilder();
        builder.buildDoors(5);
        house = builder.getResult();
        System.out.println(house.getDoors());
    }
}
