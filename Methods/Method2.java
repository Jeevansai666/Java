class Method2 {

    int c = 101;
    int d = 55;

    static void staticMethod() {
        Method2 obj = new Method2();
        System.out.println("Instance Varilable in Static Method : "+obj.c);
        System.out.println("Instance Varilable in Static Method : "+obj.d);
    }


    public static void main(String[] args) {
        staticMethod();
    }
}
