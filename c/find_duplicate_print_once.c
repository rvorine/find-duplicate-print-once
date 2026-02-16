#include <stdio.h>
#include <stdbool.h>

#define MAX_SIZE 1000

void findAndPrintDuplicates(int arr[], int size) {
    bool seen[MAX_SIZE] = {false};
    bool duplicates[MAX_SIZE] = {false};
    bool hasDuplicates = false;
    
    // Find duplicates
    for (int i = 0; i < size; i++) {
        if (arr[i] >= 0 && arr[i] < MAX_SIZE) {
            if (seen[arr[i]]) {
                duplicates[arr[i]] = true;
            } else {
                seen[arr[i]] = true;
            }
        }
    }
    
    // Print duplicates (each printed once)
    for (int i = 0; i < MAX_SIZE; i++) {
        if (duplicates[i]) {
            printf("%d\n", i);
            hasDuplicates = true;
        }
    }
    
    if (!hasDuplicates) {
        printf("No duplicates found.\n");
    }
}

int main() {
    // Sample array with duplicates
    int numbers[] = {1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 1, 9, 4};
    int size = sizeof(numbers) / sizeof(numbers[0]);
    
    printf("Original Array: ");
    for (int i = 0; i < size; i++) {
        printf("%d ", numbers[i]);
    }
    printf("\n\nDuplicate elements (printed once):\n");
    
    findAndPrintDuplicates(numbers, size);
    
    return 0;
}
