def main():
	print "Enter number of testcases"
	T = int(input())
	for i in range(T):
		print "Enter size of first sorted array:"
		len1 = int(input())
		print "Enter size of second sorted array:"
		len2 = int(input())
		a1 = []
		a2 = []
		for i in range(len1):
			a.append(int(raw_input("array1 elem: ")))
		for j in range(len2):
			a.append(int(raw_input("array2 elem: ")))
		print find_median(a1, a2, len1, len2)

		def get_median(a1, a2, n):
			if n < 1:
				return -1
			if n == 1:
				return a[1]
			if n == 2:
				return (max(a1[0], a2[0]), min(a1[1], a2[1]))
			m1 = median(a1, n)
			m2 = median(a2, n)
			if(m1 == m2):
				return m1
			elif(m1 < m2):
				get_median(a1[(n/2)..n, a2[0..(n/2)]])
			get_median(a1[0..(n/2), a2[(n/2)..n]])

		def medain(a, n):
			if(n%2!=0):
				return a[n/2]
			else:
				return(a[n/2] + a[n/2-1])

if __name__ == "__main__":
	main()




