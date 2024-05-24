public class Ejercicio2 {
    /*
        Se solicita implementar una función con dos parámetros: un array de enteros y un entero. La
        función debe retornar un array que contenga los índices de dos elementos en el array de
        enteros, cuya sumatoria sea igual al valor del entero.

        En caso de que haya más de un par de índices que cumplan con esta condición, la función
        deberá retornar los índices del último par que cumpla con la condición de sumatoria igual al
        valor del entero adicional.

        Ejemplo
        int[] array = [1,2,3,4,5];
        int target = 6;
        Resultado esperado: [1, 3]
        Especificaciones
        • La función debe recibir un array de enteros y un entero como parámetros.
        • Debe retornar un array con los índices de los elementos cuya sumatoria sea igual al
        valor del entero.
        • En caso de haber más de un par de índices que cumplan con la condición, se deben
        retornar los índices del último par que cumpla con la condición de sumatoria igual al
        valor del entero adicional.
           
    */
    public static void main(String[] args) throws Exception {

        //inicializamos las variables de prueba
        //{1, 2, 5, 4};
        //{1, 2, 3, 4, 5};
        int[] array = {1, 2, 3, 4, 5};
        int numeroEntero = 6;

        //funcion resultado
        int[] resultado = encontrarParValor(array, numeroEntero);

        if (resultado != null) { //si existe resultado, imprimimos los posiciones de los indices
            System.out.println("Resultado Esperado: [" + resultado[0] + ", " + resultado[1] + "]");
            
        } else { //sino, no encontro los valores que dan la suma
            System.out.println("No se encontraron los valores..");
        }

    }


    //utilizar dos ciclos for(comparar el primer elemento, el segundo y todos los posibles) 
    //para encontrar el par que sume el numeroEntero
    public static int[] encontrarParValor(int[] array, int numeroEntero) {

       int[] resultado = null;

       for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {

                //evaluamos para cada elemento del array si la suma de ambos es igual al numeroEntero
                if(array[i] + array[j] == numeroEntero){ 
                    resultado = new int[] {i, j};
                }
            }
       }

        return resultado;
    }     
    

}
