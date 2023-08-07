package part_9;

public class Ex9_3_equalsPractice {

	public static void main(String[] args) {
		
		Person2 ps = new Person2(10);
		Person2 ps1 = new Person2(10);
		
		System.out.println(ps.equals(ps1));
		
		

	}

}


class Person2{
	
	long id;
	
	
	  public boolean equals(Object obj){
	  
	  if(obj instanceof Person2) { return id == ((Person2)obj).id; }
	  
	  return false;
	  
	  }
	 
	
	Person2(long id){
		this.id = id;
	}
	
}
