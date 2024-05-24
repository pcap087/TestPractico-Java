public class Ejercicio1 {

    /*
        Dada una frase, se solicita implementar una función que devuelva otra frase donde cada
        palabra tenga la primera letra en minúscula y el resto en mayúscula.
        Ejemplo
        Entrada: Hola Mundo
        Salida esperada: hOLA mUNDO

        Especificaciones
        • La entrada es una cadena de texto que puede contener palabras separadas por
        espacios.
        • La salida debe ser una nueva cadena donde cada palabra tenga la primera letra en
        minúscula y el resto en mayúscula.
    */

    public static void main(String[] args) throws Exception {
    
        String frase = "Hola Mundo como estas";
        String fraseResultado = cambiarFrase(frase);
        System.out.println(fraseResultado); 

    }

    public static String cambiarFrase(String frase) {
        //paso 1: hacer un split de la frase
        String[] palabras = frase.split(" ");
        String resultado = "";

        //paso 2 - utilizar un forEach para recorrer e iterar los elementos
        for (String palabra : palabras) {
            
            String palabraTransformada = palabra.substring(0, 1).toLowerCase() + palabra.substring(1).toUpperCase();
            resultado = resultado + palabraTransformada + " ";

        }

        return resultado;
        
    }

}
