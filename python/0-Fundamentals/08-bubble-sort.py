def bubble_sort(values):

    is_sorted = False
    positioned = 0
    while not is_sorted:
        is_sorted = True
        for i in range(1, len(values) - positioned):
            if values[i - 1] > values[i]:
                values[i - 1], values[i] = values[i], values[i - 1]
                is_sorted = False
        positioned += 1


if __name__ == '__main__':
    values = [54, 48, 31, 100, 27, 12, 7, 1, -8, -21, -33]
    print('Before:', values)
    bubble_sort(values)
    print('After:', values)
