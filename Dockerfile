FROM java:8
ADD target/*.jar /test-eureka-master.jar
ENTRYPOINT ["java", "-jar", "/test-eureka-master.jar", "-Dapollo.configService=apollo-service-pro-apollo-configservice.apollo:8080 -Denv=PRO -Dapollo.cluster=pro"]