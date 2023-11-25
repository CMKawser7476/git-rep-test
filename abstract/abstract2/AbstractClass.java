

public class AbstractClass {
    public static void main(String [] args){
        HelpAbsClass ObjAba = new HelpAbsClass();
        ObjAba.AbsMethod();

    }
    
}

abstract class AbsClass{
    abstract void AbsMethod();
}

class HelpAbsClass extends AbsClass {
    @Override
    void AbsMethod(){
        System.out.println("this is abstract method");
    }

}
