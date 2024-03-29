package Cadenas;

public class Cadenas16 {
    public static int vecesPalabra(String cad, String palabra) {
        // Creamos la variables
        int contPalabra = 0;
        boolean entrada = true;
        // Inicamos un while para que si la cadena contiene la palabra la cuente y nos devuelve el numero de veces
        while (entrada) {
            if (cad.contains(palabra)) {
                contPalabra++;
                cad = cad.replaceFirst(palabra, "");
            } else {
                // Si no, nos mostraria 0
                entrada = false;
            }
        }
        // Nos mostrada el numero de palabras
        return contPalabra;
    }

    public static void main(String[] args) {
        System.out.println(vecesPalabra("Un coches, dos coches, tres coches", "coches"));
    }
}
