import java.util.ArrayList;
import java.util.Collections;
/*Emma Chiusano
 * CSE 017
 * PP3
 * Date Created: 1 December 2021
 * Last Date Modified: 1 December 2021*/
public class Test {
	public static void main (String[]args) {
		ArrayList<Integer>randomList=new ArrayList<>();
		final int SIZE=1000;//100000 and 10000 require too much memory and are csusing a stack overflow
		//professor oudghiri said i could make it 1000
		for(int i=0; i<SIZE; i++) {
			int random=(int)(Math.random()*(SIZE-1))+1;
			randomList.add(random);
		}
		
		ArrayList<Integer> sortedList=new ArrayList<>();
		sortedList=(ArrayList)randomList.clone();
		Collections.sort(sortedList);
		
		ArrayList<Integer> reversedList=new ArrayList<>();
		reversedList=(ArrayList)randomList.clone();
		Collections.reverse(reversedList);
		
		long randomIt=0;
		long sortIt=0;
		long reverseIt=0;
		
		System.out.println("Dataset Size: "+SIZE);
		System.out.println();
		System.out.printf("%-20s\t%-10s\t%-10s\t%-10s\n", "Sorting Algorithm", "Random", "Sorted","Reversed");
	
		Sort.selectionSort(randomList);
		Collections.shuffle(randomList);
		randomIt=(long)Sort.iterations[0];
		Sort.iterations[0]=0;
		
		Sort.selectionSort(sortedList);
		Collections.shuffle(sortedList);
		sortIt=(long)Sort.iterations[0];
		Sort.iterations[0]=0;
		
		Sort.selectionSort(reversedList);
		Collections.shuffle(reversedList);
		reverseIt=(long)Sort.iterations[0];
		Sort.iterations[0]=0;
		
		System.out.printf("%-20s\t%-10d\t%-10d\t%-10d\n", "Selection Sort", randomIt, sortIt,reverseIt);
		
		Sort.insertionSort(randomList);
		Collections.shuffle(randomList);
		randomIt=(long)Sort.iterations[1];
		Sort.iterations[1]=0;
		
		Sort.insertionSort(sortedList);
		Collections.shuffle(sortedList);
		sortIt=(long)Sort.iterations[1];
		Sort.iterations[1]=0;
		
		Sort.insertionSort(reversedList);
		Collections.shuffle(reversedList);
		reverseIt=(long)Sort.iterations[1];
		Sort.iterations[1]=0;
		
		System.out.printf("%-20s\t%-10d\t%-10d\t%-10d\n", "Insertion Sort", randomIt, sortIt,reverseIt);
		
		Sort.bubbleSort(randomList);
		Collections.shuffle(randomList);
		randomIt=(long)Sort.iterations[2];
		Sort.iterations[2]=0;
		
		Sort.bubbleSort(sortedList);
		Collections.shuffle(sortedList);
		sortIt=(long)Sort.iterations[2];
		Sort.iterations[2]=0;
		
		Sort.bubbleSort(reversedList);
		Collections.shuffle(reversedList);
		reverseIt=(long)Sort.iterations[2];
		Sort.iterations[2]=0;
		
		System.out.printf("%-20s\t%-10d\t%-10d\t%-10d\n", "Bubble Sort", randomIt, sortIt,reverseIt);
		
		Sort.mergeSort(randomList);
		Collections.shuffle(randomList);
		randomIt=(long)Sort.iterations[3];
		Sort.iterations[3]=0;
		
		Sort.mergeSort(sortedList);
		Collections.shuffle(sortedList);
		sortIt=(long)Sort.iterations[3];
		Sort.iterations[3]=0;
		
		Sort.mergeSort(reversedList);
		Collections.shuffle(reversedList);
		reverseIt=(long)Sort.iterations[3];
		Sort.iterations[3]=0;
		
		System.out.printf("%-20s\t%-10d\t%-10d\t%-10d\n", "Merge Sort", randomIt, sortIt,reverseIt);
		
		Sort.quickSort(randomList);
		Collections.shuffle(randomList);
		randomIt=(long)Sort.iterations[4];
		Sort.iterations[4]=0;
		
		Sort.quickSort(sortedList);
		Collections.shuffle(sortedList);
		sortIt=(long)Sort.iterations[4];
		Sort.iterations[4]=0;
		
		Sort.quickSort(reversedList);
		Collections.shuffle(reversedList);
		reverseIt=(long)Sort.iterations[4];
		Sort.iterations[4]=0;
		
		System.out.printf("%-20s\t%-10d\t%-10d\t%-10d\n", "Quick Sort", randomIt, sortIt,reverseIt);
		
		Sort.heapSort(randomList);
		randomIt=(long)Sort.iterations[5];
		Sort.iterations[5]=0;
		
		Sort.heapSort(sortedList);
		sortIt=(long)Sort.iterations[5];
		Sort.iterations[5]=0;
		
		Sort.heapSort(reversedList);
		reverseIt=(long)Sort.iterations[5];
		Sort.iterations[5]=0;
		
		System.out.printf("%-20s\t%-10d\t%-10d\t%-10d\n", "Heap Sort", randomIt, sortIt,reverseIt);
	}
}
