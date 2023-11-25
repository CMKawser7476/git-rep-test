public class Test{
	public static void main(String[] args){
		MyClass ObjectVariable = new MyClass();
		ObjectVariable.myfunction();
		ObjectVariable.myfunction2();
		
		MyUniversity ObjUniVariable = new MyUniversity();
		ObjUniVariable.myunifunction();
		
		Animal AniOvjVariable = new Animal();
		AniOvjVariable.animfunction();
		
	}

}

class MyClass{
	public void myfunction(){
		System.out.println("OOP from Myclass function1");
	}
	
	public void myfunction2(){
		System.out.println("OOP myclass with funtiuon2");
	}
}

class MyUniversity{
	public void myunifunction(){
		System.out.println("OOP from MyUniversity class");
	}
}

class Animal{
	public void animfunction(){
		System.out.println("OOP from Animal class");
	}
}




