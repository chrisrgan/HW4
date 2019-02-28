
public class Book {
//Address book class that creates people object from address class 
	
	
	
	static String[][] array= new String[10][3];
	static int count = 0;
	public static void add(String name, String address, String phonenum)
	{
		address Person = new address(name, address, phonenum); // create a new person object from class address

		// populate an array
		//populate person objects
		
		array[count][0] = Person.getname();
		array[count][1] = Person.getaddress();
		array[count][2] = Person.getPhonenum();

		//Listing all unsorted contacts that have been added so that user can see who is in the address book
		//so that they can chose who to delete or edit out
		
		System.out.println("These are the people in the address book now");
		for (int i=0;i<=count;i++)
		{
			System.out.println(array[i][0] + "," + array[i][1] + "," + array[i][2]);
		
		}
		
		
		count++;
		//System.out.println(count);

	}
	
	public static void edit(String name, String newname)
	{

	
		//search for name in array and change it
		for (int i=0; i<count; i++)
		{
			if (array[i][0].equals(name))
			{
				array[i][0] = newname;
				//System.out.println(array[i][0]);

			}
		}
		
		System.out.println("These are the people in the address book now");
		for (int i=0;i<=count -1 ;i++)
		{
			System.out.println(array[i][0] + "," + array[i][1] + "," + array[i][2]);
		
		}
		
		//System.out.println(count);

	}
	
	public static void delete(String name)
	{
		for (int i=0; i<=count-1; i++)
		{
			if (array[i][0].equals(name) && (i != (count-1)))
			{
				for (i=i; i<=count-1; i++)
				{
					array[i][0] = array[i+1][0];
					array[i][1] = array[i+1][1];
					array[i][2] = array[i+1][2];

				}
				
				//delete all other rows of the array
				
				for(i=0; i<=count; i++) //checking the array
				{
					System.out.print(array[i][0] + "," + array[i][1] + "," + array[i][2] + "\n");

				}				
			
				
				System.out.println("Person has been deleted, they were not in last row");
				count--;

				
			}
			
			else if (array[i][0].equals(name) && (i == (count-1)))
			{
				array[i][0] = ("");
				array[i][1] = ("");
				array[i][2] = ("");
				
				
				System.out.println("Person has been deleted, they were in last row");
				for(int z=0; z<=i-1; z++) //checking the array
				{
					System.out.print(array[z][0] + "," + array[z][1] + "," + array[z][2] +"\n");
				}		
				
				count--;
			}
		}
		
		//System.out.println(count);

	}
	
	public static void sort()
	{
		String temp;
		
		for (int i=1; i< count; i++)
			//comparison loop
		{
			for (int j=0; j< count -1; j++)
			{
				if(array[j][0].compareToIgnoreCase(array[j+1][0]) > 0 )
				{
					temp = array[j][0];
					array[j][0] = array[j+1][0];
					array[j+1][0] = temp;
					
					temp = array[j][1];
					array[j][1] = array[j+1][1];
					array[j+1][1] = temp;
					
					temp = array[j][1];
					array[j][2] = array[j+1][2];
					array[j+1][2] = temp;
				}

			}
		}
		
		for(int z=0; z<=count-1; z++) //checking the array
		{
			System.out.print(array[z][0] + "," + array[z][1] + "," + array[z][2] + "\n" );

		}
	
		//System.out.println(count);

	}
	
	public static void search(String name)
	{
		for (int i=0; i<=count-1; i++)
		{
			if (array[i][0].equals(name) || array[i][1].equals(name) || array[i][2].equals(name))
			{
				System.out.println("This is all of their information");
				System.out.println(array[i][0] + "," + array[i][1] + "," + array[i][2]);
				System.out.println("They were number" + " " + (i+1) + " " + "in the address book");
			
			}
		}
		
		//System.out.println(count);

	}
	
	public static void end()
	{
		count =0;
	}
}
