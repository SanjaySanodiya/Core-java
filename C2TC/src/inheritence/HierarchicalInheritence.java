package inheritence;

class Animal2
{
	public void Eat() 
	{
		System.out.println("eating....");
	}
}

class Dogg extends Animal2 
{
	public void Bark() 
	{
		System.out.println("barking....");
	}
}

class Cat extends Dogg
{
	public void Meow()
	{
		System.out.println("meowing....");
	}
}

public class HierarchicalInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c = new Cat();
		c.Eat();
		c.Bark();
        c.Meow();
	}

}
