

public class AbstractMain{
    public static void main(String[] args){
        HelpClass ObjAbs = new HelpClass();
        ObjAbs.absmethod();
    }
}

abstract class TestAbstract{
    public void absmethod(){
        System.out.println("kawser chowdhury");
    }
}

class HelpClass extends TestAbstract{

}