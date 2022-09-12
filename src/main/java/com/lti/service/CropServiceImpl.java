package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.entity.Crop;
import com.lti.repository.CropRespository;

@Service
public class CropServiceImpl implements CropService {
	
	@Autowired
	private CropRespository cropRepo;
	
	

	@Override
	public void updateCrop(Crop crop) {
		cropRepo.updateCrop(crop);
	}



	@Override
	public Crop findById(int cropId) {
		return cropRepo.findById(cropId);
	}



}
