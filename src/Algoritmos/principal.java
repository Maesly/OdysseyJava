package Algoritmos;
import Algoritmos.*;
import Interfaz.*;
public class principal {

	public void menu() {
		
            String words[] = {"zz", "aa", "cc", "hh", "bb", "ee", "ll"};

            QuickSort hola2 = new QuickSort();
            hola2.sort(words);

            String words2[] = {"albahaca", "comino", "romero", "laurel", "ajonjolí", "amapola"};

            BubbleSort lista = new BubbleSort();
            lista.menuBubble(words2);



            RadixSort_1 hola = new RadixSort_1();
           //hola.menu();
            System.out.println("");
            System.out.println("<<entró>>");
            System.out.println("");
		
		
		
	}
}
