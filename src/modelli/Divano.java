package modelli;

//classe modello, non contiene il main
//ma definisce un MODELLO per creare degli oggetti 
//è un modello Astratto, non esiste concretamente e non ha valori specifici ma solo 
//caratteristiche generali
public class Divano {

    // qui andrò a definire le caratteristiche che tutti i
    // divani avranno nel mio programma
    // saranno caratteristiche generali
    // ogni divano che verrà poi creato usando questo modello
    // avrà le sue personalizzazioni
    // PROPRIETA' o ATTRIBUTI che tutti i divani avranno
    // ovvero le caratteristiche che li contraddistingono da altri oggetti
    public String materiale;
    public String colore;
    public boolean reclinabile;
    public double prezzo;

    // METODI
    // comportamenti che un oggetto di questo tipo potrà avere
    // sono delle azioni che un oggetto puà mettere in atto e che di solito
    // hanno le seguenti funzioni:
    // - eseguire un calcolo
    // - ricevere degli input per i calcoli
    // - fornire un ouput

    // metodo che fornisca la descrizione dell'oggetto che lo richiama
    // sintassi:
    // cosa il metodo ritorna(tipo di ritorno) nomeMetodo(facoltativo input){
    // corpo del metodo ovvero i colcoli o le espressioni che il metodo
    // deve eseguire per restituire un valore
    // }
    // vorremmo ricevere una stringa che descriva tutti i valori delle proprietà
    // dell'oggetto che chiama il metodo
    public String toString() {// dove String indica il TIPO di RITORNO cioè
        // che tipo di dato mi aspetto di ricere dal metodo
        // toString è il NOME DEL METODO(camelCase)
        // () quando c'è un mome seguito dalle () esse indicano sempre che state usando
        // un METODO
        // nelle () il metodo puù ricere degli input se dichiarati per fare i calcoli
        String risposta = "Materiale:" + materiale + "\n" +
                "Colore: " + colore + "\n" +
                "Prezzo base: " + prezzo + "\n" +
                "Prezzo aggiornato: " + prezzoFinale() + "\n" +
                "Reclinabile: " + ((reclinabile) ? "sì" : "no") + "\n";
        // con return indico che il metodo restituisce quel dato quando viene
        // invocato da un oggetto
        return risposta;
    }

    // DICHIARAZIONE METODO riga 37: TIPO RITORNO NOME(){}

    // metodo che calcola un prezzo del divano a seconda di alcune
    // caratteristiche
    public double prezzoFinale() {
        double prezzoFin = prezzo;
        if (materiale != null) {
            switch (materiale.toLowerCase()) {
                case "pelle":
                    prezzoFin += 50;
                    break;
                case "lino":
                    prezzoFin += 30;
                    break;
                case "velluto":
                    prezzoFin += 40;
                    break;
            }
        }

        // modifico il prezzo anche in base al fatto che il divano sia reclinabile
        // se è reclinabile costa di più
        prezzoFin += (reclinabile) ? 80 : 0;

        // aggiorno il prezzo in base al colore
        // se il colore è diverso da bianco, nero o grigio il prezzo aumenta
        if (!colore.equalsIgnoreCase("bianco") &&
                !colore.equalsIgnoreCase("nero") &&
                !colore.equalsIgnoreCase("grigio")) {
            prezzoFin += 90;
        }
        return prezzoFin;
    }

}
