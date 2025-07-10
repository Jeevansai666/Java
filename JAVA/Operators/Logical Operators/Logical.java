class Logical {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println((a > 5) && (b > 15));
        System.out.println((a > 15) || (b > 15));
        System.out.println(!((a > 5) && (b > 15)));
        System.out.println(!((a > 15) || (b > 25)));
    }
}
