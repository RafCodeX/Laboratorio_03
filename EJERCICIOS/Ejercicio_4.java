package ejercicios_lab_03;
public class Ejercicio_4 {
  public static int potenciaRapida(int x, int y) {
    if (y == 0) {                                                           // O(1)
        return 1;                                                         // O(1)
    } else if (y % 2 == 0) {                                       // O(1)
        int mitad = potenciaRapida(x, y / 2);           // O(log y)
        return mitad * mitad;                                  // O(1)
    } else {
        return x * potenciaRapida(x, y - 1);             // O(log y)
    }
  }  
}
