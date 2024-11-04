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
        //
        //avendo inserito una nuova proprietà è necessario aggiungerne il valore all'assegnazione
        Teacher teacherOne = new Teacher("Gianni", "Neri", 52, "Storia");

        Student studentOne = new Student("Davide", "Bianchi", 35);

        System.out.println(studentOne.name); //stampo il valore della proprietà name di Student
        System.out.println(teacherOne.name); //stampo il valore della proprietà name di Teacher
        System.out.println(teacherOne.subject);

        // teacherOne.studying(); -> ERRORE perchè il metodo non è accessibile dall'istanza di Teacher
        // personOne.studying(); -> ERRORE perché il metodo non è accessibile dall'istanza di Person (nonstante stia venendo estesa da Student, perché il metodo è stato dichiarato in Student, quindi accessibile solo dalle istanze di Student)
        studentOne.studying();

        //studentOne.teaching(); -> ERRORE perchè il metodo è accessibile SOLO dall'istanza di Teacher
        teacherOne.teaching();

        //
        //invoco il metodo greed() dichiarato nella classe Person
        //NB => nonstante il metodo sia stato dichairato in class Person,
        //      è possibile invocarlo dalle classi figlie (Teacher & Student) perché estendono la classe padre
        //      avendo accesso ai suoi metodi e le sue proprietà
        //
        //ESSENDO STATO SOVRASCRITTO (Override) PRESENTA LA NUOVA STAMPA DI ISTRUZIONE
        teacherOne.greed(); //Salve
        studentOne.greed(); //Buongiorno
    }
}
