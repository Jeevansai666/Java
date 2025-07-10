class Method5 {

    static void staticMethod() {
        System.out.println("This is static method");
    }
    void instanceMethod() {
        System.out.println("This is instance method");
        staticMethod();
    }

    public static void main(String[] args) {
        System.out.println("Static method in Instance method :");
        Method5 obj = new Method5();
        obj.instanceMethod();

    }
}
