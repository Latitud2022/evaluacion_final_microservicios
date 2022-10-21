package com.example.reelsredsocial.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.reelsredsocial.commons.GenericServiceImpl;
import com.example.reelsredsocial.dao.api.ReelsDaoAPI;
import com.example.reelsredsocial.model.Reels;
import com.example.reelsredsocial.service.api.ReelsServiceAPI;

@Service
public class ReelsServiceImpl extends GenericServiceImpl<Reels, Long> implements ReelsServiceAPI {

	@Autowired
	private ReelsDaoAPI reelsDaoAPI;
	
	@Override
	public CrudRepository<Reels, Long> getDao() {
		return reelsDaoAPI;
	}

}
