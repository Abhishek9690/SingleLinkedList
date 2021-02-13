package SinglyLinkedList;

public class Linkedlist {

private int size;
    private Node start;
    public Linkedlist(){
        size=0;
        start=null;
    }
    public void setSize(int size){
        this.size=size;
    }
    public void setStart(Node start){
        this.start=start;
    }
    public int getSize(){
        return size;
    }
    public Node getStart(){
        return start;
    }
    public boolean isEmpty(){
        if(start==null){
            return true;
        }
        else
            return false;
    }
    public int getListSize() {
        return size;
    }

    public void viewList(){
        Node n;
        n=start;
        if(isEmpty()){
            System.out.println("list is empty");
        }
        while(n!=null){
            System.out.println(n.getData());
            n=n.getNext();
        }
    }
    public void insertAtFirst(int value){
        Node n=new Node();
        n.setData(value);
        if(isEmpty()){
            start=n;
        }
        else{
            n.setNext(start);
            start=n;
        }
        size++;
    }
    public void insertAtLast(int value){
        Node n,t;
        n=new Node();
        t=start;
        n.setData(value);
        if(isEmpty()){
            start=n;
        }
        else{
            while(t.getNext()!=null){
                t=t.getNext();
            }
            t.setNext(n);
        }
        size++;
    }
    public void insertAtPos(int value,int pos){
        Node n,t;
        n=new Node();
        n.setData(value);
        t=start;
        if(isEmpty()){
            insertAtFirst(value);
        }
        else if(pos==size+1){
            insertAtLast(value);
        }
        else if(pos>1 && pos<=size){
            for (int i = 1; i < pos-1; i++) {
                t=t.getNext();
            }
            n.setNext(t.getNext());
            t.setNext(n);
            size++;
        }
        else{
            System.out.println("Insertion not possible at position"+pos);
        }
    }
    public void deleteAtFirst(){
        Node n;
        if(isEmpty()){
            System.out.println("list is empty");
        }
        else{
            start=start.getNext();
            size--;
        }
    }
    public void deleteAtLast(){
        Node n;
        n=start;
        if(isEmpty()){
            System.out.println("list is empty");
        }
        else if(size==1){
            start=null;
            size--;
        }
        else{
            for (int i = 1; i < size-1; i++) {
                n=n.getNext();
            }
            n.setNext(null);
            size--;
        }
    }
    public void deleteAtPos(int pos){
        Node n,t;
        t=start;
        if(isEmpty()){
            System.out.println("list is already empty");
        }
        else if(pos==1){
            deleteAtFirst();
        }
        else if(pos==size){
            deleteAtLast();
        }
        else if(pos<1 && pos>size){
            System.out.println("deletion not possible at this position");
        }
        else{
            for(int i=1;i<pos-1;i++) {
                t=t.getNext();
            }
            n=t.getNext();
            t.setNext(n.getNext());
            size--;
        }
    }
}
