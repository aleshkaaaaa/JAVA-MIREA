public class MyArray<E> {
    private E[] arr;

    public E getArrByIndex(int i) {
        return arr[i];
    }

    public void setArray(E[] arr) {
        this.arr = arr;
    }

    public int getArrayLength() {
        return arr.length;
    }

    public static <E> void sid(String s, E[] arr) {

        E[] a = arr;
        MyArray<E> sid = new MyArray<E>();
        sid.setArray(a);

        System.out.print(s + "  ");

        for (int i = 0; i < sid.getArrayLength(); i++)
            System.out.print(sid.getArrByIndex(i) + " ");

        System.out.println();
    }

    public static void main(String[] args) {
        String[] s = {"My", "array", "is", "working"};
        sid("String", s);

        Integer[] intr = {514, 4315, 4325, 2134, 45, 235};
        sid("Integer", intr);

        Double[] ad = {1123.1232, 1123.4235, 6234.7234};
        sid("Double", ad);
    }
}