package com.eureka.client.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="image-service")
public interface ImageClient {

	@GetMapping("/images/")
	public List getImages();
}
