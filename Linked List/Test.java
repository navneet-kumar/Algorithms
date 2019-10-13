package linkedlist;

public class Test {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("I");
        list.add("am");
        list.add("navneet");
        list.add("kumar");
        System.out.println(list);
        list = list.reverse();
        System.out.println(list);
    }
}
