package com.buaa.ds.sorted;

public class SelectionSort {

	public static void main(String[] args) {
		long[] array = {1,45,3,212,2,243,43,22,465};
		for(int i = 0 ;i< array.length-1;i++){
			int min = i;
			for (int j = i+1 ;j<array.length;j++){
				if(array[j]<array[min]){
					min = j;
				}
			}
			swamp(i,min,array);
		}
		for(int m = 0;m<array.length;m++){
			System.out.println(array[m]);
		}

	}
	public static void swamp(int a,int b,long[] arr){
		long temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
