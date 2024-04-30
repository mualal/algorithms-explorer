def insertion_sort(values):

    for i in range(1, len(values)):
        j = i - 1
        while values[j + 1] < values[j] and j >= 0:
            values[j + 1], values[j] = values[j], values[j + 1]
            j -= 1


if __name__ == '__main__':
    values = [54, 48, 31, 100, 27, 12, 7, 1, -8, -21, -33]
    print('Before:', values)
    insertion_sort(values)
    print('After:', values)
