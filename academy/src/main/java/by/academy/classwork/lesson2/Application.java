package by.academy.classwork.lesson2;

public class Application {

	public static void main(String[] args) {
	Cat cat = new Cat("Vasya", 5, 100);
	System.out.println(cat);
	cat.eat();
	cat.walk();
	cat.sleep();
	}

}
