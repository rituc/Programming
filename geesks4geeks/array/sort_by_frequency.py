
def main():
	print "Enter numer of test cases:"
	T = int(input())
	for i in range(T):
		print "Enter Array Size: "
		n = int(input())
		a = []
		for elm in range(n):
			a.append(int(raw_input("Enter array ele: ")))
		sort_by_freq(a, n)

def sort_by_freq(a, n):
	a.sort()
	print a

if __name__ == "__main__":
	main()