package coursesProject.core.logging.concretes;

import coursesProject.core.logging.abstracts.Logger;

public class DatabaseLogger implements Logger {

	@Override
	public void log(String data) {
        System.out.println(data+" has been added to database.");
		
	}

}
