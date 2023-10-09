## Arrays

### Aims and Objectives

This laboratory has been designed to help you

- allow you to exercise your array declaration, initialisation and manipulation skills,
- give you practice in defining classes which use an array as the basis for an implementation
  of a sequential data structure, such as a list.

### Task 1 - Checkpoint 37

1. Add the following code to the **main** method:
    ```java
       public class ArrayTask {
           public static void main (String[] args) {
            IntList intListOne = new IntList();
            System.out.println(intListOne);
            intListOne.add(42);
            System.out.println(intListOne);
            intListOne.add(2);
            System.out.println(intListOne.get(3));
            System.out.println(intListOne.get(-1));
            System.out.println(intListOne.get(1));
            System.out.println(intListOne);
            intListOne.add(78);
            intListOne.add(9);
            intListOne.add(57);
            System.out.println(intListOne);
           }
       }
    ```
2. You are now going to complete a new class called **`IntList`** (skeleton provided).   
   The aim of the class is to represent a list. It is initially empty but can have elements inserted at the end of it.
   Since arrays are not extensible, one way to represent the list is to create an array which is long enough for all
   foreseeable circumstances and to keep track of how much of the array is being used with another variable. Initially
   this variable will be zero and each time a value is inserted it will become one larger. The class includes the
   following:
    1. A private final int named **`DEFAULT_CAPACITY`** used to create a default list.
    2. A private instance variable named **`elementData`** which refers to an **`int`** array.
    3. A private instance variable called **`size`** to keep track of how many elements of the array are being used,
       initialised to 0.
3. You should now include the following:
    1. A default constructor (no parameters) that creates an empty list to hold 4 ints (use the constant supplied).
    2. A method named **`grow()`** that increases the size of `elementData` by 5. To do this you will need to create
       a temporary array, copy all the elements from `elementData` and return the temporary array.
    3. A method named **`add(int element)`** which appends the specified element to the end of the list and returns
       _true_ if successful.
       Prior to appending the element, the method should check that there are unused positions in the array (make use of
       the **`length`** attribute of the array and **`size`**). If there are not, a call to **`grow()`** should be
       made and then the insertion should be performed. To do this it should use **`size`** to index the array and
       assign the element to that position in the array. **`size`** should then be increased by 1.
    4. A method named **`get(int index)`** which returns the element at the given index (similar to array indexing). It
       should check that the index passed as a parameter is that of an index which is being used. For example, after
       adding two elements to a list (calling **`add`** twice), the only valid indexes will be 0 and 1. If the index is
       not valid, a message should be printed and -1 returned (_see the example output below_).
    5. A method named **`toString`** which returns a formatted String of the elements in the list. If the list does not
       contain any elements then **List is empty: []** should be returned, otherwise **Printing List: [e<sub>1</sub>,
       e<sub>2</sub>, ..., e<sub>n</sub>]** should be returned.
       (_see example output below_).

   A good strategy to adopt in developing this class is to write and test each method one at a time. To do this you
   will need to comment out those lines in the **main** method which call methods which have not been written yet.

   **Note**: The **main** method should not be changed from that given above.<br>
4. The final output of your program should be the output below:  <br><br>
   **<tt>Creating ListOne  
   List is empty: []  
   Printing List: [42]  
   invalid index: 3  
   -1  
   invalid index: -1  
   -1  
   2  
   Printing List: [42, 2]  
   Printing List: [42, 2, 78, 9, 57]</tt>**

---

### Task 2 - Checkpoint 38

1. For this task you will add four more methods to the `IntList` class.
    1. A method named **`contains(int element)`** that checks to see if the given element is in this list and return
       _true_
       if this list contains the specified element, _false_ otherwise
    2. A method named **`indexOf(int element)`** that returns the index of the first occurrence of the specified element
       in this list, or -1 if this list does not contain the element.
    3. A method named **`set(int index, int element)`** that replaces the element at the specified position in this list
       with the specified element. The method returns the element previously at the specified position or -1 if index is
       invalid.
    4. A method named **`size`** that returns an **`int`**, which is the number of elements in the list (think
       carefully about what you return).

