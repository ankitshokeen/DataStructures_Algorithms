public class Main {
    public static void main(String[] args) {

//        LL list = new LL();
//        list.insertFirst(5);
//        list.insertFirst(10);
//        list.insertFirst(15);
//        list.insertFirst(20);
//        list.insertFirst(25);
//        list.insertLast(99);
//        list.insert(18, 4);
//        list.display();
//        list.insertRec(55, 2);
//        list.display();

//        System.out.println(list.deleteFirst());
//        list.display();

//        System.out.println(list.deleteLast());
//        list.display();

//        System.out.println(list.delete(3));
//        list.display();

//        System.out.println(list.find(20));

//        DLL list = new DLL();
//        list.insertFirst(5);
//        list.insertFirst(10);
//        list.insertFirst(15);
//        list.insertFirst(20);
//        list.insertFirst(25);
//        list.insertLast(30);
//        list.insert(15, 65);
//
//        list.display();


//        CLL list = new CLL();
//        list.insert(5);
//        list.insert(10);
//        list.insert(15);
//        list.insert(20);
//        list.insert(25);
//        list.display();
//        list.delete(15);
//        list.display();

        LL first = new LL();
        LL second = new LL();

        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);

        second.insertLast(2);
        second.insertLast(4);
        second.insertLast(6);
        second.insertLast(8);
        second.insertLast(10);

        LL ans = LL.merge(first, second);
        ans.display();
    }
}
