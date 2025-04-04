package ejercicios_lab_03;

public class Ejercicio_1 {
    public static int BM(int[] v, int n) {
    int m = v[0];                                          // O(1)
    for (int i = 1; i < n; i++) {                        // O(n)
        if (v[i] > m) {                                      // O(1)
            m = v[i];                                       // O(1)
        }
    }
    return m;                                             // O(1)
    }
}
