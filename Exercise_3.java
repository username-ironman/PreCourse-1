// Java program to implement 
// a Singly Linked List 
// Time complexity is O(n)
// Space complexityy is O(n)
class LinkedList { 
  
    Node head; // head of list 
  
    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    static class Node { 
  
        int data; 
        Node next; 
  
        // Constructor 
        Node(int data) 
        { 
            //Write your code here 
            this.data = data;
        } 
    }
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
   
        // If the Linked List is empty, 
        // then make the new node as head 
        
        // Else traverse till the last node 
        // and insert the new_node there 

        // Insert the new_node at last node 
        // Return the list by head 

        // empty case
        Node newNode = new Node(data);
        if (list.head == null){
            list.head= newNode;
        } else  {
            // Non empty case
            Node temp = list.head;
            while (temp.next!=null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
        // Print the data at current node
        // Go to next node 
        if(list.head == null) {
            System.out.println("list is empty");
            return;
        }
        Node temp = list.head;
        while(temp!=null){
            System.out.println("Data :" +  temp.data);
            temp = temp.next;
        }
    } 
   
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        LinkedList list = new LinkedList(); 
  
        // 
        // ******INSERTION****** 
        // 
  
        // Insert the values 
        list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
  
        // Print the LinkedList 
        printList(list); 
    } 
}