//LEGGERE LE ISTRUZIONI NEL FILE README.md

//Import di Classi Java necessarie al funzionamento del programma
import java.util.Scanner;

// Classe principale, con metodo main
class Esercizio {
    // Il programma parte con una chiamata a main().
    public static void main(String args[])
    {
        // - Definire un vettore V contenente 5 nomi di cantanti. Riempire il vettore
        // con 5 istruzioni del tipo: V[0] = "Matt"; ... V[4] = "Amy";

        String v[] = new v[5];
        v[0] = "Matt";
        v[1] = "Chris";
        v[2] = "Dom";
        v[3] = "Adele";
        v[4] = "Celine"; 

        // - Definire un vettore W contenente 5 nomi di cantanti. Riempire il vettore
        // inserendo i nomi da tastiera e usando un ciclo;

        String w[] = new w[5];

        int i=0;
        for (i = 0; i <= 4; i++) {
          System.out.println("Inserisci il nome di un cantante");
          w[i] = in.nextLine;
        }

        // - Definire un vettore X contenente 10 numeri da 1 a 10. Riempire il vettore
        // usando un ciclo e sfruttando l'indice del vettore;

        int x[] = new x[10];
        for (i = 0; i <= 9; i++) {
          // In questo caso il valore dell'indice è collegato al valore della cella
          // (valore = i + 1)
          x[i] = i + 1;
        }
      
        // - Definire un vettore Y contenente i primi 10 numeri pari. Riempire il
        // vettore usando un ciclo e sfruttando l'indice del vettore;
        int y[] = new y[10];

        for (i = 0; i <= 9; i++) {
            // In questo caso il valore dell'indice è collegato al valore della cella
            // (valore = (i+1) * 2)
            y[i] = (i + 1) * 2;
        }

        // - Visualizzare solo 3 elementi del vettore V, usando le istruzioni del
        // tipo: cout << V[0]; cout << V[2]; ...
        System.out.println("Visualizzare solo 3 elementi del vettore V: "+ v[0]+ " "+ v[2] + " " +  v[4]);

        // - Visualizzare tutti gli elementi dei vettori V, W, X, Y usando i cicli.
        System.out.println("Visualizzare tutti gli elementi dei vettori V, W, X, Y");
        System.out.print("V:");
        for (i = 0; i < v.length; i++) {
            System.out.println(v[i]+" ");
        }

        System.out.print("W:");
        for (i = 0; i < w.length; i++) {
            System.out.println(w[i]+" ");
        }

        System.out.print("X:");
        for (i = 0; i < x.length; i++) {
            System.out.println(x[i]+" ");
        }

        System.out.print("Y:");
        for (i = 0; i < y.length; i++) {
            System.out.println(y[i]+" ");
        }

        // Visualizzare solo gli elementi con indice pari del vettore X.
        System.out.println();
        System.out.print("X solo indici pari: ");
        for (i = 0; i < x.length; i += 2) {
            System.out.println(x[i]+" ");
        }

        // Visualizzare solo gli elementi con indice dispari del vettore X.
        
        System.out.println();
        System.out.print("X solo indici pari: ");
        for (i = 1; i < x.length; i += 2) {
            System.out.println(x[i]+" ");
        }


        // Visualizzare solo gli elementi con valore pari del vettore X.
        System.out.println();
        System.out.print("X, solo valori pari: ");
        for (i = 0; i < x.length; i++) {
            if (x[i] % 2 == 0) {
            System.out.print(x[i]+ " ");
            }
        }
    }
}

//LEGGERE LE ISTRUZIONI NEL FILE README.md