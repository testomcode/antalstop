# How to run

Build application from root dir by running

```mvn clean install```

Executable jar (antalstop-0.0.1-SNAPSHOT.jar) is created in target directory.

To be able to fetch data from trafiklab.se you need an api key.

Run command 

```java -jar antalstop-0.0.1-SNAPSHOT.jar --api.key=[YOUR_API_KEY]```

The api key could be specified in the application.properties file located in the /src/main/resources directory
instead of in the java -jar command. (api.key: [CHANGE_ME])

In a browser go to 

```localhost:8080/index```

