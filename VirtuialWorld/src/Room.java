import java.util.ArrayList;
     

public class Room {
	ArrayList<String> carts;
	public Room(){                      
		carts = new ArrayList<String>();
	}
	String type;
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	public void addIndexs(String cart){
		carts.add(cart);
	}
	public void listIndexs(){
		System.out.println(carts.get(0));
		System.out.println(carts.get(1));
		System.out.println(carts.get(2));
		System.out.println(carts.get(3));
		
	}
}
