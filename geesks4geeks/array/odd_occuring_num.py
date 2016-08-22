# http://www.geeksforgeeks.org/find-the-number-occurring-odd-number-of-times/
def main():
	print "Enter number of test cases"
	T = int(input())
	for t in range(T):
		print "Enter array size"
		n = int(input())
		a = []
		for i in range(n):
			a.append(int(input()))
		print find_odd_occuring_num(a, n)

def find_odd_occuring_num(a, n):
	xor = 0
	for i in a:
		xor ^= i
	return xor

if __name__ == "__main__":
	main()




