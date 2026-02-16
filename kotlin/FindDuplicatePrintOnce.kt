fun findAndPrintDuplicates(arr: IntArray) {
    val seen = mutableSetOf<Int>()
    val duplicates = mutableSetOf<Int>()
    
    // Find duplicates
    for (num in arr) {
        if (num in seen) {
            duplicates.add(num)
        } else {
            seen.add(num)
        }
    }
    
    // Print duplicates (automatically printed once due to Set)
    if (duplicates.isEmpty()) {
        println("No duplicates found.")
    } else {
        duplicates.forEach { println(it) }
    }
}

fun main() {
    // Sample array with duplicates
    val numbers = intArrayOf(1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 1, 9, 4)
    
    println("Original Array: ${numbers.contentToString()}")
    println("\nDuplicate elements (printed once):")
    
    findAndPrintDuplicates(numbers)
}
