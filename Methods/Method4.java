class Method4 {

    void instanceMethod() {
        System.out.println("This is instance method");
    }
    static void staticMethod() {
        System.out.println("This is static method");
        Method4 obj = new Method4();
        obj.instanceMethod();
    }

    public static void main(String[] args) {
        System.out.println("Instance method in static method :");
        staticMethod();

    }
}
