class H:
    def __init__(self):
        self.a = 0
        self.b = 0
        self.d = 100001
        self.md = 10001
        self.tank = 0


from sys import stdin

T = int(stdin.readline())


def getTap(h, i):
    if h[i].b == 0:
        return (i, h[i].d)
    else:
        (t, md) = getTap(h, h[i].b)
        return (t, min(md, h[i].d))


for _ in range(T):
    [n, p] = [int(x) for x in stdin.readline().split()]
    h = []
    for _ in range(n + 1):
        h.append(H())

    for _ in range(p):
        [a, b, d] = [int(x) for x in stdin.readline().split()]
        h[a].b = b
        h[b].a = a
        h[a].d = d

    ret = []
    for i in range(1, n + 1):
        if h[i] is not None and h[i].a == 0 and h[i].b != 0:
            (t, md) = getTap(h, i)
            ret.append((i, t, md))

    print(len(ret))
    for (tank, tap, md) in ret:
        print(tank, tap, md)