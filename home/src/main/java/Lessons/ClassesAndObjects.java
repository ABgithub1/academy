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
	// � ������ ����� ���� :
	// 1. ������ (����)
	// 2. �������� (������)
	String name;
	int age;

	void speak() {
		System.out.println("��� " + name + " ������� " + age);
	}
}
