import java.util.Scanner;
import modelli.Divano;

public class App {

    //classe di avvio che contiene il main
    //permette di eseguire il codice scritto al suo interno 
    //ci deve essere solo una claase che contiene il main in tutto ilprogretto
    //in modo tale da poter avviare il programma in un solo punto
    public static void main(String[] args) throws Exception {
        
        //oggetto
        Scanner tastiera = new Scanner(System.in);

        //quando creo un oggetto devo
        //DEFINIRLO cioè DICHIARARLO
        //Scanner tastiera -> TIPO nome
        //negli oggetti il tipo è quello della classe a cui fanno riferimento
        //quindi il tipo è il loro modello
        //esiste una classe Scanner 
        //Classe nomeOggetto, dove il nome IDENTIFICA un oggetto
        //ogni volta che dove richiare un oggetto specifico dovete usare il suo nome
        //CREAZIONE dell'oggetto
        //new Scanner(System.in);

        //provo a creare un divano
        Divano divano;//qui lo dichiaro
        //ora lo CREO 
        //creazione new tipo/Classe(); in questo mo ho creato un oggetto di tipo
        //Divano che si chiama divano
        divano = new Divano();
        //Divano indica la classe, il modello di riferimento
        //divano è il nome dell'oggetto, ogni volta che mi serve usarlo lo richimaerò tramite 
        //il nome
        //per poter dare un valore specifico alle caratteristiche di un oggetto 
        //devo richiamarle
        //nomeOggetto.attributo = il valore che vogliamo assegnarli
        divano.colore = "bianco";
        //accedo al valore della proprietà colore del divano creato
        //usano nomeOggetto.colore
        // System.out.println("colore del divano: " + divano.colore);
        // System.out.println("Materiale: " + divano.materiale);
        // System.out.println("Reclinabile: " + divano.reclinabile);
        // System.out.println("Prezzo: " + divano.prezzo);
        divano.materiale = "lino";
        System.out.println("Materiale: " + divano.materiale);

        Divano divano2 = new Divano();
        //divano2 avrà gli stessi attrubuti di divano
        //ma per quegli attributi potrà avere valori diversi
        divano2.colore = "nero";
        divano2.materiale = "cotone";
        divano2.prezzo = 900;
        divano2.reclinabile = true;
        System.out.println("\n--------\n");
        // System.out.println("Colore divano2: " + divano2.colore);
        // System.out.println("Materiale divano2: " + divano2.materiale);
        // System.out.println("Prezzo divano2: " + divano2.prezzo);
        // System.out.println("Reclinabile divano2: " + divano2.reclinabile);
        System.out.println("\n--------\n");

        Divano divano3 = new Divano();
        divano3.colore = "grigio";
        divano3.materiale = "microfibra";
        divano3.prezzo = 670.50;
        divano3.reclinabile = false;
        // System.out.println("Colore divano3: " + divano3.colore);
        // System.out.println("Materiale divano3: " + divano3.materiale);
        // System.out.println("Prezzo divano3: " + divano3.prezzo);
        // System.out.println("Reclinabile divano3: " + divano3.reclinabile);

        // System.out.println("oggetto divano: " +divano);

        System.out.println("divano: \n" + divano.toString());
        System.out.println("Divano2: \n" + divano2.toString());
        System.out.println("Divano3: \n" + divano3.toString());

        System.out.println("Prezzo finale divano2: " + divano2.prezzoFinale() + "euro");

       
    }
}
