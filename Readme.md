# Microservices Demos

## Workspace Setup

1. Launch STS and Use new folder path `c:\microservices-july24`
1. Goto "Window" -> "Preferences" and then Search for JRE Built Path
    Ensure you have JDK 17
4.  Ensure Java Compiler version Is set to 17
5.  Save All

## Demo 1 : Basic Java Project (Command line)

File Menu -> New -> Spring Starter Project

   Build Tool : Maven
   Language : Java
   Packaging: Jar
   Project Name : demo-1
   Group Name : com.oracle1
   Artifact : demo-1
   version : 1.0
   Package Name : com.oracle1.demo1

 Click Next and Then finish button
 Goto "application.properties" in src/main/resources and add these lines:

```ini
spring.application.name=demo-1
## Add any config here !!!
owner.name=Mahendra ## OS Env OWNER_NAME 
```
  
Open Demo1Application.java in src/main/java
 
```java
@SpringBootApplication
public class Demo1Application implements CommandLineRunner {

	@Value("${owner.name}")
	private String owner; 
	
	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);		
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello "+owner);	
	}
}
```

6. Right click anywhere inside the java code and use option "Run As" > "Java Application"

> Spring boot projects include "Embedded Maven" which can be used from Command line to build projects

```bash
$ cd demo-1
$ mvnw.cmd package
$ cd target
$ java -jar demo-1-1.0.jar
```

> Test the Env Variable Override

```bash
$ cd demo-1
$ set OWNER_NAME=Tommy
$ java -jar demo-1-1.0.jar
```


## Demo 2 : Basic REST Service Project

1. File Menu -> New -> Spring Starter Project

   Build Tool : Maven
   Language : Java
   Packaging: Jar
   Project Name : demo-2
   Group Name : com.oracle1
   Artifact : demo-2
   version : 1.0
   Package Name : com.oracle1.demo2

2. In Dependencies choose "Spring Web"

3. Create a new `HomeController` java class in src/main/java folder

```java
@RestController
@RequestMapping("/")
public class HomeController {

	@GetMapping(produces = "application/json")
	
	public String home() {
		return "{\"App\":\"Demo-2\", \"Framework\": \"Spring boot 3.3.1\" }";
	}
}
```

4. Right click > Run As > Spring Boot Application

5. Using web browser, visit http://localhost:8080