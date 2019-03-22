y = [0,-1,0,1]
cases = int(input())
for t in range(cases):
    n = int(input())
    graph = list(map(int,input().split()))
    graph = [[graph[n*i+j] for i in range(n)] for j in range(n)]
    dist = [[float("Inf")]*n for i in range(n)]
    dist[0][0] = graph[0][0]
    nodeset = set(())
    nodeset.add((graph[0][0],0,0))

    def isValid(i,j):
        return i>=0 and j>=0 and i<n and j<n
    
    while nodeset:
        minnode = min(nodeset)
        d,i,j = minnode
        nodeset.remove(minnode)
        for k in range(4):
            X, Y = i+x[k], j+y[k]
            if isValid(X,Y):
                if dist[X][Y]>dist[i][j]+graph[X][Y]:
#                     if dist[X][Y]!=float("Inf"):
#                         nodeset.remove((dist[X][Y],X,Y))
                    dist[X][Y] = dist[i][j]+graph[X][Y]
                    nodeset.add((dist[X][Y],X,Y))
    print(dist[n-1][n-1])
                    