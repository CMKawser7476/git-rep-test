

interface First{
    void FirstMethod();
}

interface Second{
    void SecondMethod();
}

interface Third{
    void ThirdMethod();
}

class FirstClassInterface implements First, Second, Third {
    @Override
    public void FirstMethod(){
        System.out.println("First interface");
    }

    @Override
    public void SecondMethod(){
        System.out.println("Second Interface");
    }

    @Override
    public void ThirdMethod(){
        System.out.println("Third Interface");
    }
    
}

public class FirstInterface{
    public static void main(String[] args){
        FirstClassInterface ObjInter = new FirstClassInterface();
        ObjInter.FirstMethod();
        ObjInter.SecondMethod();
        ObjInter.ThirdMethod();
    }
}
