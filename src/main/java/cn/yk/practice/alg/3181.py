T = int(input())
for _ in range(T):
	[n, m] = list(map(int, input().split()))
	r1 = list(map(int, input().split()))
	r2 = list(map(int, input().split()))
	common = []
	i, j, s = 0, 0, 0
	while i < n and j < m:
		if r1[i] < r2[j]:
			i += 1
		elif r1[i] > r2[j]:
			j += 1
		else:
			common.append(r1[i])
			i += 1
			j += 1
	i, j = 0, 0
	for x in common:
		a, b = 0, 0
		while i < n:
			a += r1[i]
			i += 1
			if i == n or x < r1[i]:
				break;
		while j < m:
			b += r2[j]
			j += 1
			if j == m or x < r2[j]:
				break;
		s += max(a, b)
	a = sum(r1[i:])
	b = sum(r2[j:])
	s += max(a, b)
	# s += sum(common)
	print (s)