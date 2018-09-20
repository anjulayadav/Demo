package question5;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class MainClass {

	public static void main(String[] args){
		Vector<Employee> vobj= new Vector<>();
		vobj.addElement(new Employee(101,"ABCD","Delhi"));
		vobj.addElement(new Employee(102,"XYZ","Banglore"));
		vobj.addElement(new Employee(103,"QWERTY","Noida"));
		MainClass obj=new MainClass();
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("--------Menu--------");
			System.out.println("1. Input Data");
			System.out.println("2. Display Data");
			System.out.println("3. Exit");
			System.out.println("Enter Your Choice ");
			int ch=Integer.parseInt(sc.nextLine());
			switch(ch){
			case 1: obj.addInput(vobj);
				break;
			case 2: obj.display(vobj);
				break;
			case 3: System.exit(0);
				break;
				default:
					System.out.println("Wrong Input");
			}
		}
	}//end main

	private void display(Vector<Employee> vobj) {
		// TODO Auto-generated method stub
		Enumeration<Employee> eobj=vobj.elements();
		while(eobj.hasMoreElements()){
			System.out.println(eobj.nextElement());
		}
	}

	private void addInput(Vector<Employee> vobj) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee_id");
		int empid=Integer.parseInt(sc.nextLine());
		System.out.println("Enter Employee Name");
		String name=sc.nextLine();
		System.out.println("Enter Employee Name");
		
		String addr=sc.nextLine();
		vobj.addElement(new Employee(empid,name,addr));
		System.out.println("Data Inserted");
	}
}//end class
