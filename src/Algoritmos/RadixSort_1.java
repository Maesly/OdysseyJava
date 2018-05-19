package Algoritmos;
import Algoritmos.QuickSort;
import java.io.*;
import java.util.*;


public class RadixSort_1{

	static void countSort(String[] arr, int index, char menor, char mayor){
		int[] countArray = new int[(mayor - menor) + 2];
		String[] tempArray = new String[arr.length];
		Arrays.fill(countArray, 0);
		int i;
		
		for(i = 0;i< arr.length ;i++) {
			int charIndex = (arr[i].length()-1 < index ? 0: ((arr[i].charAt(index)-menor) +1));  
			countArray[charIndex]++;
		}
		for (i = 1; i < countArray.length; i++)
            countArray[i] += countArray[i - 1];
 
        for (i = arr.length - 1; i >= 0; i--)
        {
        	int charIndex = (arr[i].length()-1 < index ? 0: (arr[i].charAt(index) - menor) +1);
            tempArray[countArray[charIndex]-1] = arr[i];
            countArray[charIndex]--;
        }
        for (i = 0; i < tempArray.length; i++)
            arr[i] = tempArray[i];
	}
	
	static void radixSort(String[] arr,char menor,char mayor) {
		int max = 0;
		for(int i = 0; i<arr.length;i++) {
			if(arr[i].length()-1 > max) {
				max = arr[i].length()-1;
			}
		}
		for(int i=max;i>=0;i--){
		      countSort(arr,i,menor,mayor);
		}
	}
	
	static void print(String arr[],int n ) {
		for(int i = 0; i< n;i++)
			System.out.print(arr[i] + " ");
	}
	public void menu(String[] arr)
    {
		//String arr[] = {"lola","australia","algorithm","sell", "olympic","jack","sleep"};
		int n = arr.length;
        radixSort(arr, 'a','z');
        print(arr, n);
       
        
		
    }
}
