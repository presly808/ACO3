package ua.artcode.algo;

import java.util.Arrays;

public class MergeSort {

    //buff for copy
	int[] buff;

	public int[] sort(int[] mas){
		buff = new int[mas.length];
		sort(mas, 0, mas.length-1);
		return mas;
	}
	
	public void sort(int[] mas, int start, int end){
		if(start >= end){
			return;
		}
		
		int mid = start + (end - start) / 2;
		
		sort(mas, start, mid);
		sort(mas, mid+1, end);
		merge(mas, start, mid, end);
		
	} 
	
	public void merge(int[] mas, int start, int mid, int end){
		for(int k = start; k <= end; k++){
			buff[k] = mas[k];
		}
		int i = start;
		int j = mid + 1;
		for(int k = start; k <= end; k++){
            if(j > end){
				mas[k] = buff[i++];
			} else if(i > mid){
				mas[k] = buff[j++];
			} else if(buff[i] < buff[j]){
				mas[k] = buff[i++];
			} else {
				mas[k] = buff[j++];
			}
		}
	}


	public static void main(String[] args) {
		int[] mas = {56,23,55,3,7,99,12,76};
		int[] sorted = new MergeSort().sort(mas);
		System.out.println(Arrays.toString(sorted));
	}
	
}
