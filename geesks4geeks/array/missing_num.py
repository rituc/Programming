# http://www.geeksforgeeks.org/find-the-missing-number/
def main():
	print "Enter number of test cases"
	T = int(input())
	for t in range(T):
		print "Enter number"
		n = int(input())
		a = []
		for i in range(n-1):
			a.append(int(input()))
		print find_missing_num(a, n)
		

def find_missing_num(a, n):
	true_sum = n*(n+1)/2
	actual_sum = 0
	for i in a:
		actual_sum += i
	return (true_sum - actual_sum)

if __name__ == "__main__":
	main() 


