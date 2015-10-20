class LargestSum{

	static int findLargestSum(int a[]){
		int maxSoFar = 0, maxHere = 0;
		for(int i = 0; i < a.lenghth; i++){
			maxHere = maxHere + a[i];
			if(maxHere < 0) {
				maxHere = 0
			}
			if(maxSoFar < maxHere){
				maxSoFar = maxHere;
			}
		}
		return maxSoFar;
	}

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int T, N;
		int largestSum = 0;
		T = in.nextInt();

		for(int t = 0; t < T; t++){
			N = in.nextInt();
			int num[] = new int[N];
			for(int i = 0; i < N; i++){
				num[i] = in.nextInt();
			}
			System.out.println(findLargestSum(num));
		}
	}
}