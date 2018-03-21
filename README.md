# spring-boot-demo
本demo使用多数据源配置整合mybatis，spring session整合redis共享session，使用前请在application.properties文件下配置数据源。



注意：

     如不想使用spring session+redis，请在application.properties下删除redis配置，同时删除com.example.demp.session包即可！
     
     如不想使用多数据源请另行百度，这里不继续具体更改。
     
     运行前请先执行china.sql文件，这是主数据源文件，从数据源请自行根据UserBean.java创建。
     
     dbpool包下为数据源配置
