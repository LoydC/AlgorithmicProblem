package tech.loyd.sort;

public class SelectSort {
	
	public static <T extends Comparable<T>> void selectSort(T[] arr){
		int min;//记录每次循环时的最小位置的序号
		for(int i=0;i<arr.length-1;i++){
			min = i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j].compareTo(arr[min])<0){
					min = j;
				}
			}
			swap(arr,i,min);
		}
	}
	
	private static <T extends Comparable<T>> void swap(T[] arr,int i,int j){
		T temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
}
