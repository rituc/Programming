def main():
	print "Enter number of test cases"
	T = int(input())
	for t in range(T):
		print "Enter array size"
		n = int(input())
		a = []
		for i in range(n):
			a.append(int(raw_input("enter array elem: ")))
		find_max_sum(a, n)

def find_max_sum(a, n):
	incl = a[0]
	excl = 0
	for i in range(1, n):
		# print i

		excl_new = max(excl, incl)
		inc = excl + a[i]
		excl = excl_new

		# print excl_new
		
		# print inc
		
		print excl
	
	return max(excl, incl)

if __name__ == "__main__":
	main()