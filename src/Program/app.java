package Program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidade.Employee;
import entidade.OutsourcedEmployee;

public class app {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();

		System.out.print("Enter the numbr of employee: "); // quantidade de funcionario
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data: ");
			System.out.println("Outsourced (y/n)"); // funcionario tercerizado ?
			char ch = sc.next().charAt(0); // le o caracter
			System.out.print("Name: ");
			sc.nextLine();// usar a linha vazia
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.println("Value per hour: "); // valor por hora
			double valuePerHour = sc.nextDouble();
			if (ch == 'y') {
				System.out.print("Additional charge: "); // taxa adicional
				double additionalCharge = sc.nextDouble();
				// Employee emp = new OutsourcedEmployee(name, hours, valuePerHour,
				// additionalCharge);
				list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));

			} else {
				// Employee emp = new Employee(name, hours, valuePerHour); adicionando direto a
				// lista
				list.add(new Employee(name, hours, valuePerHour));

			}
			System.out.println();
			System.out.println("Payments : "); // pagamento 
			for (Employee emp : list ) {
				System.out.println(emp.getName() + " - $ "+ String.format("%.2f", emp.payment()));
			}
			
			
		}

		sc.close();

	}
}
