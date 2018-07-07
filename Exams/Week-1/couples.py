
def couple(l):
	n=len(l)
	a=[None]*n
	for i, p2 in enumerate(l):
		a[p2]=i
	count=0
	for i in range(0,n,2):
		x, z=l[i:i+2]
		y=x-1 if x%2 else x+1
		if y!=z:
			j=a[y]
			l[j]= z
			a[z]=j
			count+=1
	return count 



print (couple([1,3,4,0,2,5]))
print (couple([3,2,0,1]))
# print (couple([3,30,50,90,16,91,65,18,61,58]))
# print (couple([3,1,5,4,6,2]))
# print (couple([55,37,19,46,66,32,7,81,33,76,00,28]))
# print (couple([1,3,4,0,2,5]))
print(couple([1,0]))
# print (couple([1,3,4,0,2,5]))
# a2 = [3,2,0,1]
# couple(a2)
# a3 = [3,30,50,90,16,91,65,18,61,58]
# couple(a3)
# a4 = [3,1,5,4,6,2]
# couple(a4)
# a5 = [55,37,19,46,66,32,7,81,33,76,00,28]
# couple(a5)
# a6 = [1,3,4,0,2,5]
# couple(a6)
# a7 = [1,3,4,0,2,5]
# couple(a7)
