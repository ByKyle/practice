def minCoins(coins, n, amt):
    cols = amt + 1
    T = [0 if idx == 0 else float("inf") for idx in range(cols)]

    for j in range(len(coins)):
        for i in range(1, cols):
            coin = coins[j]
            if i >= coins[j]:
                if T[i] > 1 + T[i - coin]:
                    T[i] = 1 + T[i - coin]
    return T[cols - 1] if T[cols - 1] != float("inf") else -1


for _ in range(int(input())):
    n, amt = map(int, input().split())
    coins = list(map(int, input().split()))
    print(minCoins(coins, n, amt))