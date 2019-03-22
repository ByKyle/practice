t = int(input())


# input(),input()
def code():
    n = int(input())
    st = [int(i) for i in input().split()]
    tups = list(zip(st[1::3], st[2::3]))
    tups = sorted(tups, key=lambda x: x[1], reverse=True)
    # print(tups)

    prof = 0
    jobs = 0
    emp = [1] * n
    for tup in tups:
        f = tup[0] - 1
        try:
            emp[f]
        except:
            f = n - 1
        while f != -1:
            if emp[f] == 1:
                prof += tup[1]
                jobs += 1
                emp[f] = 0
                break
            else:
                f -= 1
    print(str(jobs) + ' ' + str(prof))


for i in range(t):
    code()


