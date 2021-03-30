# tg-connector-sdk

Basic structure of SDK with OZONE API specs integrated. 
This SDK can be inherited in other BOBF connectors.
Service endpoints are abstracted and not visible to connectors.
Ozone DTO and model classes are defined in the SDK.
Exception handing and error messages are standardized. (further enhancement required)
Logging standardized. (further enhancement required)


# Features

- Java 14
- Spring Boot (version: 2.3.3)
- Spring Cloud Kubernetes (version: Hoxton.SR8)
- Open Feign (Declarative REST Clients)
- Hystrix Commands (for circuit breakers)
- Sleuth (for distributed tracing)


# Build and Test

JDK 8+ (ideally 14) installed.  Repo contains the Gradle wrappers. 

Command to build from project home directory

```
./gradlew clean build
```

# Usage

Include jitpack in your repository
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
Add your dependency as
```
	dependencies {
	        implementation 'com.github.harishankara:tg-connector-sdk:v1.0.1'
	}
```
Making your spring boot application (bobf-connector-****) to include required componets from the SDK jar 

```
@SpringBootApplication
@ComponentScan({"tg.connector.sdk","net.tarabutgateway.bobf"})
```

