class Method7 {
    static void staticMethod() {
        System.out.println("This is static method");
    }

    void instanceMethod() {
        System.out.println("This is instance method");
    }

    public static void main(String[] args) {
        Method obj = new Method();
        System.out.println("Static and instancee Methods in main method . ");
        staticMethod();
        obj.instanceMethod();
    }
}
