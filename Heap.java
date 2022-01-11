import java.util.ArrayList;
/*Emma Chiusano
 * CSE 017
 * PP3
 * Date Created: 1 December 2021
 * Last Date Modified: 2 December 2021*/
public class Heap<E extends Comparable<E>> { 
	private ArrayList<E> list;

	public Heap(){
		list = new ArrayList<>(); 
	}
	public int size(){ 
		return list.size();
	}
	public boolean isEmpty(){
		return list.isEmpty(); 
	}
	public void clear(){ 
		list.clear();
	}
	public String toString(){
		return list.toString();
	}
	public int contains(E item) { 
		int iterations=0;
		for(int i=0; i<list.size(); i++) {
			iterations++;
			if(list.get(i).equals(item)) 
				return iterations;
			}
		 return iterations;
	}
	public int add(E item) {//O(log n)
		int iterations=0;
		list.add(item); //append item to the heap 
		int currentIndex = list.size()-1;
		//index of the last element 
		while(currentIndex > 0) {
			Sort.iterations[5]++;
			int parentIndex = (currentIndex-1)/2;
			//swap if current is greater than its parent
			E current = list.get(currentIndex);
			E parent = list.get(parentIndex); if(current.compareTo(parent) > 0){
				list.set(currentIndex, parent);
				list.set(parentIndex, current); 
			}else
				break; // the tree is a heap
				currentIndex = parentIndex; 
		}
		return iterations;
	}
	public E remove() {//O(log n)
		int iterations=0;
		if(list.size() == 0) 
			return null;
		 //copy the value of the last node to root
		E removedItem = list.get(0);
		list.set(0, list.get(list.size()-1));
		 //remove the last node from the heap
		list.remove(list.size()-1); 
		int currentIndex = 0;
		while (currentIndex < list.size()) {
			Sort.iterations[5]++;
			int left = 2 * currentIndex + 1;
			int right = 2 * currentIndex + 2;
			//find the maximum of the left and right nodes 
			if (left >= list.size())
				break; // no left child 
			int maxIndex = left;
			E max = list.get(maxIndex);
			if (right < list.size()) // right child exists
				if(max.compareTo(list.get(right)) < 0)
						maxIndex = right;
			 // swap if current is less than max
			E current = list.get(currentIndex); 
			max = list.get(maxIndex); 
			if(current.compareTo(max) < 0){
				list.set(maxIndex, current); 
				list.set(currentIndex, max); 
				currentIndex = maxIndex;
			} else
				break; // the tree is a heap 
			}
			  return removedItem;
		}
}
