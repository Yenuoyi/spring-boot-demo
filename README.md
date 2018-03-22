# spring-boot-demo
本demo使用多数据源配置整合mybatis，spring session整合redis共享session，使用前请在application.properties文件下配置数据源。



注意：

     如不想使用spring session+redis，请在application.properties下删除redis配置，同时删除com.example.demp.session包即可！
     
     如不想使用多数据源请另行百度，这里不继续具体更改。
     
     运行前请先执行china.sql文件，这是主数据源文件，从数据源请自行根据UserBean.java创建。
     
     dbpool包下为数据源配置
     
     增加了JPA操作，dao.master.countyRepository.java就是JPA操作块，仅供参考。
     
     增加thymeleaf操作静态html页面，可进行参数注入，仅限访问
     http://localhost:8080/message
     其他地址为jsp地址，如需访问jsp地址，请删除pom.xml文件中thymeleaf包
