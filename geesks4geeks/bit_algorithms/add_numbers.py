# http://www.geeksforgeeks.org/add-two-numbers-without-using-arithmetic-operators/
def main():
	x = int(raw_input("Enter first number"))
	y = int(raw_input("Enter second number"))
	print add(x, y)

def add(x, y):
	while(y != 0):
		carry = x & y
		x = x ^ y
		y = carry << 1
	return x

if __name__ = "__main__"
	main()