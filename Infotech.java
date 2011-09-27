public class Infotech{
	private String my_name_is(String name){
		return "my name is "+name;
	}
	public String saru(){
		return my_name_is("saru");
	}
	public String tori(){
		return my_name_is("tori");
	}
	public String inu(){
		return my_name_is("inu");
	}
	
	// main
	public static void main(String[] args){
		Infotech it = new Infotech();
		System.out.println(it.saru()); // 
		System.out.println(it.tori());
		System.out.println(it.inu());
	}
}