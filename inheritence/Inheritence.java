
public class Inheritence {
    public static void main(String[] args){
        Son ObjSon = new Son();
        ObjSon.fotherfunction();

    }
    
}

class Fother{
    int a = 10;
    int b = 23;
    int c;
    public void fotherfunction(){
        this.c=this.a+this.b;
        System.out.println(this.c);
    }
}

class Son extends Fother{
    
}
