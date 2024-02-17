public class Main {
    public static void main(String[] args) {
        int[] array = {2, 8, 6, 4, 1, 5, 10, 12, 15, 20};
        int target = 6;

        int indexSecuencial = busquedaSecuencial(array, target);
        int indexBinaria = busquedaBinaria(array, target);

        System.out.println("Búsqueda Secuencial:");
        System.out.println("El numero " + target + " está en la posición " + indexSecuencial);

        System.out.println("\nBúsqueda Binaria:");
        System.out.println("El numero " + target + " está en la posición " + indexBinaria);
    }

    public static int busquedaSecuencial(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int busquedaBinaria(int[] array, int target) {
        int inicio = 0;
        int fin = array.length - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;

            if (array[medio] == target) {
                return medio;
            }

            if (array[medio] < target) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        
        return -1;
    }
}