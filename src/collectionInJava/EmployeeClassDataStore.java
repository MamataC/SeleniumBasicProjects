package collectionInJava;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeClassDataStore {

	public static void main(String[] args) {
		EmployeeClassDeclare e1 = new EmployeeClassDeclare(111,20000,"Jay");
		EmployeeClassDeclare e2 = new EmployeeClassDeclare(222,40000,"Ajay");
		EmployeeClassDeclare e3 = new EmployeeClassDeclare(333,60000,"Vijay");
		
		ArrayList<EmployeeClassDeclare> emp = new ArrayList<EmployeeClassDeclare>();
		
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		
		Iterator itr =emp.iterator();
		while(itr.hasNext()) {
			EmployeeClassDeclare e = (EmployeeClassDeclare)itr.next();
			System.out.println(e.id+" "+e.salary+" "+e.empName);
		}

	}

}
