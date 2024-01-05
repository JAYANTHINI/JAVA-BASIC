package newprogram;

public class Studet {
public void studet(int id)	{
    System.out.println(id);
}
public void studet(String name) {
	System.out.println(name);
	
}
public void studet(float salary) {
     System.out.println(salary);
}
public static void main(String[]args) {
	 Studet obj = new Studet();
	 obj.studet(0);
	 obj.studet("jaya");
	 obj.studet(975454);
   
 
}


}