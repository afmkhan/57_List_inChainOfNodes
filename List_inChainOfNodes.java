/**
  Represent a list, implemented in a chain of nodes
 */

public class List_inChainOfNodes_whileStyle{
    private Node ref2head;

    /**
      Construct an empty list
     */
    public List_inChainOfNodes_whileStyle(){
    } 
    
    /** 
      Construct a list given a ref2head
     */
    public List_inChainOfNodes_whileStyle(Node ref2head){
        this.ref2head = ref2head;
    }

    /**
      @return the number of elements in this list
     */
    public int size() {
        int size = 0;
        Node currentNode = ref2head;
        while( currentNode!= null){
            size++;
            currentNode = currentNode.getReferenceToNextNode();
        }
        return size;
    }

    
     /**
       @return a string representation of this list,
       format:
           # elements [element0,element1,element2,] 
      */
    public String toString() {
        String result = "[";
        Node currentNode = ref2head;
        for( int el = 0; el < size(); el++){
            result += currentNode.getCargoReference() + ",";
            currentNode = currentNode.getReferenceToNextNode();
        }
        return result += "]";
    }
    
    
    /**
      Append @value to the head of this list.
      @return true, in keeping with conventions yet to be discussed
     */
     public boolean addAsHead( Object val) {
        // store former headRef
        Node formerHead = ref2head;
        
        // set new headRef to the param and set its nextRef to the former
        ref2head = new Node( val, formerHead);
       
        return true;
     }
}