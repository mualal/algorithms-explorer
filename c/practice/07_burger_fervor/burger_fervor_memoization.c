#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int max(int v1, int v2) {
    if (v1 > v2) {
        return v1;
    } else {
        return v2;
    }
}

unsigned long long total_calls;

int solve_t(int m, int n, int t, int memo[]) {
    int first, second;
    total_calls++;
    if (memo[t] != -2) {
        return memo[t];
    }
    if (t == 0) {
        memo[t] = 0;
        return memo[t];
    }
    if (t >= m) {
        first = solve_t(m, n, t - m, memo);
    } else {
        first = -1;
    }
    if (t >= n) {
        second = solve_t(m, n, t - n, memo);
    } else {
        second = -1;
    }
    if (first == -1 && second == -1) {
        memo[t] = -1;
        return memo[t];
    } else {
        memo[t] = max(first, second) + 1;
        return memo[t];
    }
}

#define SIZE 10000

void solve(int m, int n, int t) {
    int result, i;
    total_calls = 0;
    int memo[SIZE];
    for (i = 0; i <= t; i++) {
        memo[i] = -2;
    }
    result = solve_t(m, n, t, memo);
    if (result >= 0) {
        printf("%d\n", result);
    } else {
        i = t - 1;
        result = solve_t(m, n, i, memo);
        while (result == -1) {
            i--;
            result = solve_t(m, n, i, memo);
        }
        printf("%d %d\n", result, t - i);
    }
    printf("Total calls to solve_t: %llu\n", total_calls);
}

int main(void) {
    int m, n, t;
    while (scanf("%d%d%d", &m, &n, &t) != -1) {
        solve(m, n, t);
    }
    return 0;
}
