package com.irsk8sDemo.irsk8s;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;


public interface K8sDemoRepository extends MongoRepository<Irsk8sApplication, String>{

	//List<Irsk8sApplication> findByVersion(String firstName);

}