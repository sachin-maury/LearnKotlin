fun binarySearch(arr: IntArray, target: Int): Int {
    var left = 0
    var right = arr.size - 1

    while (left <= right) {
        val mid = left + (right - left) / 2
        when {
            arr[mid] == target -> return mid
            arr[mid] < target -> left = mid + 1
            else -> right = mid - 1
        }
    }
    return -1 // Element not found
}

fun main() {
    val arr = intArrayOf(1, 2, 3, 4, 5, 6)
    val target = 4
    println("Element found at index: ${binarySearch(arr, target)}")
}
