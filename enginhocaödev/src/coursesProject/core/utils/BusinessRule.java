package coursesProject.core.utils;

public class BusinessRule {
	
	public static void run(String description, boolean...logics) {
	
	for (boolean logic:logics) {
		if(logic)
			throw new RuntimeException(description);
	}
	
	
	

	}
}