2. Add the following statements to the **main** method.

    ```java
        System.out.println("list one size: " + intListOne.size());
        System.out.println("list one contains 42: " + intListOne.contains(42));
        System.out.println("list one contains 101: " + intListOne.contains(101));
        int output = intListOne.indexOf(2);
        System.out.println(output == -1 ? "element not found" : "index of 2: " + output);
        output = intListOne.indexOf(56);
        System.out.println(output == -1 ? "element not found" : "index of 56: " + output);
        intListOne.add(79);
        intListOne.add(23);
        System.out.println(intListOne);
        output = intListOne.set(4, 99);
        System.out.println(output == -1 ? "invalid index" : "old value = " + output);
        System.out.println(intListOne);
        output = intListOne.set(7, 76);
        System.out.println(output == -1 ? "invalid index" : "old value = " + output);
        System.out.println(intListOne);
    ```

3. Run the program. The following output should be produced:  <br><br>
   **<tt>Creating ListOne  
   List is empty: []  
   Printing List: [42]  
   invalid index: 3  
   -1  
   invalid index: -1  
   -1  
   2  
   Printing List: [42, 2]  
   Printing List: [42, 2, 78, 9, 57]  
   list one size: 5  
   list one contains 42: true  
   list one contains 101: false  
   index of 2: 1  
   element not found  
   Printing List: [42, 2, 78, 9, 57, 79, 23]  
   old value = 57  
   Printing List: [42, 2, 78, 9, 99, 79, 23]  
   invalid index  
   Printing List: [42, 2, 78, 9, 99, 79, 23]</tt>**

---

### Task 3 - Checkpoint 39

1. For this task you will add 3 more methods and another constructor to the `intList` class.
    1. A constructor which takes a single **`int`** parameter and creates an empty list of that size.
    2. A method whose name is **`add`** that takes two parameters of type **`int`**. The first, _index_ and the
       second _element_. The method does not return anything. The method inserts the specified
       element at the specified index in the list. Shifts the element currently at that index (if any) and any
       subsequent elements to the right (adds one to their indices). If the index is invalid the method prints
       **invalid index: + index** (_see the output below_)
       **Hint:** don't forget you need at least one spare space to insert the element.
    3. A method named `remove` that takes one `int` parameter _index_ and removes the element at the specified
       position in the list. Shifts any subsequent elements to the left (subtracts one from their indices). The
       method returns the element that was removed from the list. If the index is invalid the method prints **invalid
       index: + index** and returns -1. (_see the output below_)
    4. A method named `removeElement` that takes one `int` parameter _element_ and removes the first occurrence of
       the specified element from the list, if it is present. Shifts any subsequent elements to the left (subtracts
       one from their indices). If the list does not contain the element it is unchanged. The method returns _true_
       if the list contained the element, or _false_ otherwise.

2. Add the following statements to the **main** method.
   ```java
        System.out.println("Creating ListTwo");
        int[] values = {5, 8, 2, 13, 12, 14, 13, 22, 9, 22, 78, 2, 42};
        IntList intListTwo = new IntList(10);
        for (int i = 0; i < values.length; i++) {
            intListTwo.add(values[i]);
        }
        System.out.println(intListTwo);
        System.out.println("list two size: " + intListTwo.size());
        intListTwo.add(100);
        System.out.println(intListTwo);
        intListTwo.add(4, 47);
        intListTwo.add(79);
        intListTwo.add(-1, 66);
        intListTwo.add(17, 66);
        intListTwo.add(16, 66);
        System.out.println(intListTwo);
        output = intListTwo.remove(2);
        if (output != -1)
            System.out.println("element at index 2 (" + output + ") removed");
        System.out.println(intListTwo);
        if (intListTwo.removeElement(5))
            System.out.println("5 removed");
        else
            System.out.println("no such element: 5");
        System.out.println(intListTwo);
        output = intListTwo.remove(9);
        if (output != -1)
            System.out.println("element at index 9 (" + output + ") removed");
        if (intListTwo.removeElement(52))
            System.out.println("52 removed");
        else
            System.out.println("no such element: 52");
        output = intListTwo.remove(15);
        System.out.println(intListTwo);
   ```

