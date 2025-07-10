class Method {
    static int a = 17;
    static int b = 20;

    int c = 101;
    int d = 55;

    static void staticMethod() {
        System.out.println("This is static method");
    }

    void instanceMethod() {
        System.out.println("This is instance method");
    }

    public static void main(String[] args) {
        Method obj = new Method();
        System.out.println("This is main method");
        System.out.println("Static variable a: " + a);
        System.out.println("Static variable b: " + b);
        System.out.println("Instance variable c: " + obj.c);
        System.out.println("Instance variable d: " + obj.d);
        staticMethod();
        obj.instanceMethod();
    }
}
