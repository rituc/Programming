def main():
	print "Enter binary number"
	num = int(input())
	i = int(raw_input("Enter i: "))
	j = int(raw_input("Enter j: "))
	print swap_bits(num, i, j)

def swap_bits(num, i, j):
	ith_num = num & (1 << i)
	jth_num = num & (1 << j)
	if (ith_num == jth_num):
		return num
	else:
		num = num ^ (1 << j) 
		return num ^ (1 << i)

if __name__ == "__main__":
	main()

