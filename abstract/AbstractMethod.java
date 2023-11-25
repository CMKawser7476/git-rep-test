

public class AbstractMethod {
    public static void main(String [] args){
        HelpAbsCls ObjAbs = new HelpAbsCls();
        ObjAbs.AbsMethod();

    }
    
}

abstract class AbsMet{
    abstract void AbsMethod();
}

class HelpAbsCls extends AbsMet{
    void AbsMethod(){
        System.out.println("this is abstract method");
    }
}
