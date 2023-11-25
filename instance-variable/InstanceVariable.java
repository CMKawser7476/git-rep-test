
public class InstanceVariable {
    public static void main(String[] args){
         InsVariableCls ObjVariIns = new InsVariableCls();
         ObjVariIns.insvarifunctionadd();
         ObjVariIns.insvarifunctionmul();

         UniversityCls ObjUniversity = new UniversityCls();
         ObjUniversity.universitycostfnc();

    }
    
}

class InsVariableCls{
    public int a = 10;
    public int b = 13;
    public int c;

    public void insvarifunctionadd(){
        this.c=this.a+this.b;
        System.out.println(this.c);
    }

    public void insvarifunctionmul(){
        this.c=this.a*this.b;
        System.out.println(this.c);
    }
}
// for university section
class UniversityCls{
    public int tutionfee = 45000;
    public int libraryfee = 4530;
    public int cafeteriafee = 3400;
    public int total;

    public void universitycostfnc(){
        this.total = this.tutionfee+this.libraryfee+this.cafeteriafee;
        System.out.println(total);
    }

}
