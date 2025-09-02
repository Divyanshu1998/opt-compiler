# opt-compiler

It demonstrates how modern compiler optimizations can be applied step by step on an intermediate representation (Three-Address Code).  

The project is split into three phases (modules), each implemented as an independent component but designed to work together as a pipeline:

1. **three-address** – Converts Java source into **Three-Address Code (TACo)**, an intermediate representation commonly used in compilers.
2. **conditional-constant-propagation** – Performs **Conditional Constant Propagation (CCP)** to evaluate expressions at compile-time and remove dead code.
3. **inlining** – Applies **Function Inlining** to replace method calls with their body, reducing function call overhead and enabling further optimizations.

---

## 🚀 Features

- Each optimization pass can be run independently or as part of the pipeline
- Preserves individual repository history via `git subtree`
- Built with **Java 17** and standard compiler design techniques

---

## 🛠️ Technologies Used

- **Java 17**
- Compiler theory (Intermediate Representations, Data-flow Analysis, Optimization passes)

---

## 📂 Project Structure

