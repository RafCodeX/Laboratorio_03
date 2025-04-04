package actividades_lab_03;
public class ActividadD {
    public static void ordenar(int[] v, int tamaño) {
        int i, j, aux;                                               // O(1)
        for (i = 0; i < tamaño - 1; i++) {                // O(n)
            for (j = 0; j < tamaño - 1; j++) {            // O(n)
                if (v[j] > v[j + 1]) {                             // O(1)
                    aux = v[j];                                    // O(1)
                    v[j] = v[j + 1];                               // O(1)
                    v[j + 1] = aux;                              // O(1)
                }
            }
        }
    }
}

