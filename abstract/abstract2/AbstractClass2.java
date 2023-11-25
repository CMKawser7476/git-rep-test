

public class AbstractClass2 {
    public static void main(String[] args){
        InAbsClass ObjAbss = new InAbsClass();
        ObjAbss.AbsMet();
    }
}

abstract class AbsTestClass{
    abstract void AbsMet();
}


class InAbsClass extends AbsTestClass{
    @Override
    void AbsMet(){
        System.out.println("this is abstract method");
    }
}
