# Find Duplicate - Print Once

[![Instagram](https://img.shields.io/badge/Instagram-@lacopydepastel-E4405F?style=for-the-badge&logo=instagram&logoColor=white)](https://instagram.com/lacopydepastel)
[![YouTube](https://img.shields.io/badge/YouTube-@rvorine-FF0000?style=for-the-badge&logo=youtube&logoColor=white)](https://youtube.com/@rvorine)

---

## 📋 Overview

This repository contains implementations of a program that **finds duplicate elements in an array and prints each duplicate only once** across multiple programming languages:

- ☕ Java
- 🐍 Python
- 🔧 C
- 💎 C#
- 🎯 Kotlin

## 🧠 Algorithm

The program uses a simple and efficient approach:

1. **Traverse the array** and keep track of elements we've seen
2. **Identify duplicates** when we encounter an element we've already seen
3. **Store duplicates in a Set** to ensure each duplicate is recorded only once
4. **Print each duplicate** exactly once

**Time Complexity:** O(n) - Single pass through the array  
**Space Complexity:** O(n) - Storage for seen elements and duplicates

## 📁 Project Structure

```
find-duplicate-print-once/
├── java/
│   └── FindDuplicatePrintOnce.java
├── python/
│   └── find_duplicate_print_once.py
├── c/
│   └── find_duplicate_print_once.c
├── csharp/
│   └── FindDuplicatePrintOnce.cs
├── kotlin/
│   └── FindDuplicatePrintOnce.kt
└── README.md
```

## 🚀 How to Run

### Java
```bash
cd java
javac FindDuplicatePrintOnce.java
java FindDuplicatePrintOnce
```

### Python
```bash
cd python
python find_duplicate_print_once.py
# or
python3 find_duplicate_print_once.py
```

### C
```bash
cd c
gcc find_duplicate_print_once.c -o find_duplicate_print_once
./find_duplicate_print_once
```

### C#
```bash
cd csharp
# With .NET SDK (recommended):
dotnet run
# Or compile and run manually:
dotnet build
dotnet bin/Debug/net10.0/FindDuplicatePrintOnce.dll
```

### Kotlin
```bash
cd kotlin
kotlinc FindDuplicatePrintOnce.kt -include-runtime -d FindDuplicatePrintOnce.jar
java -jar FindDuplicatePrintOnce.jar
# or using Kotlin script
kotlin FindDuplicatePrintOnce.kt
```

## 📊 Example Output

For the array: `[1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 1, 9, 4]`

```
Original Array: [1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 1, 9, 4]

Duplicate elements (printed once):
1
2
3
4
```

## 🎯 Key Features

- ✅ **Efficient Algorithm:** Uses HashSet/Set for O(1) lookup time
- ✅ **No Duplicates in Output:** Each duplicate element is printed exactly once
- ✅ **Multiple Language Support:** Consistent implementation across 5 languages
- ✅ **Clean Code:** Well-commented and easy to understand
- ✅ **Sample Data Included:** Ready to run with test data

## 🤝 Contributing

Feel free to:
- Add implementations in other languages
- Improve existing code
- Report issues or bugs
- Suggest enhancements

## 📝 License

This project is open source and available for educational purposes.

## 📱 Connect With Me

- 📸 **Instagram:** [@lacopydepastel](https://instagram.com/lacopydepastel)
- 🎥 **YouTube:** [@rvorine](https://youtube.com/@rvorine)

---

⭐ If you find this helpful, please star this repository!