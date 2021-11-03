package something;

public class Car {
	String model;
	double prise;
	String color;

	// Конструкторы
	public Car() {

	}

	public Car(String model, String color, double prise) {
		this.model = model;
		this.color = color;
		this.prise = prise;
		// Конструкторы
	}

	// Методы
	public void SayAboutTeslaModelS() {
		System.out.println("Мощность электродвигателя 773 л. с.\r\n" + "Батарея 100 кВт•ч\r\n"
				+ "Запас хода (NEDC/EPA/WLTP) 613 км\r\n" + "Время зарядки (220В/380B/DC) 35-50 ч./6-9 ч./1 ч.\r\n"
				+ "Разгон 0-100 км/ч2.5 c.\r\n" + "Максимальная скорость250 км/ч\r\n" + "");
	}
	// Методы

	@Override
	public String toString() {
		return "Car [model = " + model + ", prise = " + prise + ", color = " + color + "]";
	}

}
