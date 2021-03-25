num = int(input())

for i in range(1, num + 1):
    temp = 0
    temp += str(i).count('3')
    temp += str(i).count('6')
    temp += str(i).count('9')
    if temp > 0:
        for j in range(temp):
            print("-", end="")
        print(" ", end="")
    else:
        print(i, end=" ")


