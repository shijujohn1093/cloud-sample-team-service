## Micro-service Spring Boot Sample application 1

- In this exercise you will create a simple Spring Boot application.  If you feel you already have a good understanding of Spring Boot you can skip this exercise.  All other exercises in this course will assume you know Spring Boot.

**Points to ponder**

1. You can create multiple data source and repository see ProductConfig and UserConfig
	- If you have multiple datasource with same name then, you can use @Primary annotation for default injection.
	
2. We used thymleaf for user interface, 
	- Create a new folder under src/main/resources called "templates", If not already present.
	
3. Use @XmlRootElement annotation on root response model and Include header "Accept"="application/xml" or "applicaiton/json" to get the desired response.

4. Add this property to application.properties to control how the JPA implementation (Hibernate) should handle the DB schema:
  ```
        spring.jpa.hibernate.ddl-auto = update
  ```
**Part 7 (Optional) - Explore the Actuator Endpoints**

5.  One of the dependencies we specified was Actuator.  It automatically adds some useful endpoints to our web application.  Open the following with a browser:
  - [/actuator/info](http://localhost:8080/actuator/info)
  - [/actuator/health](http://localhost:8080/actuator/health)
6.  Notice that some other actuator endpoints are not enabled by default.  Try the following - they won't work, but take a close look at the reason why - exposing these could be a security risk:
  - [/actuator/beans](http://localhost:8080/actuator/beans)
  - [/actuator/configprops](http://localhost:8080/actuator/configprops)
  - [/actuator/autoconfig](http://localhost:8080/actuator/env)

7.  Enable these actuator endpoints by adding the following setting to your application.properties (save your work and restart):
  - management.endpoints.web.exposure.include=beans,configprops,mappings,env
 
8.  Explore [/actuator/mappings](http://localhost:8080/actuator/mappings).  This is a useful one for debugging web applications.  Search through and see where the @GetMappings you set earlier are setup.

  **Part 8 (Optional) - DevTools**
  
9.  Often while developing we need to run an application, then make some changes, then restart.  The Spring Boot "DevTools" dependency can make things easier by automatically restarting when changes are detected  (though it is not as full-featured as other tools like JRebel).  Add the following dependency: 

  ```
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-devtools</artifactId>
        <optional>true</optional>
    </dependency>  
  ```
  
10.  While your application is running, make a small, innocent change to some code (like a comment or spacing).  Observe that depending on the change, DevTools will restart your application.  

11. The easiest way to have different configurations for different environments is to use spring profiles. See externalized configuration.
	-https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-external-config.html
	-This gives you a lot of flexibility, I am using it in my projects and it is extremly helpful. In your case you would have 3 profiles 'local', 'jenkins' and 'openshift'
	-You then have 3 profile specific property files application-local.properties application-jenkins.properties application-openshift.properties
	-There you can set the properties for the regarding environment. When you run the app you have to specify the profile to activate like -Dspring.profiles.active=jenkins

Tips:
- When running in Eclipse or STS, you can get automatic hot-swapping of many code changes without DevTools if you "debug" the application rather than "run" it.
- If you encounter unusual issues in the application, it may be useful to remove the DevTools dependency to see if the problem persists.
