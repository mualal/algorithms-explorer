class Sorting:

    def __init__(self, a: list):
        self.a = a
        self.a_sorted = a.copy()

    def bubble_sort(self) -> list:
        for i, _ in enumerate(self.a_sorted[1:], start=1):
            flag = False
            for j, _ in enumerate(self.a_sorted[:-i]):
                if self.a_sorted[j] > self.a_sorted[j + 1]:
                    self.a_sorted[j], self.a_sorted[j + 1] = self.a_sorted[j + 1], self.a_sorted[j]
                    flag = True
            if not flag:
                break
        return self.a_sorted

    def insertion_sort(self) -> list:
        for i, _ in enumerate(self.a_sorted[1:], start=1):
            current_element = self.a_sorted[i]
            j = i - 1
            while j >= 0 and self.a_sorted[j] > current_element:
                self.a_sorted[j + 1] = self.a_sorted[j]
                j = j - 1
            self.a_sorted[j + 1] = current_element
        return self.a_sorted

    def merge(self, p: int, q: int, r: int):
        left = self.a_sorted[p:q + 1]
        right = self.a_sorted[q + 1:r + 1]
        i = 0
        j = 0
        k = p
        while i < len(left) and j < len(right):
            if left[i] < right[j]:
                self.a_sorted[k] = left[i]
                i += 1
            else:
                self.a_sorted[k] = right[j]
                j += 1
            k += 1

        while i < len(left):
            self.a_sorted[k] = left[i]
            i += 1
            k += 1

        while j < len(right):
            self.a_sorted[k] = right[j]
            j += 1
            k += 1

    def merge_sort(self, p: int, r: int):
        if p < r:
            mid = (p + r) // 2
            self.merge_sort(p, mid)
            self.merge_sort(mid + 1, r)
            self.merge(p, mid, r)


print(Sorting([6, 5, 2, 3, 1]).bubble_sort())
print(Sorting([5, 6, 1, 3, 2]).insertion_sort())

object_to_sort = Sorting([6, 5, 2, 3, 1, -1, 7])
object_to_sort.merge_sort(0, len(object_to_sort.a_sorted) - 1)
print(object_to_sort.a_sorted)
