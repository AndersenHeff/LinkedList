# LinkedList
 The goal of this exercise is to create an ArrayList-like project that stores data in a list that can
grow and shrink. Each node contains a link to the next node in the list. The last node in the list has a
null link (i.e. head->node->node-> ... -> node -> null.) Feel free to create useful helper methods
(like getLastNode().) Also, many of these methods work well with while() loops. They can also be
written recursively. Writing them both ways is a good exercise.


1. Create a Node class that has two instance variables, a Node variable named node that
contains a reference to the next node in the list and an int named data that contains the data
stored in the node. The node should be initialized to null and the data should be initialized
with a constructor parameter. The class should contain the following methods:
• a getNextNode() method that returns the next node in the list
• a setNextNode() method that sets the next node in the list to the value passed as a
parameter
• a getData() method that returns the data stored by that node
2. Create a LinkedList class with one instance variable, a Node named head that is the first
node in the list. The class should contain the following methods:
• public int size()
∘ returns the number of nodes in the list
• public void add(int data)
∘ if head is null it creates a new Node and sets head equal to that node
∘ if head is not null it traverses the list using getNextNode() until it finds a null node
and creates a new node and adds it to the end of the list
• public void add(int index, int data) throws IndexOutOfBoundsException
∘ if index is less than zero or greater than size it throws an
IndexOutOfBoundsException
∘ if index is in range it inserts a new node at index index and correctly adjusts the node
links to preserve the linked list order
• public Node remove(int index)
∘ if index is less than zero or greater than size it throws an
IndexOutOfBoundsException
∘ if index is in range it removes the node at index index and returns it
• public int get(int index)
∘ if index is less than zero or greater than size it throws an
IndexOutOfBoundsException
∘ if index is in range it returns the data stored by the node at index index
3. Add a reverse() method that reverses the order of the list.
4. Add a shuffle() method that randomizes the order of the nodes in the list
5. Create a runner to demonstrate all of the above methods.
Sorted Singly Linked List
6. Create a SortedList class by modifying the LinkedList class. Replace the add() methods with
an insert method that uses a compareTo() method to insert the data into the correct index to
maintain a SortedList
• public void insert(int data)
∘ iterates through the list to find the correct index to insert data such that the list
remains sorted
7. Add a removeDuplicates() method that iterates over the list and removes entries that have
the same data values.
8. In the runner, write a mergeSort() method that takes two SortedList objects as parameters
and merges them into a single SortedList.
Circular Doubly Linked List
9. Create a DoubleNode class that contains two DoubleNode instance variables, one named
next and one labeled prev. The next node points to the next node in the list and the prev node
points to the previous node in the list so you can iterate forwards or backwards. There is no
null node in a circular linked list. Every node points forwards around the circular link or
backwards around the circular link. Implement the same methods as the LinkedList class.
You still need a Head node so you've got a starting point and know when you've gone 'round
the whole loop. If the size of the list is one then head's prev and next point to itself.
Applications
1. Use a SinglyLinkedList to create a BigInt class that stores a single digit in each node. The
entire list can then store an integer of arbitrary size. The ones place should be at the Head
node. You should be able to add and subtract two BigInts. Multiplication is more difficult
but can be done either by repeated addition (easy but slow) or by actually implementing a
multiplication algorithm. Same with division. It also (obviously) needs a useful toString()
method.
i.e. 123456789 = 9->8->7->6->5->4->3->2->1->null.
2. Use a SortedSinglyLinkedList to create a contact list containing Contact objects as the data
instead of ints. A Contact object should contain a first name, a last name, a phone number
and an email address (validate the last two when adding a new contact - i.e. email address
have an @ symbol in the middle and phone numbers are 9 digits long). Adding a new
Contact object to the list should use the compareTo method in Contact to decide where in
the list to insert the new object.
3. Create a simple drawing program that lets you choose squares, circles, rectangles or ovals
and the color with which they are drawn. Start drawing when the mouse button is pressed
down, drag to resize the shape and then finalize it when the mouse button is released. Store
all of them as Shape objects and put them in a circular doubly linked list. Allow cycling
through the list in both directions to display the different shapes one by one. You should also
be able to delete Shapes from the list.