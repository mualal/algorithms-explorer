def binary_search_first(lst, val):

    min_ind = 0
    max_ind = len(lst) - 1

    while min_ind <= max_ind:

        mid_ind = (min_ind + max_ind) // 2

        if val <= lst[mid_ind]:
            max_ind = mid_ind
        else:
            min_ind = mid_ind + 1
        
        if min_ind == max_ind:
            return min_ind if lst[min_ind] == val else -1


def binary_search_last(lst, val):

    min_ind = 0
    max_ind = len(lst) - 1

    while min_ind <= max_ind:

        mid_ind = (min_ind + max_ind) // 2 + 1

        if val < lst[mid_ind]:
            max_ind = mid_ind - 1
        else:
            min_ind = mid_ind
        
        if min_ind == max_ind:
            return min_ind if lst[min_ind] == val else -1


if __name__ == '__main__':
    values = [1, 2, 3, 3, 3, 3, 5, 7, 8, 9]
    val = 3
    print('val index (first) :', binary_search_first(values, val))
    print('val index (last) :', binary_search_last(values, val))
