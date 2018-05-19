package Algoritmos;

public class BubbleSort {

	public void menuBubble(String[] lista) {
		
		String tempStr;
		for (int t = 0; t < lista.length - 1; t++) {
            for (int i= 0; i < lista.length - t -1; i++) {
                if(lista[i+1].compareTo(lista[i])<0) {
                    tempStr = lista[i];
                    lista[i] = lista[i + 1];
                    lista[i + 1] = tempStr;
                }
            }
        }
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }
	}
}
