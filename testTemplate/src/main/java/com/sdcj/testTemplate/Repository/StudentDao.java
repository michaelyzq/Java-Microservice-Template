package com.sdcj.testTemplate.Repository;

import java.util.List;

import javax.persistence.Query;


import org.springframework.stereotype.Repository;


import com.sdcj.testTemplate.entity.Student;


@Repository
public class StudentDao extends AbstractJpaDAO<Student>{
	
	public  StudentDao() {
		setClazz(Student.class);
		
	}
	
	public List<Student> searchstudent(){

		final StringBuilder queryStr = new StringBuilder(" from Student c where 1=1 ");	
		final Query query = entityManager.createQuery(queryStr.toString());
		return query.getResultList();
	}

	

}
