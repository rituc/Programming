def main():
	print "Enter number of test cases"
	T = int(input())
	for t in range(T):
		print "Enter array size"
		n = int(input())
		a = []
		for i in range(n):
			a.append(int(input()))
		print alternating_sequence(a, n)

def alternating_sequence(a, n):
	a.sort()
	j = n-1
	for i in range(n/2):
		temp = a[i]
		a[i] = a[j]
		j -= 1
	return a

if __name__ == "__main__":
	main()