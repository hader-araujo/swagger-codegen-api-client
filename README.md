# Generating API Client using swagger-codegen-maven-plugin

This repository contains an example of using swagger-codegen-maven-plugin to generate the [FeignClient](https://cloud.spring.io/spring-cloud-netflix/multi/multi_spring-cloud-feign.html).

Overview
============================
In this example, the models and the FeignClient interfaces are being generated.
The API's interface that the FeignClient extends have the [Swagger documentation](https://swagger.io/docs).

Usage
============================

Add to your `build->plugins` section (default phase is `generate-sources` phase)
```xml
<plugin>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-codegen-maven-plugin</artifactId>
    <version>2.4.7</version>
    <executions>
        <execution>
            <goals>
                <goal>generate</goal>
            </goals>
            <configuration>
                <inputSpec>http://petstore.swagger.io/v2/swagger.json</inputSpec>
                <language>spring</language>
                <configOptions>
                   <sourceFolder>src/main/java</sourceFolder>
                </configOptions>
            </configuration>
          <library>spring-cloud</library>
        </execution>
    </executions>
</plugin>
```

### API Source
This is an example of generating an API client of an OpenAPI contract.
In this case, the [Swagger Petstore](http://petstore.swagger.io/v2/swagger.json) json contract is being used.
If you need to generate an API server from an OpenAPI, see the [swagger-codegen-api-server project](https://github.com/hader-araujo/swagger-codegen-api-server)

### Tool to generate the API
The Maven plugin called [swagger-codegen-maven-plugin](https://github.com/swagger-api/swagger-codegen/tree/master/modules/swagger-codegen-maven-plugin) is being used.

### Ignore files to be generated
If you need to ignore files that need to not be generated/updated, you can:
 - Use the configuration parameter `<ignoreFileOverride>FILE PATH HERE</ignoreFileOverride>` or 
 - Add they on the `.swagger-codegen-ignore` file on the root of the project.

### How to run
After cloning the project, the models and controllers can be generated using this command:
```sh
mvn clean compile
```

### Configuration parameters that are being used
See more parameters that can be used in [swagger-codegen-maven-plugin configuration](https://github.com/swagger-api/swagger-codegen/tree/master/modules/swagger-codegen-maven-plugin#general-configuration-parameters)

