import sys

def main():
	print "Enter number of test cases"
	T = int(input())
	for t in range(T):
		print "Enter array size"
		n = int(input())
		a = []
		for i in range(n):
			a.append(int(input()))
		print largest_sum_contiguous_subarray(a, n)

def largest_sum_contiguous_subarray(a, n):
	max_so_far = 0
	max_here = 0

	for i in range(n):
		max_here = a[i] + max_here
		if max_here < 0:
			max_here = 0
		elif max_here > max_so_far:
			max_so_far = max_here

	if max_so_far == 0:
		MAX = -sys.maxint
		for i in a:
			if(i > MAX):
				MAX = i
		max_so_far = MAX
	return max_so_far

if __name__ == "__main__":
	main()

