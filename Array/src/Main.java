public class Main {

    public static void main(String[] args) {

        Array arr = new Array(20);
        for (int i = 0; i < 10; i ++) {
            arr.addLast(i);
        }

        arr.add(1, 100);

        arr.addFirst(1000);

        arr.addLast(-1);
        arr.remove(3);
        System.out.println(arr);
    }
}
