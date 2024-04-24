def linear_search(lst, x):
    for i, v in enumerate(lst):
        if v == x:
            return i
    return -1


def linear_search_all(lst, x):
    inds = []
    for i, v in enumerate(lst):
        if v == x:
            inds.append(i)
    return inds if inds else -1


if __name__ == '__main__':
    lst = [1, 3, 4, 8, 12, 12, 15, 15, 15, 8, 8]
    x = 8
    result = linear_search(lst, x)
    print(result)
    result_all = linear_search_all(lst, x)
    print(result_all)
