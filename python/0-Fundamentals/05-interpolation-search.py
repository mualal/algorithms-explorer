def interpolation_search(lst, val):

    min_ind = 0
    max_ind = len(lst) - 1
    steps = 0

    while min_ind <= max_ind:

        steps += 1

        if max_ind == min_ind:
            return min_ind if lst[min_ind] == val else -1
        
        mid_ind = min_ind + (max_ind - min_ind) * (val - lst[min_ind]) // (lst[max_ind] - lst[min_ind])

        if mid_ind < min_ind or mid_ind > max_ind:
            return -1, steps
        
        if lst[mid_ind] < val:
            min_ind = mid_ind + 1
        elif lst[mid_ind] > val:
            max_ind = mid_ind - 1
        else:
            return mid_ind, steps
    
    return -1, steps


if __name__ == '__main__':
    values = [1, 1, 2, 3, 3, 4, 4, 5]
    val = 3
    ind, steps = interpolation_search(values, val)
    print('Index:', ind)
    print('Steps', steps)
