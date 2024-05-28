package ES1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Inserisci il numero di parole che vuoi inserire");
        int Num = Integer.parseInt(sc.nextLine());

        Set<String> elencoParoleDistinte = new HashSet<>();
        Set<String> elencoParoleDuplicate = new HashSet<>();

        for (int i = 0; i < Num; i++) {
            System.out.println("Inserisci una parola");
            String parola = sc.nextLine();

            if (elencoParoleDistinte.contains(parola)) {
                elencoParoleDuplicate.add(parola);
            } else {
                elencoParoleDistinte.add(parola);
            }

        }

        System.out.println();
        System.out.println("Elenco delle Parole Distinte: " + elencoParoleDistinte);
        System.out.println();
        System.out.println("Elenco delle Parole Duplicate: " + elencoParoleDuplicate);
        System.out.println();
        System.out.println("Il numero delle parole distinte è " + elencoParoleDistinte.size());

        sc.close();
    }
}
