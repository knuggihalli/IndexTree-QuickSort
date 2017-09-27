/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IndexTreeShake;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author kavunnuggihalli
 */
public class QuickSort {
    
    public static int [] randof = new int[50];
    
    
    public static void main(String args []){
        Random rand = new Random();
        
        for(int i=0; i<50; i++){
            randof[i] = rand.nextInt(30)+1;
        }
        
        System.out.println(Arrays.toString(randof));
        System.out.println("");
        

                int low = 0;
		int high = randof.length-1;
		quickSort(randof, low, high);
		System.out.println(Arrays.toString(randof));
       
                
                
    }
    

    public static void quickSort(int[] arr, int low, int high) {
		if (arr == null || arr.length == 0)
			return;
                
                if(arr.length < 64){
                    insertionSort(arr);
                }else{//insertion sort
                
                System.out.println("Quick");
		if (low >= high)
			return;
 
		// pick the pivot
		int middle = low + (high - low) / 2;
		int pivot = arr[middle];
 
		// make left < pivot and right > pivot
		int i = low, j = high;
		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}
 
			while (arr[j] > pivot) {
				j--;
			}
 
			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
 
		// recursively sort two sub parts
		if (low < j)
			quickSort(arr, low, j);
 
		if (high > i)
			quickSort(arr, i, high);
                }
	}
    
        public static void insertionSort(int [] a){
        System.out.println("Insert");
        for(int i=1; i<a.length; i++){
            int temp = a[i];
            int j;
            for(j = i-1; j>=0 && temp<a[j]; j--){
                a[j+1] = a[j];
                a[j+1] = temp;
            }
            
        }
    }
    
}
