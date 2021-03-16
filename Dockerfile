FROM java:8
ADD target/*.jar /test-eureka-master.jar
ENTRYPOINT ["java", "-jar", "/test-eureka-master.jar"]