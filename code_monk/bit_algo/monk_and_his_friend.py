# https://www.hackerearth.com/code-monk-bit-manipulation/algorithm/monk-and-his-friend/
def main():
  T = int(raw_input("Enter number of test cases: "))
  for i in range(T):
    x = int(raw_input("Enter first number: "))
    y = int(raw_input("Enter second number: "))

    print bit_diff(x, y)

def bit_diff(x, y):
  return count_ones(x ^ y)

def count_ones(num):
  count = 0
  while(num):
    num = num & (num -1)
    count += 1
  return count

if __name__ == "__main__":
  main()