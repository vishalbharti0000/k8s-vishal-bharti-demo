FROM openjdk:17
EXPOSE 9000
ARG jarfile=target/k8s-vishal-bharti-demo.jar
ADD ${jarfile} k8s-vishal-bharti-demo.jar
ENTRYPOINT ["java","-jar","/k8s-vishal-bharti-demo.jar"]