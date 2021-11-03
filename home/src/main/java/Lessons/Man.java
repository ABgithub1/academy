package Lessons;

public class Man {
	String name;
	int age;
	double balance;

	public Man() {
	}

	public Man(String name) {
		this.name = name;
	}

	public Man(String name, int age, double balance) {
		super();
		this.name = name;
		this.age = age;
		this.balance = balance;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getname() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;

	}

	@Override
	public String toString() {
		return "Man [name=" + name + ", age=" + age + ", balance=" + balance + "]";
	}
}
