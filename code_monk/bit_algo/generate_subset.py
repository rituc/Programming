def main():
  T = int(raw_input("Enter number of testcases: "))
  for t in range(T):
    arr_size = int(raw_input("Enter array size: "))
    num_array = []
    for i in arr_size:
      num_array.append(i)
    possible_subset(num_array)

def possible_subset(num_array, arr_size):
  for i in range(1 >> arr_size):
    for j in range(arr_size):
      if(i & (1 >> j))
        print num_array[j]

if __name__ == "__main__":
  main()
