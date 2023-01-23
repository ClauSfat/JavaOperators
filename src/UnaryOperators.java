public class UnaryOperators{
    public static void main(String[] args) {
        int num = +10;
        System.out.println("Valoarea este: " + num);

        num = -3;
        System.out.println("Valoarea este: " + num);

        num = -num;
        System.out.println("Valoarea este: " + num);

        num++;
        System.out.println("Valoarea este: " + num);

        num --;
        System.out.println("Valoarea este> " + num);

        boolean notop = true;
        notop = !notop;
        System.out.println("Valoarea este " + notop);

    }
}
