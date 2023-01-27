package coursesProject.business.concretes;

import coursesProject.business.abstracts.IInstructorService;
import coursesProject.core.logging.abstracts.Logger;
import dataAccess.abstracts.IEntityDao;
import entities.Instructor;

public class InstructorManager implements IInstructorService {

	    private final IEntityDao ientityDao;
	    private final Logger[] loggers;

	    
	    
	    public InstructorManager(IEntityDao ientityDao, Logger[] loggers) {
			this.ientityDao = ientityDao;
			this.loggers = loggers;
		}



		@Override
		public void add(Instructor instructor) {
         ientityDao.add(instructor);
		for(Logger logger:loggers) {
			logger.log("Instructor");
		}
		}

	    
	    
	    
	    
	
	
}
