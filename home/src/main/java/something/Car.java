package something;

public class Car {
	String model;
	double prise;
	String color;

	// ������������
	public Car() {

	}

	public Car(String model, String color, double prise) {
		this.model = model;
		this.color = color;
		this.prise = prise;
		// ������������
	}

	// ������
	public void SayAboutTeslaModelS() {
		System.out.println("�������� ���������������� 773 �. �.\r\n" + "������� 100 ����\r\n"
				+ "����� ���� (NEDC/EPA/WLTP) 613 ��\r\n" + "����� ������� (220�/380B/DC) 35-50 �./6-9 �./1 �.\r\n"
				+ "������ 0-100 ��/�2.5 c.\r\n" + "������������ ��������250 ��/�\r\n" + "");
	}
	// ������

	@Override
	public String toString() {
		return "Car [model = " + model + ", prise = " + prise + ", color = " + color + "]";
	}

}
