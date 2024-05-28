package ES3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    private static final Map<String, Integer> listaContatti = new HashMap<>();

    public static void main(String[] args) {

        System.out.println("Lista Contatti");

        inserisciContatto("Luca", 389747574);
        inserisciContatto("Simone", 354758691);
        inserisciContatto("Claudio", 324579817);
        inserisciContatto("Carlo", 334685189);
        inserisciContatto("Aldo", 398451234);

        stampaContatti();

        System.out.println();

        System.out.println("Nuova Lista Contatti");
        cancellaContatto("Aldo");
        cancellaContatto("Carlo");

        stampaContatti();

        System.out.println();

        System.out.println("Ricerca per numero di telefono");
        ricercaNumero(354758691);
        ricercaNumero(389747574);

        System.out.println();

        System.out.println("Ricerca per nome");
        ricercaNome("Luca");
        ricercaNome("Claudio");
    }

    public static void inserisciContatto(String nome, int numeroTelefono) {
        listaContatti.put(nome, numeroTelefono);
    }

    public static void cancellaContatto(String nome) {
        listaContatti.remove(nome);
    }

    public static void ricercaNumero(int numeroTelefono) {
        for (Map.Entry<String, Integer> entry : listaContatti.entrySet()) {
            if (entry.getValue() == numeroTelefono) {
                System.out.println("Nome: " + entry.getKey() + " - Telefono: " + entry.getValue());
            }
        }
    }

    public static void ricercaNome(String nome) {
        for (Map.Entry<String, Integer> entry : listaContatti.entrySet()) {
            if (entry.getKey().equals(nome)) {
                System.out.println("Nome: " + entry.getKey() + " - Telefono: " + entry.getValue());
            }
        }
    }

    public static void stampaContatti() {
        for (Map.Entry<String, Integer> entry : listaContatti.entrySet()) {
            System.out.println("Nome: " + entry.getKey() + " - Telefono: " + entry.getValue());
        }
    }

}