3. Run the program. The following output for the code just added should be produced (all other output should remain
   unchanged):  <br><br>
   **<tt>Creating ListTwo  
   Printing List: [5, 8, 2, 13, 12, 14, 13, 22, 9, 22, 78, 2, 42]  
   list two size: 13  
   Printing List: [5, 8, 2, 13, 12, 14, 13, 22, 9, 22, 78, 2, 42, 100]  
   invalid index: -1  
   invalid index: 17  
   Printing List: [5, 8, 2, 13, 47, 12, 14, 13, 22, 9, 22, 78, 2, 42, 100, 79, 66]  
   element at index 2 (2) removed  
   Printing List: [5, 8, 13, 47, 12, 14, 13, 22, 9, 22, 78, 2, 42, 100, 79, 66]  
   5 removed  
   Printing List: [8, 13, 47, 12, 14, 13, 22, 9, 22, 78, 2, 42, 100, 79, 66]  
   element at index 9 (78) removed  
   no such element: 52  
   invalid index: 15  
   Printing List: [8, 13, 47, 12, 14, 13, 22, 9, 22, 2, 42, 100, 79, 66]</tt>**

---

### Task 4 - Checkpoint 40

1. For this task you add three more methods to the `intList` class.
    1. A method named `lastIndexOf` that takes one `int` parameter _element_ and returns the last occurrence of
       the specified element, or -1 if the list does not contain the element
    2. A method named `subList` that takes two `int` parameters (_fromIndex_ and _toIndex_) and returns an `IntList` of
       the portion of the list between the specified _fromIndex_, inclusive, and _toIndex_, exclusive. If _fromIndex_
       amd _toIndex_ are equal, then the returned list is empty.  
       If _toIndex_ is less than _fromIndex_ the method prints **indices out of order** and returns `null`.  
       If either index is invalid the method prints **invalid index** and returns `null`.
    3. A method named `removeRange` that takes two `int` parameters (_fromIndex_ and _toIndex_). It Removes from this
       list all the elements whose index is between _fromIndex_, inclusive, and _toIndex_, exclusive.  
       Shifts any succeeding elements to the left (reduces their index). This call shortens the list by (_toIndex_ -
       _fromIndex_) elements. (If _toIndex_ equals _fromIndex_, this operation has no effect.)   
       If _toIndex_ is less than _fromIndex_ the method prints **indices out of order**.  
       If either index is invalid the method prints **invalid index**.

2. Add the following code to the **main** method:
    ```java
        output = intListTwo.lastIndexOf(22);
        System.out.println(output == -1 ? "element not found" : "last index of 22: " + output);
        System.out.println(intListTwo);
        IntList subList = intListTwo.subList(3, 9);
        System.out.println("Sublist: " + subList);
        System.out.println(intListOne);
        intListOne.removeRange(2, 5);
        System.out.println(intListOne);
        subList = intListTwo.subList(4, 4);
        System.out.println("Sublist: " + subList);
    ```
3. Run the program. The following output for the code just added should be produced (all other output should remain
   unchanged):  <br><br>
   **<tt>last index of 22: 8  
   Printing List: [8, 13, 47, 12, 14, 13, 22, 9, 22, 2, 42, 100, 79, 66]  
   Sublist: Printing List: [12, 14, 13, 22, 9, 22]  
   Printing List: [42, 2, 78, 9, 99, 79, 23]  
   Printing List: [42, 2, 79, 23]  
   Sublist: List is empty: []</tt>**

---