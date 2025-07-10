class Method6 {
    
    static int a = 17;
    static int b = 20;

    int c = 101;
    int d = 55;

    public static void main(String[] args) {
        Method obj = new Method();
        System.out.println("All Static and instance vars in main method :");
        System.out.println("Static variable a: " + a);
        System.out.println("Static variable b: " + b);
        System.out.println("Instance variable c: " + obj.c);
        System.out.println("Instance variable d: " + obj.d);
    }
}

