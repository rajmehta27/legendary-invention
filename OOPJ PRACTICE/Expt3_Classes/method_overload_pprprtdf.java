class method_overload_pprprtdf {

    public void myMethod() {
        System.out.println("This is public class");
    }

    private void myMethod(int x, int z) {
        System.out.println("This is private class with parameter " + x + " and " + z);
    }

    protected void myMethod(String str) {
        System.out.println("This is class : " + str);
    }

    void myMethod(double y) {
        System.out.println("This is default class with parameter : " + y);
    }

    public static void main(String[] args) {

        method_overload_pprprtdf obj = new method_overload_pprprtdf();
        obj.myMethod();
        obj.myMethod(10, 20);
        obj.myMethod("Protected");
        obj.myMethod(20.5);
    }
}
