public class Vehicle {

    private int doors;
    private int ps;
    private String color;

    public Vehicle(int doors, int ps, String color) {
        this.setDoors(doors);
        this.setPs(ps);
        this.setColor(color);
    }

    public void türInfo(){
        System.out.println("das Fahrzeug besitzt "+this.getDoors()+" Türen");
    }



    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
