package ES2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Inserisci quanti numeri vuoi vedere nella lista");
        int n = Integer.parseInt(sc.nextLine());
        List<Integer> listaCasuale = generaListaCasuale(n);
        System.out.println("Lista casuale: " + listaCasuale);

        List<Integer> listaDuplicataInversa = generaListaDuplicataInversa(listaCasuale);
        System.out.println("Lista Duplicata e Inversa: " + listaDuplicataInversa);

        System.out.println("Inserisci true per vedere la lista dei valori in posizione pari o false per vedere quella dei valori in posizione dispari");
        boolean valore = Boolean.parseBoolean(sc.nextLine());

        if (valore) {
            System.out.println("Lista valori in posizione pari: ");
            stampaPariDispari(listaCasuale, true);
        } else {
            System.out.println("Lista valori in posizione dispari: ");
            stampaPariDispari(listaCasuale, false);
        }
        
        sc.close();
    }

    public static List<Integer> generaListaCasuale(int num) {

        List<Integer> lista = new ArrayList<>();
        Random rnd = new Random();

        for (int i = 0; i < num; i++) {
            lista.add(rnd.nextInt(101));
        }

        Collections.sort(lista);

        return lista;
    }

    public static List<Integer> generaListaDuplicataInversa(List<Integer> lista) {

        List<Integer> listaResult = new ArrayList<>(lista);
        List<Integer> listaInversa = new ArrayList<>(lista);

        Collections.reverse(listaInversa);
        listaResult.addAll(listaInversa);

        return listaResult;
    }

    public static void stampaPariDispari(List<Integer> lista, boolean pari) {

        for (int i = pari ? 0 : 1; i < lista.size(); i += 2) {
            System.out.println(lista.get(i));
        }

    }

}
