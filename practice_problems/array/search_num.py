# http://www.geeksforgeeks.org/search-an-element-in-a-sorted-and-pivoted-array/
def main():
	print "Enter number of test cases:"
	T = int(input())
	print "Enter array size"
	for t in range(T):
		n = int(input())
		a = []
		for i in range(n):
			a.append(int(input()))
		print a
		print find_pivot(a, n)

def find_pivot(a, n):
	start = 0
	end = n
	while(start <= end):
		mid = (start + end)/2
		if(a[mid-1] > a[mid]):
			return mid
		elif(a[0] > a[mid] and a[mid] < a[mid-1]):
			end = mid - 1
		else:
			start = mid + 1
	return -1


if __name__ == "__main__":
	main()