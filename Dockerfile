FROM java:8
ADD target/*.jar /test-eureka-master.jar
ENTRYPOINT ["java", "-jar", "/test-eureka-master.jar", "-Dapollo.configService=http://207.246.106.156:31913 -Denv=DEV -Dapollo.cluster=local"]