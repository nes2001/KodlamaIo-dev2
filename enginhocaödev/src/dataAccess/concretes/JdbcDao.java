package dataAccess.concretes;

import dataAccess.abstracts.IEntityDao;
import entities.Entity;

public class JdbcDao implements IEntityDao{

	@Override
	public void add(Entity entity) {
        System.out.println("JDBC ile veritabanına eklendi.");
		
	}

	
	
}
