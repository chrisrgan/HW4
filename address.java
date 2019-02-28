

public class address 
//Person class that has the constructor that gives new people object name, addres, phonenum

{


	private static String name;
	private static String address;
	private static String phonenum;


	
	
	
	public address (String name, String address, String phonenum)
	{
		//Constructor, instantiates an object with these attritubes everytime new object is created from class.
		//eg: address Phonebook = new address("Phonebook"); 


		this.name = name; // this arument name in the grey is equal to the decalred variable name in the blue.
		// can be used to get back their name
		this.address = address; //.address .name   .phonenum are used to call the object's name, address, and phonenum
		this.phonenum = phonenum;		
	}
	
	public static String getPhonenum()
	{
		return phonenum;
	}
	
	public String getname()
	{
		return name;
	}
	
	public static String getaddress()
	{
		return address;
	}
	
	
	
	
	
	
}

