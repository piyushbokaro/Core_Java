package comparator.comparable;

public class CustomerTest {
	public static void main(String[] args) {

	}
}

class Customer implements Comparable<Object> {
	int cid;
	String cName;
	String email;
	long phone;
	
	public Customer(int cid, String cName, String email, long phone) {
		super();
		this.cid = cid;
		this.cName = cName;
		this.email = email;
		this.phone = phone;
	}
	
	public String toString(){
		return "[" + cid + ", " + cName + ", " + email + ", " + phone + "]";
	}

	public int compareTo(Object object) {
		Customer customer = (Customer) object;
		String cName = this.cName;
		String cName1 = customer.cName;
		int x = cName.compareTo(cName1);
		return x;
	}
}


