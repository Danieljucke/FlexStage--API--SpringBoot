# FlexStage API — Spring Boot

> Historical / Academic Project — not recently verified

A Spring Boot prototype for FlexStage room and service data. It contains REST
controllers and JPA entities for rooms, room categories, services, and cities.

## Technology

- Java 17
- Spring Boot 2.7.4 and Spring Data JPA
- MySQL, MariaDB, and SQL Server drivers
- Experimental Spring Native tooling
- Maven Wrapper

## Run locally

Review `src/main/resources/application.properties` and provide only local
database settings. Then run `./mvnw spring-boot:run` or, on Windows,
`mvnw.cmd spring-boot:run`. The available context test can be run with
`./mvnw test`.

The build and database integrations have not been recently verified. The
experimental native-image dependencies are from the Spring Boot 2.x era and may
require the original toolchain.

## License

No root license file is present. No license is selected by this documentation.
