def main():
	num = raw_input("Enter num")
	print count_one(num)

def count_one (int n)
  while( n ):
  n = n&(n-1);
     count++;
  return count;

if __name__ == "__main__":
	main()