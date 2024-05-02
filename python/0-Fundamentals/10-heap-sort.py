def heap_sort(values):
    
    make_heap(values)
    for i in range(len(values)):
        last_idx = (len(values) - 2) - i
        values[0], values[last_idx + 1] = values[last_idx + 1], values[0]
        remake_heap(values, last_idx=last_idx)


def make_heap(values):

    for i in range(len(values)):
        idx = i
        while idx != 0:
            parent_idx = (idx - 1) // 2
            if values[idx] <= values[parent_idx]:
                break
            values[idx], values[parent_idx] = values[parent_idx], values[idx]
            idx = parent_idx


def remake_heap(values, last_idx):

    idx = 0
    while True:
        child1_idx = 2 * idx + 1
        child2_idx = 2 * idx + 2

        if child1_idx > last_idx:
            child1_idx = idx
        if child2_idx > last_idx:
            child2_idx = idx
        
        if (values[idx] >= values[child1_idx]) and (values[idx] >= values[child2_idx]):
            break

        if values[child1_idx] > values[child2_idx]:
            swap_child_idx = child1_idx
        else:
            swap_child_idx = child2_idx
        
        values[idx], values[swap_child_idx] = values[swap_child_idx], values[idx]
        idx = swap_child_idx


if __name__ == '__main__':
    values = [54, 48, 31, 100, 27, 12, 7, 1, -8, -21, -33]
    print('Before:', values)
    heap_sort(values)
    print('After:', values)
