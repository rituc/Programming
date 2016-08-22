def main():
	print "Enter number of test cases:"
	T = int(input())
	for i in range(T):
		print "Enter array size: "
		n = int(input())
		a = []
		for elm in range(n):
			a.append(int(raw_input("enter array elem: ")))
		print "Enter size for array rotation :"
		d = int(input())
		print rotate_array(a, n, d)

def rotate_array(a, n, d):
	a = reverse(a, 0, d-1)
	a = reverse(a, d, n-1)
	a = reverse(a, 0, n-1)
	return a

def reverse(a, start, end):
	while(start <= end):
		temp = a[start]
		a[start] = a[end]
		a[end] = temp
		start+=1
		end-=1
	return a
	

if __name__ == "__main__":
	main()

