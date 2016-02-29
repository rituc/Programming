class MinHeap{
	int array[];
	int heap_size;
	int capacity;

	MinHeap(int capacity){
		this.capacity = capacity;
	}

	int parent(int i){
		return i/2;
	}
	int left_child(int i){
		return 2*i + 1;
	}
	int right_child(int i){
		return 2*i + 2;
	}
	void swap(int x, int y){
		int 

	}

	static insert(int a[], int x){
		if (heap_size > capacity){
			System.out.println("Max capacity reached");
			return;
		} 
		i = heap_size;
		int temp
		array[i] = x;
		while(i>=0 && array[parent(i)] > array[i]){
			swap( array[parent(i)], array[i]);
			i = parent(i);
			temp = array[parent(i)];
			 array[parent(i)] = array[i];
			 array[i] = temp;
		}
	}

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int capacity;
		capacity = in.nextInt();
		MinHeap heap = new MinHeap(capacity);
		int a[] = new int[capacity];
		for(int i=0; i<capacity; i++){
			insert(a, in.nextInt());
		}
	}
}