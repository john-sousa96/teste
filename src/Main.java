import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.List;


//import entities.Account;
//import entities.Hospede;
import entities.Employee;
//import entities.Notas;
//import entities.Rectangle;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner (System.in);
		
		List <Employee> list = new ArrayList<>();
		System.out.print("How many employees will be registered?  ");
		int n = sc.nextInt();
		
		for (int i = 0; i< n; i++) {
			System.out.println("Employee #" + (i + 1));
			System.out.print("Id: ");
			Integer id = sc.nextInt();
				
			while(hasId(list, id)){
				System.out.println("Id already taken! Try again! Id: ");
				id = sc.nextInt();
			}
			
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Employee emp = new Employee(id, name, salary);
			list.add(emp);
		}
		
		System.out.println();
		System.out.println("Enter the employee Id that will have salary increase:");
		int id = sc.nextInt();
		
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if(emp == null) {
			System.out.println("This id does not exist!");
		}else {
			System.out.print("Enter the percentage");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for (Employee e: list) {
			System.out.println(e);
		}
		
		sc.close();
		
		/*
		 * System.out.print("How many rooms will be rented?  "); int n = sc.nextInt();
		 * Hospede[] vect = new Hospede[9]; sc.nextLine();
		 * 
		 * for (int i = 0; i < n; i++) {
		 * 
		 * System.out.print("Enter guest name: "); String name = sc.nextLine();
		 * 
		 * System.out.print("Enter guest's email: "); String email = sc.nextLine();
		 * 
		 * System.out.print("Enter which room you want to rent: "); int room =
		 * sc.nextInt(); sc.nextLine();
		 * 
		 * vect[room] = new Hospede(name, email, room); }
		 * System.out.println("Busy rooms:"); for (int i = 0; i < vect.length; i++) {
		 * 
		 * if (vect[i] != null) { System.out.println(i + ": " + vect[i].getName() +", "
		 * +vect[i].getEmail()); } }
		 * 
		 * 
		 * 
		 * 
		 * sc.close();
		 */
				
		/*
		 * System.out.print("Enter account number:"); int number = sc.nextInt();
		 * System.out.print("Enter account holder:"); sc.nextLine(); String holder =
		 * sc.nextLine(); System.out.print("Is there an initial deposit?"); char initial
		 * = sc.next().charAt(0); System.out.println();
		 * 
		 * 
		 * Account account; if( initial == 'y' ) {
		 * System.out.print("Enter initial deposit value:"); double money =
		 * sc.nextDouble(); account = new Account (number, holder, money); }else {
		 * account = new Account (number, holder); }
		 * 
		 * 
		 * System.out.println(account.toString());
		 * 
		 * System.out.println("Enter a deposit value:"); double deposit =
		 * sc.nextDouble();
		 * 
		 * account.depositMoney(deposit);
		 * 
		 * System.out.println(account.toString());
		 * 
		 * 
		 * System.out.println("Enter a withdraw value:"); double saque =
		 * sc.nextDouble();
		 * 
		 * account.saqueMoney(saque);
		 * 
		 * System.out.println(account.toString());
		 * 
		 * 
		 * sc.close();
		 */
		/*
		 * Employee employee = new Employee (); Scanner sc = new Scanner(System.in);
		 * Locale.setDefault(Locale.US);
		 * 
		 * 
		 * System.out.print("Name: "); employee.name = sc.nextLine();
		 * 
		 * System.out.print("Gross Salary: "); employee.grossSalary = sc.nextDouble();
		 * 
		 * System.out.print("Tax: "); employee.tax = sc.nextDouble();
		 * 
		 * Double netSalary = employee.NetSalary();
		 * 
		 * System.out.println("Employee: " + employee.name + ",$" + netSalary );
		 * 
		 * double percentage, newSalary;
		 * System.out.print("Which percentage to increase salary: "); percentage =
		 * sc.nextDouble(); newSalary = employee.IncreaseSalary(percentage);
		 * System.out.println("Updated data: " + employee.name + ", $" + newSalary);
		 */
		
		/*
		 * System.out.println("Enter rectangle width and height:");
		 * //System.out.println(""); rectangle.width = sc.nextDouble(); rectangle.height
		 * = sc.nextDouble();
		 * 
		 * rectangle.Area(); rectangle.Perimeter(); rectangle.Diagonal();
		 * 
		 * System.out.println("Area: " + rectangle.area);
		 * System.out.println("Perimeter: " + rectangle.perimeter);
		 * System.out.println("Diagonal: " + rectangle.diagonal);
		 */
		
		//sc.close();
		
		
	}
	
	public static boolean hasId(List <Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
