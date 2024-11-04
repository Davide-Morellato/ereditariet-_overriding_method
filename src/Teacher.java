//ho creato la classe figlia che estende la classe padre
//classe figlia: Teacher
//estensione: extends
//classe padre: Person
public class Teacher extends Person{

    //aggiungo una proprietà
    String subject;

    //NECESSARIO IL COSTRUTTORE
    //EREDITA la possibilità di assegnare dei valori tramite le proprietà dichiarate nella classe padre (Person)
    //
    //SE VOLESSI AGGIUNGERE LA POSSIBILITA' DI ASSEGNARE UNA PROPRIETA' OLTRE QUELLA DICHIARATE NELLA CLASSE PADRE
    //E' NECESSARIO CREARNE UNA NUOVA (vedi sopra), AGGIUNGERLA COME PARAMETRO E RICHIAMARLA NEL COSTRUTTORE
    Teacher(String name, String surname, int age, String subject){
        /*
         * La parola chiave super ha tre usi espliciti:
         * - Accedere ai dati della classe genitore quando anche la classe figlia ha i dati con lo stesso nome.
         * - Chiamare i costruttori predefiniti o con parametri della classe padre nella classe figlia.
         * - Chiamare i metodi della classe padre nella classe figlia se il figlio ha eseguito l'override dei metodi.
         */
        super(name, surname, age); //super -> metodo che consente di accedere ai dati della classe genitore, datp che la classe figlia ha i dati con lo stesso nome.

        //richiamo la proprietà
        this.subject = subject;
    }
}
