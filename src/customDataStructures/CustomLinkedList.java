package customDataStructures;

public class CustomLinkedList<T>{

    Node<T> headNode;
    int size = 0;

    private void checkOutOfBounds(int index){
        //If index is out of Bound, throw error
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index: " + index + " is out of Bounds!");
        }
    }
    public void add(T value){
        //If CustomLinedList is empty, set the headNode to a new Node with value
        if(size == 0){
            headNode = new Node<T>(value);
        }
        //Otherwise go to last Node and insert new Node with value
        else {
            Node<T> currentNode = headNode;
            while(currentNode.nextNode != null){
                currentNode = currentNode.nextNode;
            }
            currentNode.nextNode = new Node<T>(value);
        }
        size++;
    }

    public void remove(int index){
        checkOutOfBounds(index);
        //If we remove the first Node, set second Node as headNode
        if(index == 0){
            headNode = headNode.nextNode;
        }
        //otherwise set Parent's nextNode to one more next
        else {
            Node<T> currentNode = headNode;
            //Iterate to Parent Node
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.nextNode;
            }
            currentNode.nextNode = currentNode.nextNode.nextNode;
        }
        size--;

    }

    public void set(int index, T value){
        checkOutOfBounds(index);
        Node<T> currentNode = headNode;
        for(int i = 0; i < index; i++){
            currentNode = currentNode.nextNode;
        }
        currentNode.value = value;
    }

    public void insert(int index, T value){
        checkOutOfBounds(index);
        //We go to prior index and insert new Node there
        Node<T> currentNode = headNode;
        for(int i = 0; i < index - 1; i++){
            currentNode = currentNode.nextNode;
        }
        Node<T> insertionNode = new Node<T>(value);
        insertionNode.nextNode = currentNode.nextNode;
        currentNode.nextNode = insertionNode;
        size++;
    }
    private class Node<T>{
        private T value;
        private Node <T> nextNode;

        public Node(T value) {
            this.value = value;
        }
    }

}