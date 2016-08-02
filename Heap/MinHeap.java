class MinHeap{
	int array[];
	int heap_size;
	int capacity;

	MinHeap(int capacity){
		this.capacity = capacity;
		this.array = new int[capacity];
	}

	private int parent(int i){
		return i/2;
	}
	private int left_child(int i){
		return 2*i + 1;
	}
	private int right_child(int i){
		return 2*i + 2;
	}

  public void insert(int x){
		if (heap_size > capacity){
			System.out.println("Max capacity reached");
			return;
		} 
		i = heap_size;
		int temp;
		array[i] = x;
		while(i>=0 && array[parent(i)] > array[i]){
			swap(array[parent(i)], array[i]);
			i = parent(i);
			temp = array[parent(i)];
			array[parent(i)] = array[i];
			array[i] = temp;
		}
		heap_size++;
	}

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int capacity;
		capacity = in.nextInt();
		MinHeap heap = new MinHeap(capacity);
		for(int i=0; i<capacity; i++){
			insert(a, in.nextInt());
		}
	}
}