package dataAccess.concretes;

import dataAccess.abstracts.IEntityDao;
import entities.Entity;

public class HibernateDao implements IEntityDao{

	@Override
	public void add(Entity entity) {
        System.out.println("Hibernate ile veritabanına eklendi.");
		
	}
	
	
	
	
	

}
