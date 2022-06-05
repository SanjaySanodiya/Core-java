package hierarchical;

public class Animal
{
	public void Eat() 
	{
		System.out.println("eating....");
	}
}

class Dog extends Animal 
{
	public void Bark() 
	{
		System.out.println("barking....");
	}
}

class Cat extends Dog
{
	public void Meow()
	{
		System.out.println("meowing....");
	}
}

class Hierarchical
{
	public static void main(String[] args) 
	{
		Cat c = new Cat();
		c.Eat();
		c.Bark();
		c.Meow();
	}
}