Java ATM Simulation Project

This is a simple Java console-based ATM simulation system. It demonstrates basic OOP (Object-Oriented Programming) principles such as encapsulation, abstraction, and polymorphism.

---

 Features

-  User login with username and PIN
-  Balance inquiry
-  Deposit money
-  Withdraw money
-  Change PIN
-  Exit

---
  Project Structure

```plaintext
ATM.java              --> Main class (entry point)
Account.java          --> Holds account details and methods for deposit, withdraw, etc.
Transaction.java      --> Interface for common transaction behavior
CheckBalance.java     --> Implements Transaction to check balance
Deposit.java          --> Implements Transaction to deposit amount
Withdraw.java         --> Implements Transaction to withdraw amount
ChangePIN.java        --> Implements Transaction to change user's PIN
