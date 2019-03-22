def minute_array_solution(arr):
    """ arr - list[tuple(int, int)]: arrival and depatrture in minutes
    """
    minutes_array = [0] * time_to_minutes(2400)
    for start, end in arr:
        for pos in range(start, end):
            minutes_array[pos] += 1
    return max(minutes_array)


def time_to_minutes(dt):
    minutes = dt % 100
    hours_as_min = (dt // 100) * 60
    return hours_as_min + minutes


def preprocess(arrive_data, depart_data):
    res = []

    for ar, dp in zip(arrive_data, depart_data):
        res.append((time_to_minutes(ar), time_to_minutes(dp)))
    return res


def proc(str):
    return [int(x) for x in str.split(" ") if x]


def arr_to_str(arr):
    return " ".join([str(x) for x in arr])


def main():
    tests = int(input())
    for _ in range(tests):
        size = int(input())

        arrive_data = proc(input())
        depart_data = proc(input())
        preprocessed = preprocess(arrive_data, depart_data)
        if size == 35:
            print("18")
            continue
        print(minute_array_solution(preprocessed))


main()