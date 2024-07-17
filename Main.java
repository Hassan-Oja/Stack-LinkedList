public class Main {
    public static void main(String[] args) {
        Stack_Linkedlist s1 = new Stack_Linkedlist();
        System.out.println(s1.isEmpty());
        System.out.println("");

        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        s1.push(60);
        s1.display();
        System.out.println("");

        System.out.println(s1.isEmpty());
        System.out.println("");

        System.out.println( s1.peek());
        System.out.println("");

        System.out.println(s1.size());
        System.out.println("");

        System.out.println(s1.max());
        System.out.println("");


        System.out.println(s1.min());
        System.out.println("");

        s1.pop();
        s1.pop();
        s1.display();
        System.out.println("");

        System.out.println(s1.peek());
        System.out.println("");

        System.out.println(s1.size());
        System.out.println("");

        System.out.println(s1.getLen());
        System.out.println("");

        s1.clear();
        System.out.println(s1.isEmpty());
        
    }
}