const arr = [123, 0 , -1, 45, 25, 91, -5, -9, 14, 67, 987, 11, 32, 174, 1, 0, 1, -1, 3, 0]
let count = 0

function bubbleSort(array) {
    for (let i = 0; i < array.length; i++) {
        for (let j = 0; j < array.length; j++) {
            if (array[j + 1] < array[j]) {
                // rearrange two elements
                array[j + 1] += array[j]
                array[j] = array[j + 1] - array[j]
                array[j + 1] -= array[j]
            }
            count += 1
        }
    }
}

bubbleSort(arr)

console.log(arr)
console.log(arr.length)
console.log(count)
