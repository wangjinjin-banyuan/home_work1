package club.banyuan;

public class Person1{
	private String name;
	private int age;

	 public String GetName(){
	 	
	 	return name;

	 }
	 public  void SetName(String name){
	 	this.name=name;
	 }
	 public  int GetAge(){
	 	return age;
	 }
	 public  void SetAge(int age){
	 	this.age=age;
	 }




    public Person1(){
    	SetName(name);
    	SetAge(age);
           Speak();
    };
    public Person1(String name,int age){
           
           SetName(name);
           SetAge(age);
           Speak();
    };
    public Person1(String name){
           SetName(name);
           SetAge(age);
           Speak();
    };
    public void Speak(
    	){

    	System.out.println("姓名"+name+" "+"年龄"+age);
    }

}