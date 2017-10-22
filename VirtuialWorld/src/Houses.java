
public class Houses {
	static String people;
	static int number;
	static String items;

	public static void main(String[] args){
		people=("Ansh, Sanjay, Neel, Ninita");
		number=4;
		Room room=new Room();
		room.setType("Bedroom");
		room.setName("Bedroom contains");
		room.listIndexs();
		
		Items item=new Items();
		item.setName("Bed");
		item.setType("Comfy");
		
		System.out.println("Ansh went to sleep in his comfy bed in his bedroom");
		System.out.println("Their are " + calculator() + "people");
		
	}

	public static String calculator(){
		number=number-1;
		return items;
		
	}
}
