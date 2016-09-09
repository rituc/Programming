# Find the largest power of 2 (most significant bit in binary form), which is less than or equal to the given number N.
def main():
  N = int(raw_input("Enter number: "))
  print largest_power(N)

def largest_power(N):
  # changing all right side bits to 1.
  N = N| (N>>1)
  N = N| (N>>2)
  N = N| (N>>4)
  N = N| (N>>8)

  return (N+1) >> 1
  
if __name__ == "__main__"
  main()
