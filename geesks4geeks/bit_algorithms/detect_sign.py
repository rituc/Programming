# http://www.geeksforgeeks.org/detect-if-two-integers-have-opposite-signs/
def main():
	num1 = int(raw_input("Enter First Number"))
	num2 = int(raw_input("Enter second Number"))
	print detect_sign(num1, num2)

def detect_sign(num1, num2):
	return (num1^num2 < 0)
