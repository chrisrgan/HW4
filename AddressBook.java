import java.util.Scanner;
import java.util.ArrayList;


public class AddressBook
{
	
	
	public static void main(String[] args)
	{
		boolean recur = true;
	
		
		
		
		while (recur)
		{
		System.out.println("What woud you like to do?");
		System.out.println("1. Add a new contact");
		System.out.println("2. Update an existing contact");
		System.out.println("3. Delete a contact");
		System.out.println("4. List all added contacts in sorted order");
		System.out.println("5. Search for a given contact.");
		System.out.println("6. Quit");

		Scanner scan1 = new Scanner(System.in);
		int choice = scan1.nextInt();
		Book addressbook = new Book();//new class object of class book needs to be instantiated because calling its methods...

		if (choice ==1)
		{
			
			
			System.out.println("What is their name?");
			Scanner scan = new Scanner(System.in);
			String name1 = scan.next();
			
			System.out.println("What is their address?");
			Scanner scan2 = new Scanner(System.in);
			String address1 = scan2.next();
			
			System.out.println("What is their phone number?");
			Scanner scan3 = new Scanner(System.in);
			String phone = scan3.next();
			
			Book.add(name1,address1,phone);
			
			
			
			
			System.out.println("Do you want to continue? Enter true or false");
			Scanner scan5 = new Scanner(System.in);
			recur = scan5.nextBoolean();
			
		
			
			
			
			//why all decaled variables needed to be static???
			//why needed to be name1 and address1???
			//phone numbers should be str
			
			
			
			
		}
		
		if (choice ==2)
		{
			System.out.println("Which contact do you want to update?, spell their name as you entered them");
			Scanner scan5 = new Scanner(System.in);
			String name = scan5.next();
			
			System.out.println("What is the new name");
			Scanner scan6 = new Scanner(System.in);
			String newname = scan6.next();
			
			Book.edit(name,newname);
			
			System.out.println("Do you want to continue? Enter true or false");
			Scanner scan51 = new Scanner(System.in);
			recur = scan51.nextBoolean();
			
			//update the object..in the class address..swap()?
			//redisplay it in array if need to
			
			
			//int index = Contacts.indexOf(name);
			//System.out.println(index);
			
		}
		
		if (choice ==3)
		{
			System.out.println("Which contact do you want to delete?");
			Scanner scan6 = new Scanner(System.in);
			String name = scan6.next();
			
			Book.delete(name);
			
			System.out.println("Do you want to continue? Enter true or false");
			Scanner scan51 = new Scanner(System.in);
			recur = scan51.nextBoolean();
			
			//delete the object.. in the class address
			//delete it from the array if need to
			
		}
		
		if (choice ==4)
		{
			//sort the array, then print out the array
			Book.sort();
			System.out.println("Do you want to continue? Enter true or false");
			Scanner scan51 = new Scanner(System.in);
			recur = scan51.nextBoolean();
		}
		
		if (choice ==5)
		{
			//Search for the contact in the array and print out that row..
			System.out.println("Which contact do you want to search for? You can search by name, address, or phone number");
			Scanner scan7 = new Scanner(System.in);
			String name = scan7.next();
			Book.search(name);
			
			System.out.println("Do you want to continue? Enter true or false");
			Scanner scan51 = new Scanner(System.in);
			recur = scan51.nextBoolean();
		}
		
		if (choice ==6)
		{
			Book.end();
			System.out.println("Thanks for using the Address Book");
			recur = false;
		}
		
		
		
		
	}
	}
}

