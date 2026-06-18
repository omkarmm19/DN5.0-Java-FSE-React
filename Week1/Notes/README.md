# Week 1 Notes

## Design Patterns

### Singleton Pattern

Ensures only one object instance exists throughout the application.

### Factory Method Pattern

Creates objects without exposing creation logic.

### Builder Pattern

Constructs complex objects step-by-step.

### Adapter Pattern

Allows incompatible interfaces to work together.

### Dependency Injection

Provides dependencies externally instead of creating them inside classes.

---

## Data Structures and Algorithms

### Linear Search

Checks elements one by one.

### Binary Search

Efficient searching in sorted arrays.

### Sorting Algorithms

* Bubble Sort
* Insertion Sort
* Selection Sort

### Recursion

A method calling itself to solve smaller subproblems.

### Financial Forecasting

Used recursion to calculate future value based on growth rate.

---

## PL/SQL

### Control Structures

* IF
* IF ELSE
* LOOP
* FOR LOOP

### Cursors

Used to process query results row by row.

### Stored Procedures

Reusable PL/SQL program units stored in the database.

---

## JUnit

### Assertions

Used to validate expected results.

Common Assertions:

* assertEquals()
* assertTrue()
* assertFalse()
* assertNotNull()

### AAA Pattern

* Arrange
* Act
* Assert

### Test Fixtures

Reusable setup data for test cases.

---

## Mockito

### Mocking

Creates dummy objects for testing.

### Stubbing

Defines behavior of mocked methods.

Example:

```java
when(api.getData()).thenReturn("Mock Data");
```

### Verifying Interactions

```java
verify(api).getData();
```

Ensures methods are invoked as expected.

---

## SLF4J Logging

### Error Logging

```java
logger.error("This is an error message");
```

### Warning Logging

```java
logger.warn("This is a warning message");
```

### Parameterized Logging

```java
logger.info("User {} is {} years old", username, age);
```

Advantages:

* Better performance
* Cleaner code
* Easy log formatting

---

## Week 1 Summary

Completed:

* Design Patterns
* DSA Exercises
* PL/SQL Exercises
* JUnit Exercises
* Mockito Exercises
* SLF4J Logging Exercises

All mandatory Week 1 hands-ons completed successfully.
