package bubblesort;

public class BubbleSortMelhorado {
  public static void main(String args[]) {
    int[] v = {0, 2, 8, 3, 1, 4, 9, 6, 7, 5};
    BubbleSortMelhorado bs = new BubbleSortMelhorado();
    bs.ordenar(v);
    for(int num : v) {
      System.out.print(num + " ");
    }
  }
  
  public void ordenar(int[] v) {
    for(int i = 0; i < v.length - 1; i++) {
      for(int j = 0; j < v.length - 1 - i; j++) {
        if(v[j] > v[j + 1]) {
          int aux = v[j];
          v[j] = v[j + 1];
          v[j + 1] = aux;
          estaOrdenado = false;
        }
      }
      if(estaOrdenado)
        break;
    }
  }
}
