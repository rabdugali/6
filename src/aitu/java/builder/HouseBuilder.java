package aitu.java.builder;

public class HouseBuilder implements Builder{
    private House house;

    HouseBuilder(){
        this.house = new House();
    }

    @Override
    public void buildDoors(int number){
        house.setDoors(number);
    }
    @Override
    public void buildWindows(int number){
        house.setWindows(number);
    }
    @Override
    public void buildRoof(String roof){
        house.setRoof(roof);
    }
    @Override
    public void buildGarage(boolean garage){
        house.setGarage(garage);
    }
    public House getResult(){
        return this.house;
    }

}
