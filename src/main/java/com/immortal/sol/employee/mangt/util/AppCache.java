package com.immortal.sol.employee.mangt.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.immortal.sol.employee.mangt.app.AppConstants;
import com.immortal.sol.employee.mangt.app.AppRepository;
import com.immortal.sol.employee.mangt.exception.PropertyNotFoundException;

@Component
public class AppCache {
	
	@Autowired
	private static AppRepository repository;
	
	private static Map<String, String> properties = new HashMap<>();
	
	
	public static String getValue(String key) throws PropertyNotFoundException{
		
		if(!properties.isEmpty()) {
			if(properties.containsKey(key) && properties.get(key) != null) {
				return properties.get(key);
			} else {
				throw new PropertyNotFoundException("Property Not found :"+key);
			}
		}
		return null;
	}
	
	public static void loadCache() {
		List<AppConstants> data = repository.findAll();
		if(!data.isEmpty()) {
			for(AppConstants constant : data) {
				properties.put(constant.getAppKey(), constant.getAppValue());
			}
		}
		System.out.println(properties);
	}

	public static Map<String, String> getProperties() {
		return properties;
	}

	public static void setProperties(Map<String, String> properties) {
		AppCache.properties = properties;
	}

}
