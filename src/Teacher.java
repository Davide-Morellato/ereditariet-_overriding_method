//ho creato la classe figlia che estende la classe padre
//classe figlia: Teacher
//estensione: extends
//classe padre: Person
public class Teacher extends Person{

    //NECESSARIO IL COSTRUTTORE
    //EREDITA la possibilità di assegnare dei valori tramite le proprietà dichiarate nella classe padre (Person)
    Teacher(String name, String surname, int age){
        /*
         * La parola chiave super ha tre usi espliciti:
         * - Accedere ai dati della classe genitore quando anche la classe figlia ha i dati con lo stesso nome.
         * - Chiamare i costruttori predefiniti o con parametri della classe padre nella classe figlia.
         * - Chiamare i metodi della classe padre nella classe figlia se il figlio ha eseguito l'override dei metodi.
         */
        super(name, surname, age); //super -> metodo che consente di accedere ai dati della classe genitore, datp che la classe figlia ha i dati con lo stesso nome.

    }
}
