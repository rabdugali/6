package aitu.java.builder;

public class House {
    private String walls;
    private int doors;
    private int windows;
    private String roof;
    private boolean garage;

    public String getWalls(){
        return this.walls;
    }
    public void setWalls(String walls){
        this.walls = walls;
    }

    public int getDoors(){
        return this.doors;
    }
    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWindows(){
        return this.windows;
    }
    public void setWindows(int windows){
        this.windows = windows;
    }

    public String getRoof(){
        return this.roof;
    }
    public void setRoof(String roof) {
        this.roof = roof;
    }

    public boolean hasGarage(){
        return this.garage;
    }
    public void setGarage(boolean garage) {
        this.garage = garage;
    }
}
