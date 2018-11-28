public class Aufruf {

    public static void main (String[]args){

        Vehicle myFirstObject = new Vehicle(4,100,"schwarz");

        myFirstObject.türInfo();
        System.out.println("das Fahrzeug ist "+myFirstObject.getColor());
    }
}
