package ejercicios_lab_03;
public class Ejercicio_2 {
    public static int ConteoI(int[] v, int n) {
    int conteo = 0;                                            // O(1)
    for (int i = 0; i < n - 1; i++) {                       // O(n)
        for (int j = i + 1; j < n; j++) {                   // O(n)
            if (v[i] == v[j]) {                                   // O(1)
                conteo++;                                        // O(1)
            }
        }
    }
    return conteo;                                            // O(1)
    }
}
