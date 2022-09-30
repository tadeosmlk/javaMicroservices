package com.irsk8sDemo.irsk8s;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableMongoRepositories
@RequestMapping("/api")
public class DemoService {
	
	@Autowired
	K8sDemoRepository k8sDemorepository;	
	
	
	@PostMapping("/seed") 
	public String seed() {
		System.out.println("initiating data creation...");
		
		Irsk8sApplication ika = new Irsk8sApplication("id001001001", "Testapp", "v1");
		k8sDemorepository.save(ika);
		
		String msg = ("Initial data ingestion have completed.");
		return msg;
	}
	
	@GetMapping("/clean")
	public String clean() {
		k8sDemorepository.deleteAll();
		String msg = "Cleaned seed data successfully!";
		System.out.println(msg);
        
		return msg;
	}
	
	@GetMapping("/getVersion")
	public List<Irsk8sApplication> getVersion() {		
			//return groceryItemRepo.findAll();
			return k8sDemorepository.findAll();
		}


}


