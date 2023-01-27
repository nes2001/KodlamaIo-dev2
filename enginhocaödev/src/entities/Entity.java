package entities;

public interface Entity {
	void setId(int id);
	void setName(String name);
	default void interfaceName() {
		System.out.println("Entity");
		
	}
	static void description() {
		 System.out.println("" +
	                "This interface specifies an entity, as we all know and an entity must get the inputs 'id' and 'name'." +
	                "And this 'entity' interface(contract) belongs to 'www.kodlama.io' website which was founded by 'Engin Demiroğ' a few years ago.");
	        }
		
	}


