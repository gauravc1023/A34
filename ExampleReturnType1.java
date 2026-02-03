import java.util.*;
class ExampleReturnType1{
	public static void main(String [] args){
		ArrayList list = myInfo();
		System.out.println(list);
	}
	public static ArrayList myInfo(){
		String name = "Gaurav Chaudhari";
		Long contact = 8767061109L;
		String email = "gaurav@gmail.com";
		int yop = 2025;
		String university = "Savitribai Phule Pune University";
		double cgpa = 7.00;
		String bloodGroup = "B+";
		
		ArrayList list = new ArrayList();
		list.add(name);
		list.add(contact);
		list.add(email);
		list.add(yop);
		list.add(university);
		list.add(cgpa);
		list.add(bloodGroup);

		return list;
	}
}
