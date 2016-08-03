def main():
	print "Enter number of test cases"
	T = int(input())
	for t in range(T):
		print "Enter array size of first array:"
		n = int(input())
		print "Enter number of elements in second array:"
		m = int(input())
		nplusm = []
		a = []

		for i in range(n+m):
			nplusm.append(int(raw_input("array1 elem:")))
		for i in range(int(m)):
			a.append(int(raw_input("array2 elem:")))
		print merge_array(nplusm, a, n, m)

def merge_array(nplusm, a, n, m):
	b = shift_array_elem(nplusm, n, m)
	j = 0
	i = m+n-1
	for k in range(n+m):
		if (a[j] < b[i]):
			b[k] = a[j]
			j += 1
		else:
			b[k] = b[i]
			i -= 1
	return b


def shift_array_elem(a, n, m):
	print "last array element initial", a[n+m-1]
	j = n+m-1
	for i in range(n+m-1, 0, -1):
		if(a[i] != -1):
			a[j] = a[i]
			j -= 1
	print "shifted array", a
	return a

if __name__ == "__main__":
	main()

