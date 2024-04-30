def selection_sort(values):

    for i in range(len(values) - 1):
        min_idx = i
        for j in range(i + 1, len(values)):
            if values[j] < values[min_idx]:
                min_idx = j
        if i != min_idx:
            values[i], values[min_idx] = values[min_idx], values[i]


if __name__ == '__main__':
    values = [54, 48, 31, 100, 27, 12, 7, 1, -8, -21, -33]
    print('Before:', values)
    selection_sort(values)
    print('After:', values)
