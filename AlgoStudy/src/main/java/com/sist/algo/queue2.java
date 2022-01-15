package com.sist.algo;

import sys
N = int(sys.stdin.readline())
stack = []
ans = 0
for i in range(N):
    height = int(sys.stdin.readline())
    if len(stack) == 0:
        stack.append(height)
        continue
    while stack[-1]<= height:
        stack.pop()
        if len(stack) == 0:
            break
    ans += len(stack)
    stack.append(height)

print(ans)
