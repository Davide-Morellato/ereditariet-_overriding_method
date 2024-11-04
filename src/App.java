public class App {
    public static void main(String[] args){
        //creazione istanza
        Person personOne = new Person("Luca", "Rossi", 31);

        //stampo l'oggetto
        System.out.println(personOne);

        //invoco il metodo
        personOne.greed();


        /////////////////////////////
        //
        //
        //CREO ISTANZE DELLE CLASSI Teacher & Student (estendono la classe Person)
        Teacher teacherOne = new Teacher("Gianni", "Neri", 52);

        Student studentOne = new Student("Davide", "Bianchi", 35);

        System.out.println(studentOne.name); //stampo il valore della proprietà name di Student
        System.out.println(teacherOne.name); //stampo il valore della proprietà name di Teacher

    }
}
