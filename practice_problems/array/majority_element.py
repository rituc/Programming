# http://www.geeksforgeeks.org/majority-element/
def main():
	print "Enter number of test cases"
	T = int(input())
	for t in range(T):
		print "Enter array size"
		n = int(input())
		a = []
		for i in range(n):
			a.append(int(input()))
		# print find_majority_elm(a, n)
		print is_majority(a, n, get_majority_candidate(a, n))

def check_majority_elm(a, n):
	max_num = max(a)
	count = []
	for i in range(max_num+1):
		count.append(0)
	for num in a:
		count[num] = count[num] + 1
	print count

	if max(count) > n/2:
		return True
	return False

def get_majority_candidate(a, n):
	maj_index = 0
	count = 1
	for i in range(1, n):
		if a[maj_index] == a[i]:
			count += 1
		else:
			count -=1
		if count == 0:
			maj_index = i
			count = 1
	return a[maj_index]

def is_majority(a, n, num):
	count = 0
	for i in range(n):
		if num == a[i]:
			count += 1
		if count > n/2:
			return True
	return False

if __name__ == "__main__":
	main()




