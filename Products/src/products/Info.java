package products;

import java.util.Scanner;

public class Info 
{
	private String Name;
	private int Quantity;
	private String Date;
	private String Address;
	private int phoneNumber;
	private String Email;

public Info()
{
	this.Name = "Test";
	this.Quantity = 12345;
	this.Date = "Test";
	this.Address = "Test";
	this.phoneNumber = 123456789;
	this.Email = "Test";
	
}

public Info(String name, int quantity, String date, String address, int phone, String email)
{
	this.Name = name;
	this.Quantity = quantity;
	this.Date = date;
	this.Address = address;
	this.phoneNumber = phone;
	this.Email = email;
}

public String getName() {
	return Name;
}

public int getQuantity() {
	return Quantity;
}

public String getDate() {
	return Date;
}

public String getAddress() {
	return Address;
}

public int getPhoneNumber() {
	return phoneNumber;
}

public String getEmail() {
	return Email;
}

public void setName(String name) {
	Name = name;
}

public void setQuantity(int quantity) {
	Quantity = quantity;
}

public void setDate(String date) {
	Date = date;
}

public void setAddress(String address) {
	Address = address;
}

public void setPhoneNumber(int phoneNumber) {
	this.phoneNumber = phoneNumber;
}

public void setEmail(String email) {
	Email = email;
}
public void productsinfo()
{
	System.out.println("------------------------------");
	System.out.println("--------Products-Info---------");
	System.out.println("------------------------------");
	System.out.println("Name of Product : " + getName());
	System.out.println("Quantity of product : " + getQuantity());
	System.out.println("Date : " + getDate());
	System.out.println("Address : " + getAddress());
	System.out.println("Phone Number : " + getPhoneNumber());
	System.out.println("Email : " + getEmail());
}
public void enroll()
{
	Scanner in = new Scanner(System.in);
	
	System.out.println("Name of Product : ");
	String Name = in.nextLine();
	setName(Name);
	
	System.out.println("Quantity of Product : ");
	int Quantity = in.nextInt();
	setQuantity(Quantity);
	
	System.out.println("Date : ");
	String Date = in.nextLine();
	setDate(Date);
	
	in.nextLine();
	
	System.out.println("Address : ");
	String Address = in.nextLine();
	setAddress(Address);
	
	System.out.println("Phone Number : ");
	int tel = in.nextInt();
	setPhoneNumber(tel);
	
	in.nextLine();
	
	System.out.println("Email : ");
	String Email = in.nextLine();
	setEmail(Email);
	
	in.close();
}
}