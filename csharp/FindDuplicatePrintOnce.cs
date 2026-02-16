using System;
using System.Collections.Generic;
using System.Linq;

class FindDuplicatePrintOnce
{
    static void Main(string[] args)
    {
        // Sample array with duplicates
        int[] numbers = { 1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 1, 9, 4 };
        
        Console.WriteLine("Original Array: [" + string.Join(", ", numbers) + "]");
        Console.WriteLine("\nDuplicate elements (printed once):");
        
        FindAndPrintDuplicates(numbers);
    }
    
    static void FindAndPrintDuplicates(int[] arr)
    {
        HashSet<int> seen = new HashSet<int>();
        HashSet<int> duplicates = new HashSet<int>();
        
        // Find duplicates
        foreach (int num in arr)
        {
            if (seen.Contains(num))
            {
                duplicates.Add(num);
            }
            else
            {
                seen.Add(num);
            }
        }
        
        // Print duplicates (automatically printed once due to HashSet)
        if (duplicates.Count == 0)
        {
            Console.WriteLine("No duplicates found.");
        }
        else
        {
            foreach (int duplicate in duplicates)
            {
                Console.WriteLine(duplicate);
            }
        }
    }
}
