/*
 * 5. (SumasParciales) Se quiere diseñar un método public static int[] sumaParcial(int[] v) ,
 * que dado un array de enteros v , devuelva otro array de enteros t de forma que t[i] = v[0]
 * + v[1] + ...+ v[i] . Es decir:
 * 
 * 1| t[0] = v[0]
 * 2| t[1] = v[0] + v[1]
 * 3| t[2] = v[0] + v[1] + v[2]
 * 4| ...
 * 5| t[10] = v[0] + v[1] + v[2] + ... + v[10]
 * 
 * Desde el método main crearemos e inicializaremos un array, llamaremos a sumaParcial y
 * mostraremos el array resultante.
 * Prueba, para visualizar el cambio desde Netbeans
 * Segunda prueba, para el repositorio remoto de GitHub.
 */
package sumasparciales;

public class SumasParciales {

    public static int[] sumaParcial(int[] origen) {
        int aux = 0;
        int[] destino = new int[origen.length];

        destino[0] = origen[0];
        for (int i = 1; i < origen.length; i++) {
            //aux += origen[i];
            //destino[i] = aux;
            destino[i] = origen[i] + destino[i - 1];
        }

        return destino;
    }

    public static void imprimeArray(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int[] v = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] t; //1, 3. 6, 10, 15, 21, 28, 36, ...

        imprimeArray(v);
        t = sumaParcial(v);
        imprimeArray(t);
        
        System.out.println("Hello world!");
    }
}
