package com.immortal.sol.employee.mangt;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.immortal.sol.employee.mangt.app.AppConstants;
import com.immortal.sol.employee.mangt.app.AppRepository;
import com.immortal.sol.employee.mangt.util.AppCache;

@Component
@Lazy(value = true)
public class AppBootListener implements ApplicationListener<ApplicationReadyEvent>{

	@Autowired
	private AppRepository repository;
	
	@Override
	public void onApplicationEvent(ApplicationReadyEvent event) {
		System.out.println("---App cache load started----");
		List<AppConstants> data = repository.findAll();
		if(!data.isEmpty()) {
			Map<String, String> properties = new HashMap<>();
			for(AppConstants constant : data) {
				properties.put(constant.getAppKey(), constant.getAppValue());
			}
			AppCache.setProperties(properties);
			System.out.println(properties);
		}
		System.out.println("---App cache load successfully----");
	}

}
