public class main {
    public static void main(String [] args){


        Person person1 = new Person(27,"Artem");
        person1.printPerson();


        for (int i=2; i<7; i+=2){// Schleifnzähler zählt mit 2
           printName("Artem");
        }
        for (int j=1; j<6; j++){
           printName("Artem ");
           printAge(27+j);

        }


    }
    public static void printName(String name){
        System.out.println(name);
    }
    public static void printAge(int age){
        System.out.println(age);
    }
}
