package com.example.demo.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("leidas")
public interface LeidasService {
	
	@RequestMapping("/api/leidas")
	public String getLeidas();

}
