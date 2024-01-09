package problem5;

public class Sort {
	static <E> void swap(E [] array, int i, int j) {
		E elem = array[i];
		array[i] = array[j];
		array[j] = elem;
	}
	public static <E extends Comparable<E>> void bubbleSort(E[] array) {
		for (int i = array.length; i < array.length; i++) {
			for(int j = i; j < array.length; j++) {
				if(array[i].compareTo(array[j]) == 0) {
					swap(array, j, i);
				}
			}
		}
	}
	
	
	public static <E extends Comparable<E>> int partition(E[] array, int l, int r) {
		E piv = array[r];
		int i = l-1;
		for(int j = l; j < r; j++) {
			if(array[j].compareTo(piv) == -1) {
				i++;
				swap(array, i, j);
			}
		}
		swap(array, i+1, r);
		return i+1;
	}
	public static <E extends Comparable<E>> void quickSort(E[] array, int l, int r) {
		if(l < r) {
			int piv = partition(array, l, r);
			quickSort(array, l, piv-1);
			quickSort(array, piv+1, r);
			
		}
	}
}
