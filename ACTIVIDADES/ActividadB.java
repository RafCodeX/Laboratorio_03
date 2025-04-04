package actividades_lab_03;
public class ActividadB {
    public static int max(int x, int y) {
        int result;                                   // O(1)
        if (x >= y) {                                // O(1)
            result = x;                             // O(1)
        } else {
            result = y;                             // O(1)
        }
        return result;                             // O(1)
    }
}

