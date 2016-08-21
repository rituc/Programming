def main():
	print "Enter number"
	num = long(input())
	print "Even" if find_parity(num) == 0 else "Odd"
	# test()


def find_parity(num):
	return 0 if (num & 1) == 0 else 1


def test():
	assert find_parity(0) == 0
	assert find_parity(1) == 1
	assert find_parity(110) == 0
	assert find_parity(1000) == 0


if __name__ == "__main__":
	main()