from collections import Counter

repeat =int(input())

for i in range(repeat):
    num = int(input())
    nums = list(map(int, input().split()))
    print("#",end="")
    print(i+1,end=" ")
    c=Counter(nums).most_common(1)
    print(c.pop()[0])
