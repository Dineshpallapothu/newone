package inheritence_runtimepolymorphism;

import java.util.ArrayList;
import java.util.List;

class Human{
	String name;
	
	public Human() {
		
	}
	public Human(String str) {
		this.name=str;
	}
	public List<Human> getallHumans(){
		List<Human> human=new ArrayList<>();
		human.add(new Human("dinesh"));
		human.add(new Human("Arun"));
	
		//System.out.println(human.get(0));
		return human;
			
	}
	@Override
	public String toString() {
		return "Human [name=" + name + "]";
	}
	
	
}
class Man extends Human{
	public Man() {
		
	}
	public Man(String hello,String name) {
		super(name);
	}
	public void gethumans() {
		Human obj=new Human();
		var drum=obj.getallHumans();
		System.out.println(drum);
		
		
	}
}
public class Pract {

	public static void main(String[] args) {
		Man obj=new Man();
		obj.gethumans();
		
		

	}

}
