import java.util.Map;
import java.util.Scanner;
import java.util.Random;

public class TraductorDiccionario {
    public static void traducirPalabras(Map<String, String> diccionario) {
        String[] palabras = diccionario.keySet().toArray(new String[0]);
        Random random = new Random();
        String[] palabrasElegidas = new String[5];
        for (int i = 0; i < 5; i++) {
            palabrasElegidas[i] = palabras[random.nextInt(palabras.length)];
        }

        Scanner scanner = new Scanner(System.in);
        int respuestasCorrectas = 0;
        int respuestasIncorrectas = 0;

        System.out.println("¡Traduce las siguientes palabras a Ingles!");
        for (String palabra : palabrasElegidas) {
            System.out.print(palabra + " ---> ");
            String traduccion = scanner.nextLine().toLowerCase();

            if (traduccion.equals(diccionario.get(palabra))) {
                System.out.println("¡Correcto!");
                respuestasCorrectas++;
            } else {
                System.out.println("¡Incorrecto!. La traduccion correcta es: " + diccionario.get(palabra));
                respuestasIncorrectas++;
            }
        }
        System.out.println("\n¡FINISH!. Respuestas correctas: " + respuestasCorrectas + ", Respuestas incorrectas: " + respuestasIncorrectas);
        if (respuestasCorrectas >=3){
            System.out.println("\nMuy bien!");
        } else {
            System.out.println("\nVuelve a intentarlo!");
        }
    }
}


