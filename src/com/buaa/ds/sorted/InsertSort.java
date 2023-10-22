package com.buaa.ds.sorted;

public class InsertSort {

	public static void main(String[] args) {
		long[] array = {1,45,3,212,2,243,43,22,465};
		for(int i = 1;i<array.length;i++){
			long temp = array[i];
			int j = i;
			while(j>0&&temp<=array[j-1]){
				array[j] =array[j-1];
				j--;
			}
			array[j] = temp;
		}
		for(int m = 0;m<array.length;m++){
			System.out.println(array[m]);
		}
	}

}
