def main():
	print "enter number: "
	num = int(input())
	print closest_bit(num)
	
def closet_bit(num):
	for (i = 0; i < 63; i++){
		if(((x >> i) & 1) ^ ((x >> (i + 1)) & 1)){
		x ^ = (1 << i) | (1 << (i+1))
		return x
		}
	}

if __name__ = "__main__":
	main()