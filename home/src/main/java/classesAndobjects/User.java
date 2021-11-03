package classesAndobjects;

public class User {
	String username;
	double cash;
	int password;

	// Методы
	public void sayCash() {
		System.out.println("У вас на счету " + cash);
	}

	// конструкторы
	public User() {

	}

	public User(String username, double cash, int password) {
		this.username = username;
		this.cash = cash;
		this.password = password;
	}

	// Геттеры и Cеттеры

	public void setUsername(String username) {
		this.username = username;

	}

	public String getUsername(String username) {
		return username;
	}

	public void setCash(double cash) {
		this.cash = cash;
	}

	public double getCash(double cash) {
		return cash;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public int getPassword(int password) {
		return password;
	}

	// Геттеры и Cеттеры

	// В строку

	@Override
	public String toString() {
		return "User [username=" + username + ", cash=" + cash + ", password=" + password + "]";
	}

}
