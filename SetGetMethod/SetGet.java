
public class SetGet{
    public static void main(String[] args){
        NewClass ObjClass = new NewClass();
        ObjClass.A(100);

    }
    
}


class NewClass{
    private int x;

    public void A(int set){
        this.x = set;
        System.out.println(this.x);

    }
}
