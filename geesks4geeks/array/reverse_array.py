def main():
	print "Enter number of test cases:"
	T = int(input())
	for i in range(T):
		print "Enter array size: "
		n = int(input())
		a = []
		for elm in range(n):
			a.append(int(raw_input("enter array elem: ")))
		print reverse(a, n)

def reverse(a, n):
	j = n-1
	for i in range(n/2):
		temp = a[i]
		a[i] = a[j]
		a[j] = temp
		j -= 1
	return a

if __name__ == "__main__":
	main()

