/* Desenvolvido por Gabriel P.
 *
 * Referências:
 *  - http://www.growingwiththeweb.com/2014/02/bubble-sort.html
 *  - https://github.com/gwtw/java-sorting/blob/master/src/com/growingwiththeweb/sorting/BucketSort.java
 *  - http://www.javacodex.com/Sorting/Bucket-Sort
 *  - http://javaprogramming.language-tutorial.com/2014/08/sort-integer-array-with-bucket-sort.html
 *  - http://www.cs.unb.ca/~bremner/teaching/java/BucketSort.java/
 *  - https://github.com/gwtw/java-sorting/blob/master/src/com/growingwiththeweb/sorting/SelectionSort.java
 *  - https://stackoverflow.com/questions/41955427/selection-sort-using-arraylist
 * 	- http://rosettacode.org/wiki/Sorting_algorithms/Selection_sort#Java
 *   - Livro: Estrutura de Dados & Algoritmos em Java - Robert Lafore. 2004.
 *
 */

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Principal  {

	static List<Integer> num = new ArrayList<>();


    public static void main(String[] args) throws Exception  {

    	// manipular arquivo txt
    	  try {

              String line;
              FileInputStream fileInput = new FileInputStream("  ");
              DataInputStream dataInput = new DataInputStream(fileInput);
              BufferedReader bufferRead = new BufferedReader(new InputStreamReader(dataInput));

              while ((line = bufferRead.readLine()) != null) {
                  String[] spl = line.split(" ");
                  for (String splAux : spl) {
                      num.add(Integer.parseInt(splAux));
                  }
              }

              dataInput.close();
          } catch (Exception e) {
              System.out.println("Não foi possível abrir o arquivo\n");
              System.out.println(e.getMessage());
          }


    	  Ordena ord = new Ordena();

          ord.executarBubleSort(num); //BubleSort

       	//	ord.executarSelectionSort(num); //SelectionSort

       // ord.executarBucketSort(num); //BucketSort

          ord.imprimir(num); //imprime lista ordenada

    }
}
