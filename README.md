# File I/O in Java

This repository contains examples and demonstrations of File Input and Output (I/O) operations in Java. The project covers reading and writing files using various classes and techniques provided by the Java standard library.

---

## Features

- **Reading Files**:
  - Read text files line-by-line using `BufferedReader`.
  - Read files character-by-character or byte-by-byte.
  
- **Writing Files**:
  - Write text files using `BufferedWriter`.
  - Write data to files using `FileWriter` and `PrintWriter`.
  
- **Binary File Operations**:
  - Reading and writing binary files using `FileInputStream` and `FileOutputStream`.

- **File Navigation**:
  - Working with directories and files using the `File` class.
  - Listing files and directories.
  - Creating, renaming, and deleting files.

- **Advanced File Operations**:
  - Using `NIO` package for file I/O with `Files` and `Paths`.
  - Buffered file operations for better performance.

---

## Prerequisites

- **Java Development Kit (JDK)**: Version 8 or higher.
- **IDE/Text Editor**: Any IDE like IntelliJ IDEA, Eclipse, or a text editor like VS Code.

---

## How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/file-io-java.git
   cd file-io-java
Open the project in your IDE or compile it manually using the terminal:
bash
Copy code
javac src/com/example/*.java
java com.example.Main
Examples
1. Reading a Text File
java
Copy code
try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
    String line;
    while ((line = reader.readLine()) != null) {
        System.out.println(line);
    }
} catch (IOException e) {
    e.printStackTrace();
}
2. Writing to a File
java
Copy code
try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
    writer.write("This is a sample text.");
} catch (IOException e) {
    e.printStackTrace();
}
Project Structure
bash
Copy code
file-io-java/
│
├── src/
│   └── com/example/
│       ├── Main.java            # Entry point of the project
│       ├── FileReaderExample.java  # Demonstrates reading files
│       ├── FileWriterExample.java  # Demonstrates writing files
│       └── FileOperations.java  # Advanced file operations
│
├── resources/                    # Example input/output files
├── README.md                     # Project documentation
└── .gitignore                    # Git ignore file
