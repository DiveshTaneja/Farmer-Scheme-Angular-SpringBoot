package com.lti.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.lti.entity.Farmer;
import com.lti.repository.FarmerRespository;
import com.lti.repository.FarmerRespositoryImpl;

class FarmerTest {
	FarmerRespository dao=new FarmerRespositoryImpl();
	@Test
	void test() {
		fail("Not yet implemented");
	}
	@Test
	void getFarmer() {
		Farmer f=dao.findById(2000);
		assertNotNull(f);
		
	}

}
