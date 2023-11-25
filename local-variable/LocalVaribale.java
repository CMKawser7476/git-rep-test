
public class LocalVaribale {
    public static void main(String [] args){
        
        LocalVarCls ObjVai = new LocalVarCls();
        ObjVai.localvariabfunc();
    }
}

class LocalVarCls{
    public int inst;

    public void localvariabfunc(){
        
        int a = 10;
        this.inst = a;
        System.out.println(this.inst=a);;
    }
}


// class LocalVarCls{
//     public void localvariabfunc(int a, int b){
//         int c = a+b;
//         System.out.println(c);
//     }
// }