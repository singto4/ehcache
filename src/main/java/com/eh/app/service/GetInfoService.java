package com.eh.app.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class GetInfoService {
	
	@Cacheable(value = "infoCache", key = "#id")
    public String getDataById(String id) {
		System.out.println("Get data ID " + id + " from DB");
        return "Data for ID: " + id + ", Message : oldMessage";
    }
	
	@CachePut(value = "infoCache", key = "#id")
    public String updateDataById(String id, String msg) {
	System.out.println("Update data ID " + id);
        return "Data Data for ID: " + id + ", Message : " + msg;
    }

    @CacheEvict(value = "infoCache", key = "#id")
    public void clearCacheById(String id) {
        System.out.println("Clear Cache for ID: " + id);
    }

}
