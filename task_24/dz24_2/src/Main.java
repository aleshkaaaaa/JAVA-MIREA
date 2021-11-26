public class Main {

    public static void main(String[] args) {
        System.out.println(
                Address.parseWithSplit("USA, New-England, Portland, NE-Gilsan, 608, 1, 30b", ",")
        );
        System.out.println(
                Address.parseWithStringTokenizer("USA, New-England, Portland, NE-Gilsan, 608, 1, 30b", ",")
        );
    }

}