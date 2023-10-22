package com.buaa.ds.sorted;

public class BubbleSort {
	public static void main(String args[]){
		long[] array = {1,45,3,212,2,243,43,22,465};
		for(int i = array.length-1;i>1;i--){
			for(int j = 0;j<i;j++){
				if(array[j]>array[j+1]){
					swamp(j,j+1,array);
				}
			}
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
