import java.util.HashMap;
import java.util.Map;

public class Diccionario {
    public static Map<String, String> getDiccionario() {
        Map<String, String> diccionario = new HashMap<>();
        diccionario.put("perro", "dog");
        diccionario.put("casa", "house");
        diccionario.put("arbol", "tree");
        diccionario.put("cara" , "face");
        diccionario.put("gato", "cat");
        diccionario.put("espejo" , "mirror");
        diccionario.put("carro", "car");
        diccionario.put("mundo", "world");
        diccionario.put("mesa", "table");
        diccionario.put("habitacion", "bedroom");
        diccionario.put("baño", "bathroom");
        diccionario.put("cocina", "kitchen");
        diccionario.put("ventana", "window");
        diccionario.put("puerta", "door");
        diccionario.put("luna", "moon");
        diccionario.put("blanco","white");
        diccionario.put("verde", "green");
        diccionario.put("rojo", "red");
        diccionario.put("sol", "sun");
        diccionario.put("libro", "book");

        return diccionario;
    }
}
