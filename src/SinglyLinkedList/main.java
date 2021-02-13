package SinglyLinkedList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Linkedlist obj=new Linkedlist();
        boolean flag=true;
        while(flag) {
            System.out.println("");
            System.out.println("1.add item to the list  at start");
            System.out.println("2.add item to the list  at end");
            System.out.println("3.add item to the list  at position");
            System.out.println("4.delete first  item from the list");
            System.out.println("5.delete last item from the list");
            System.out.println("6.delete item from a specific position");
            System.out.println("7.view list");
            System.out.println("8.exit");
            System.out.println("enter your choice");
            int choice =sc.nextInt();
            int pos,value;
            switch (choice){
                case 1:
                    System.out.println("enter value of list item");
                    value=sc.nextInt();
                    obj.insertAtFirst(value);
                    break;
                case 2:
                    System.out.println("enter value of list item");
                    value=sc.nextInt();
                    obj.insertAtLast(value);
                    break;
                case 3:
                    System.out.println("enter value of list and position");
                    value=sc.nextInt();
                    pos=sc.nextInt();
                    obj.insertAtPos(value,pos);
                    break;
                case 4:
                    obj.deleteAtFirst();
                    break;
                case 5:
                    obj.deleteAtLast();
                    break;
                case 6:
                    System.out.println("Enter position");
                    pos=sc.nextInt();
                    obj.deleteAtPos(pos);
                    break;
                case 7:
                    obj.viewList();
                    break;
                case 8:
                    flag=false;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }

    }
}
