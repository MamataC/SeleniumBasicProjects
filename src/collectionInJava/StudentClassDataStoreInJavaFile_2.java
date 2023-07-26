package collectionInJava;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentClassDataStoreInJavaFile_2 {

	public static void main(String[] args) {
		
		StudentClassDeclareInJavaFile_1 s1 = new StudentClassDeclareInJavaFile_1(10,"Jay",21);
		StudentClassDeclareInJavaFile_1 s2 = new StudentClassDeclareInJavaFile_1(20,"Ram",22);
		StudentClassDeclareInJavaFile_1 s3 = new StudentClassDeclareInJavaFile_1(30,"Vijay",23);
		
		ArrayList<StudentClassDeclareInJavaFile_1> al = new ArrayList<StudentClassDeclareInJavaFile_1>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		Iterator itr = al.iterator();
		 while(itr.hasNext()) {
			 StudentClassDeclareInJavaFile_1 st = (StudentClassDeclareInJavaFile_1)itr.next();
			 System.out.println(st.rollNo+" "+st.name+" "+st.age);
		 }
	}

}
