package actividades_lab_03;
public class ActividadC {
    public static int suma(int[] v, int tamaño) {
        int i, result;                                     // O(1)
        result = 0;                                      // O(1)
        for (i = 0; i < tamaño; i++) {            // O(n)
            result = result + v[i];                   // O(1) 
        }
        return result;                                  // O(1)
    }
}

