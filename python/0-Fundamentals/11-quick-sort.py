def quick_sort(values, start, end):

    if start >= end:
        return
    
    divider = values[start]
    before, after = [], []
    for i in range(start + 1, end + 1):
        if values[i] < divider:
            before.append(values[i])
        else:
            after.append(values[i])
    
    idx = start
    while len(before) > 0:
        values[idx] = before.pop()
        idx += 1
    
    values[idx] = divider
    mid_idx = idx

    idx += 1
    while len(after) > 0:
        values[idx] = after.pop()
        idx += 1
    
    quick_sort(values, start, mid_idx - 1)
    quick_sort(values, mid_idx + 1, end)


if __name__ == '__main__':
    values = [54, 48, 31, 100, 27, 12, 7, 1, -8, -21, -33]
    print('Before:', values)
    quick_sort(values, start=0, end=len(values)-1)
    print('After:', values)
