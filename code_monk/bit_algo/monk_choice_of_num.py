# https://www.hackerearth.com/code-monk-bit-manipulation/algorithm/monks-choice-of-numbers-1/editorial/
def main():
	T = int(raw_input("Enter number of test cases: "))
	for t in range(T):
		max = 0
		N = int(raw_input("Enter list size: "))
		for i in range(N):
			one_counts = count_ones(int(raw_input("Enter number: ")))
			if max < one_counts:
				max = one_counts
		print one_counts

def count_one (int n)
  while(n):
  n = n&(n-1);
     count++;
  return count;

if __name__ == "__main__":
	main()



