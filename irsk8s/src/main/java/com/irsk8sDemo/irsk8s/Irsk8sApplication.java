package com.irsk8sDemo.irsk8s;

//import org.springframework.boot.SpringApplication;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.index.Indexed;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


@Document("AppDemo")

public class Irsk8sApplication {

	@Id
	private String id;
	private String serviceName;
	private String serviceVersion;

	public Irsk8sApplication(String id, String serviceName, String serviceVersion) {
		super();
		this.id = id;
		this.serviceName = serviceName;
		this.serviceVersion = serviceVersion;
	}
	
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getServiceName() {
		return serviceName;
	}


	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}


	public String getServiceVersion() {
		return serviceVersion;
	}


	public void setServiceVersion(String serviceVersion) {
		this.serviceVersion = serviceVersion;
	}

/*public static void main(String[] args) {
	 SpringApplication.run(Irsk8sApplication.class, args);
}*/

}
