import math

x = 2
while x>1:
	is_prime = True
	for j in range(2, int(math.sqrt(x))+1):	
		if x%j==0:
			is_prime = False
			break
	if is_prime:
		print(x)
	x = x+1
