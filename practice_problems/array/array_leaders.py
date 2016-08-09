import sys

def main():
	print "Enter numer of test cases:"
	T = int(input())
	for i in range(T):
		print "Enter Array Size: "
		n = int(input())
		a = []
		for elm in range(n):
			a.append(int(raw_input("Enter array ele: ")))
		get_array_leaders(a, n)

def get_array_leaders(a, n):
	max_from_right = a[n-1]
	print max_from_right
	for i in range(n-2, 0, -1):
		if max_from_right < a[i]:
			print a[i]
			max_from_right = a[i]

if __name__ == "__main__":
	main()

