# http://www.geeksforgeeks.org/write-a-c-program-that-given-a-set-a-of-n-numbers-and-another-number-x-determines-whether-or-not-there
# -exist-two-elements-in-s-whose-sum-is-exactly-x/
def main():
	print "Enter number of test cases:"
	T = int(input())
	print "Enter array size and sum: "
	for t in range(T):
		N = int(input())
		x = int(input())
		a = []
		for i in range(N):
			a.append(int(input()))
		print find_pair_sum(a, x, N)

def find_pair_sum(a, x, N):
	a.sort()
	start = 0
	end = N
	for i in a:
		num = x - i
		while(start <= end):
			mid = (start + end)/2
			if(num == a[mid]):
				return True
			elif(num <= a[mid]):
				end = mid -1
			else:
				start = mid + 1
	return False

if __name__ == "__main__":
	main()

