public class Person {
    String name;
    String surname;
    int age;

    //costruttore
    Person(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    //override toString()
    public String toString(){
        String objElPerson = this.name +"\n"+ this.surname +"\n" + this.age;

        return objElPerson;
    }

    //metodo
    void greed(){
        System.out.println("Ciao");
    }
}

