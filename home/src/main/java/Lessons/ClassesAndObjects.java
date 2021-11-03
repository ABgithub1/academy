package Lessons;

public class ClassesAndObjects {
	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "VASYA";
		person1.age = 20;
		person1.speak();
		Person person2 = new Person();
		person2.name = "Gena";
		person2.age = 50;
		person2.speak();
	}
}

class Person {
	// У класса могут быть :
	// 1. Данные (поля)
	// 2. Действия (Методы)
	String name;
	int age;

	void speak() {
		System.out.println("Имя " + name + " Возраст " + age);
	}
}
