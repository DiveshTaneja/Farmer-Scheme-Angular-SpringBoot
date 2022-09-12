package com.lti;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.lti.entity.Farmer;
import com.lti.repository.FarmerRespository;
import com.lti.repository.FarmerRespositoryImpl;

@SpringBootTest
class FarmerSchemeApplicationTests {
	
FarmerRespository dao=new FarmerRespositoryImpl();
	@Test
	public void addOrUpdateFarmer() {
        Farmer farmer=new Farmer();
        farmer.setAadharNo(7878676567876567L);
        farmer.setBalance(40000);
        farmer.setContactNo("8767886156");
        farmer.setEmail("sam@gmail.com");
        farmer.setFarmerFirstName("divesh");
        farmer.setFarmerLastName("taneja");
        farmer.setLandDetails("2 Hectar");
        farmer.setPassword("saurabh123");
        int savedFarmer=dao.addOrUpdateFarmer(farmer);
        assertNotNull(farmer);

    }

}
