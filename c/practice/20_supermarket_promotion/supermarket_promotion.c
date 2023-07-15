#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_RECEIPTS 1000000
#define MAX_COST 1000000

typedef struct receipt {
    int cost;
    int used;
} receipt;

int extract_max(receipt receipts[], int num_receipts) {
    int max, max_index, i;
    max = -1;
    for (i = 0; i < num_receipts; i++) {
        if (!receipts[i].used && receipts[i].cost > max) {
            max_index = i;
            max = receipts[i].cost;
        }
    }
    receipts[max_index].used = 1;
    return max;
}

int extract_min(receipt receipts[], int num_receipts) {
    int min, min_index, i;
    min = MAX_COST + 1;
    for (i = 0; i < num_receipts; i++) {
        if (!receipts[i].used && receipts[i].cost < min) {
            min_index = i;
            min = receipts[i].cost;
        }
    }
    receipts[min_index].used = 1;
    return min;
}

typedef struct heap_element {
    int receipt_index;
    int cost;
} heap_element;

void max_heap_insert(heap_element heap[], int *num_heap, int receipt_index, int cost) {
    int i;
    heap_element temp;
    (*num_heap)++;
    heap[*num_heap] = (heap_element){receipt_index, cost};
    i = *num_heap;
    while (i > 1 && heap[i].cost > heap[i / 2].cost) {
        temp = heap[i];
        heap[i] = heap[i / 2];
        heap[i / 2] = temp;
        i = i / 2;
    }
}

heap_element max_heap_extract(heap_element heap[], int *num_heap) {
    heap_element remove, temp;
    int i, child;
    remove = heap[1];
    heap[1] = heap[*num_heap];
    (*num_heap)--;
    i = 1;
    while (i * 2 <= *num_heap) {
        child = i * 2;
        if (child < *num_heap && heap[child + 1].cost > heap[child].cost) {
            child++;
        }
        if (heap[child].cost > heap[i].cost) {
            temp = heap[i];
            heap[i] = heap[child];
            heap[child] = temp;
            i = child;
        } else {
            break;
        }
    }
    return remove;
}

void min_heap_insert(heap_element heap[], int *num_heap, int receipt_index, int cost) {
    int i;
    heap_element temp;
    (*num_heap)++;
    heap[*num_heap] = (heap_element){receipt_index, cost};
    i = *num_heap;
    while (i > 1 && heap[i].cost < heap[i / 2].cost) {
        temp = heap[i];
        heap[i] = heap[i / 2];
        heap[i / 2] = temp;
        i = i / 2;
    }
}

heap_element min_heap_extract(heap_element heap[], int *num_heap) {
    heap_element remove, temp;
    int i, child;
    remove = heap[1];
    heap[1] = heap[*num_heap];
    (*num_heap)--;
    i = 1;
    while (i * 2 <= *num_heap) {
        child = i * 2;
        if (child < *num_heap && heap[child + 1].cost < heap[child].cost) {
            child++;
        }
        if (heap[child].cost < heap[i].cost) {
            temp = heap[i];
            heap[i] = heap[child];
            heap[child] = temp;
            i = child;
        } else {
            break;
        }
    }
    return remove;
}

int slow(void) {
    static struct receipt receipts[MAX_RECEIPTS];
    int num_days, num_receipts_today;
    int num_receipts = 0;
    long long total_prizes = 0;
    int i, j, max, min;
    scanf("%d", &num_days);

    for (i = 0; i < num_days; i++) {
        scanf("%d", &num_receipts_today);
        for (j = 0; j < num_receipts_today; j++) {
            scanf("%d", &receipts[num_receipts].cost);
            receipts[num_receipts].used = 0;
            num_receipts++;
        }
        max = extract_max(receipts, num_receipts);
        min = extract_min(receipts, num_receipts);
        total_prizes += max - min;
    }
    printf("%lld\n", total_prizes);
    return 0;
}

int main(void) {
    static int used[MAX_RECEIPTS] = {0};
    static heap_element min_heap[MAX_RECEIPTS + 1];
    static heap_element max_heap[MAX_RECEIPTS + 1];
    int num_days, receipt_index_today;
    int receipt_index = 0;
    long long total_prizes = 0;
    int i, j, cost;
    int min_num_heap = 0, max_num_heap = 0;
    heap_element min_element, max_element;
    scanf("%d", &num_days);
    for (i = 0; i < num_days; i++) {
        scanf("%d", &receipt_index_today);
        for (j = 0; j < receipt_index_today; j++) {
            scanf("%d", &cost);
            max_heap_insert(max_heap, &max_num_heap, receipt_index, cost);
            min_heap_insert(min_heap, &min_num_heap, receipt_index, cost);
            receipt_index++;
        }

        max_element = max_heap_extract(max_heap, &max_num_heap);
        while (used[max_element.receipt_index]) {
            max_element = max_heap_extract(max_heap, &max_num_heap);
        }
        used[max_element.receipt_index] = 1;

        min_element = min_heap_extract(min_heap, &min_num_heap);
        while (used[min_element.receipt_index]) {
            min_element = min_heap_extract(min_heap, &min_num_heap);
        }
        used[min_element.receipt_index] = 1;
        total_prizes += max_element.cost - min_element.cost;
    }
    printf("%lld\n", total_prizes);
    return 0;
}
