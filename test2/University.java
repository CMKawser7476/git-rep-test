public class University{
    public static void main(String[] args){

        // for faculty section
        Faculty ObjFaculty = new Faculty();
        ObjFaculty.facultylistfunction();
        ObjFaculty.facultydetailfunction();
        ObjFaculty.facultyadvising();
        ObjFaculty.facultyofficetimefunction();

        // for student section
        Student ObjStudent = new Student();
        ObjStudent.studentname();
        ObjStudent.coursefunction();
        ObjStudent.coursedetailfunction();

        // for lab section
        Lab Objlab = new Lab();
        Objlab.assignmentfunction();
        Objlab.labreport();

        // for Math
        Math ObjMth = new Math();
        ObjMth.addfunctio(39, 45);
        ObjMth.subfunction(20, 40);
        ObjMth.mulfunction(45, 56);
       
    }
}


// this is faculty class
class Faculty{
    public void facultylistfunction(){
        System.out.println("-------Faculty Section------ \nFaculty List View");
    }

    public void facultydetailfunction(){
        System.out.println("Faculty Detail view");
    }

    public void facultyadvising(){
        System.out.println("faculty advising time");
    }

    public void facultyofficetimefunction(){
        System.out.println("faculty office time and communication \n");
    }
}


// this is student class

class Student{
    public void studentname(){
        System.out.println("-----Student Section----- \nStudent name list view");
    }

    public void coursefunction(){
        System.out.println("Total course list view");
    }

    public void coursedetailfunction(){
        System.out.println("Course detail view\n");
    }
}


class Lab{
    public void assignmentfunction(){
        System.out.println("----Lab section---------\nthis is lab assignment");
    }

    public void labreport(){
        System.out.println("this is lab report\n\n");
    }
}



class Math{
    public void addfunctio(int a, int b){
        int c=a+b;

        System.out.println(c + " this is addintion");
    }

    public void subfunction(int a, int b){
        int c = b-a;
        System.out.println(c + "\nthis is subtraction");
    }

    public void mulfunction(int a, int b){
        int c = a*b;
        System.out.println(c + "\nthis is subtraction");
    }
 
}

