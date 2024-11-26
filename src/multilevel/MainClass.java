package multilevel;

public class MainClass {
	public static void main(String[] args) {

		Department d = new Department();
		//System.out.println(d.universityname);
		//System.out.println(d.collegename);
		//System.out.println(d.departmentname );


		System.out.println("---------");


		d.conductexams();
		d.conductinternals();
		d.giveassignments();



	}

}
