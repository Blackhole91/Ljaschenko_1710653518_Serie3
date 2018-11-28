public class Person {

    private int alter ;
    private String name;

    public Person(int alter, String name) {
        this.setAlter(alter);
        this.setName(name);
    }

    public void printPerson(){
        System.out.println("Person heißt "+this.getName()+" und ist "+this.getAlter()+" Jahre alt");
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
