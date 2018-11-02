spring cloud 父工程，起到版本控制作用
   -- eureka-server 子工程 服务注册中心 
   	  port: 8761
   	  defaultZone: http://localhost:8761/eureka/
   -- service-hi 子工程 服务提供者
      port: 8766