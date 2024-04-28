class Array:

    def __init__(self, size):
        self.data = [None] * size
        self.length = 0
        self.size = size
    
    def append(self, value):
        if self.length < self.size:
            self.data[self.length] = value
            self.length += 1
        else:
            raise OverflowError
    
    def min(self):
        cur_min = None
        for i in range(self.length):
            cur_min = self.data[i] if not cur_min or self.data[i] < cur_min else cur_min
        return cur_min
    
    def max(self):
        cur_max = None
        for i in range(self.length):
            cur_max = self.data[i] if not cur_max or self.data[i] > cur_max else cur_max
        return cur_max
    
    def avg(self):
        cur_sum = 0
        for i in range(self.length):
            cur_sum += self.data[i]
        return cur_sum / self.length
    
    def reverse(self):
        l = self.length
        for i in range(l // 2):
            self.data[i], self.data[l - i - 1] = self.data[l - i - 1], self.data[i]
    
    def insert(self, index, value):
        if self.length == self.size:
            raise OverflowError
        if index >= self.length:
            self.data[self.length] = value
        else:
            for i in range(self.length - 1, index - 1, -1):
                self.data[i + 1] = self.data[i]
            self.data[index] = value
        self.length += 1
    
    def remove(self, value):
        for i in range(self.length):
            if self.data[i] == value:
                for j in range(i, self.length - 1):
                    self.data[j] = self.data[j + 1]
                self.data[self.length - 1] = None
                self.length -= 1
                break
    
    def remove_all_occurrences(self, value):
        i = 0
        while i < self.length:
            if self.data[i] == value:
                for j in range(i, self.length - 1):
                    self.data[j] = self.data[j + 1]
                self.data[self.length - 1] = None
                self.length -= 1
                continue
            i += 1

    def __str__(self):
        return '[' + ', '.join(map(str, self.data[:self.length])) + ']'


def merge(lst1, lst2):
    result = []
    i = j = 0
    while i != len(lst1) and j != len(lst2):
        if lst1[i] < lst2[j]:
            result.append(lst1[i])
            i += 1
        else:
            result.append(lst2[j])
            j += 1
    if i == len(lst1):
        for k in range(j, len(lst2)):
            result.append(lst2[k])
    else:
        for k in range(i, len(lst1)):
            result.append(lst1[k])
    return result


if __name__ == '__main__':
    
    array = Array(size=5)
    print('Initial Size:', array.size)
    print('Initial Length:', array.length)
    for i in range(5):
        array.append(i + 1)
    print('Current Array:', array)
    try:
        array.append(6)
    except OverflowError:
        print('OverflowError occured')
    print('Min:', array.min())
    print('Max:', array.max())
    print('Avg:', array.avg())
    array.reverse()
    print('Reversed array:', array)
    array.remove(3)
    print('Array:', array)
    array.insert(0, 5)
    print('Array', array)
    array.remove_all_occurrences(5)
    print('Array', array)

    a = [1, 3, 7, 11, 22, 33]
    b = [1, 2, 4, 9, 15, 28, 44, 55, 77, 88]
    print('Merged list:', merge(a, b))
