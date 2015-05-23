package demo.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class DataController {	

    @RequestMapping("/getSystemProperties")
    public @ResponseBody List<String> getDataList() {
    	List<String> result = new ArrayList<String>(5);
    	result.add("Operating system architecture: " + System.getProperty("os.arch"));
    	result.add("Operating system name: " + System.getProperty("os.name"));
    	result.add("Operating system version:" + System.getProperty("os.version"));
    	result.add("JRE vendor name: " + System.getProperty("java.vendor"));
    	result.add("JRE version number: " + System.getProperty("java.version"));
    	
		return result;
    }
}