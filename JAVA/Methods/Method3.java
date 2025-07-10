class Method3 {
    static int a = 17;
    static int b = 20;
    void instanceMethod() {
        System.out.println("Static Varilable in Instance Method : "+a);
        System.out.println("Static Varilable in Instance Method : "+b);
    }

    public static void main(String[] args) {
        Method3 obj = new Method3();
        obj.instanceMethod();
    }
}
