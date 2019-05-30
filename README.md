spring-cloud狂欢大礼包
````
eureka-server   //eureka 提供服务发现框架

````

```
config-server   //提供注册中心服务

```

```
dashboard-server //hystrix dashboard
访问：http://localhost:9003/hystrix
url: http://localhost:9001/hystrix.stream

```

```
turbine-service //turbine监控
访问：http://localhost:9004/hystrix
url： http://localhost:9004/turbine.stream 
```

```
  zipkin
  
  springboot2后，使用EnableZipkinServer创建自定义的zipkin服务器已经被废弃
  新的使用方法：      
If you have Java 8 or higher installed, the quickest way to get started is to fetch the latest release as a self-contained executable jar:

curl -sSL https://zipkin.apache.org/quickstart.sh | bash -s
java -jar zipkin.jar

http://127.0.0.1:9411/zipkin
 
```