package tech.loyd.sort;

public class Test {
	private static <T> void printArr(T[] arr){
		for (T i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
				
		Integer[] arr = new Integer[] {1,2,1,4,2,4,2,3,2,4,7,6,6,7,5,5,7,7};
		System.out.println("排序前：");
		printArr(arr);
		//SelectSort.selectSort(arr);//1.选择排序
		System.out.println("排序后：");
		printArr(arr);
		
	}
	
}
