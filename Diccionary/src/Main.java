import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> diccionario = Diccionario.getDiccionario();
        TraductorDiccionario.traducirPalabras(diccionario);
    }
}
