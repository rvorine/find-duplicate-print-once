def find_and_print_duplicates(arr):
    """
    Find duplicate elements in an array and print each duplicate only once.
    
    Args:
        arr: List of elements to check for duplicates
    """
    seen = set()
    duplicates = set()
    
    # Find duplicates
    for num in arr:
        if num in seen:
            duplicates.add(num)
        else:
            seen.add(num)
    
    # Print duplicates (automatically printed once due to set)
    if not duplicates:
        print("No duplicates found.")
    else:
        for duplicate in duplicates:
            print(duplicate)


if __name__ == "__main__":
    # Sample array with duplicates
    numbers = [1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 1, 9, 4]
    
    print("Original Array:", numbers)
    print("\nDuplicate elements (printed once):")
    
    find_and_print_duplicates(numbers)
