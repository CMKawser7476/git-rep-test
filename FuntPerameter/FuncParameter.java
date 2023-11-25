public class FuncParameter {
    public static void main(String[] args){
        TestPerameter ObjPera = new TestPerameter();
        ObjPera.testfunctperameter(23, 45);
        ObjPera.testfunctperameter1(34, 38);
    }
}

// this is a local variable in function perameter pass
class TestPerameter{
    public void testfunctperameter(int a, int b){
        int c = a+b;
        System.out.println(c);
    }

    public void testfunctperameter1(int a, int b){
        int c = a*b;
        System.out.println(c);
    }
}