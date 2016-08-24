def main():
	print "Enter number: "
	num = int(input())
	print reverseBits(num)

def reverseBits(num):
	reverse_num = 0
	while num > 0:
		if (num & 1 == 1):
			curr_bit = 1
		else:
			curr_bit = 0
		reverse_num = (reverse_num << 1) ^ curr_bit
		num = num >> 1
	return reverse_num

if __name__ == "__main__":
	main()
