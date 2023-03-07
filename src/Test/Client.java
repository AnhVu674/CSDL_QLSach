package Test;

import java.util.ArrayList;

import Controller.Dao_Sach;
import Controller.Sach;

public class Client {
public static void main(String[] args) {
	Sach s1 = new Sach("1", "Java", "2021", 1000.0);
	Sach s2 = new Sach("2", "C", "2002", 20000.0);
	Dao_Sach.getInstence().insert(s1);
	Dao_Sach.getInstence().upDate(s2);
	Dao_Sach.getInstence().delete(s2);
	ArrayList<Sach> dss = Dao_Sach.getInstence().selectAll();
	for (Sach sach : dss) {
		System.out.println(sach.toString());
	}
	Sach find = new Sach(null, null, null, 0);
	find.setId("1");
	Sach sach = Dao_Sach.getInstence().selectByID(find);
	System.out.println(sach);
	ArrayList<Sach> sach1 = Dao_Sach.getInstence().selectCondition("id>1");
	for (Sach sach2 : sach1) {
		System.out.println(sach1.toString());
	}
			
}
}
