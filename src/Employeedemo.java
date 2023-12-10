
public class Employeedemo {//class employeedemo starts

	public static void main(String[] args) {//main method of the class-prototype method
		
		Employee e=new Employee();//object instance is created for employee class
		e.setEmpid(132);//calling methods
		e.setEmpname("ganesh");
       e.setDesignation("developer");
       e.setSalary(18500);
       
      System.out.println( e.getEmpid()+" "+e.getEmpname()+" "+ e.getDesignation()+" "+ e.getSalary());//print statement
	}

}//class ends
