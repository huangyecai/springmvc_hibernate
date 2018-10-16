# springmvc_hibernate

spring 3.2.18.RELEASE
hibernate 3.6.10.Final
JDK 1.6
Tomcat 7
Maven 3.2.1

# 传值乱码问题
	页面设置为utf-8
	form 为 post
	数据库对应的utf8捉着utf8mb4
	web.xml添加编码过滤器
# hql
	DELETE FROM User WHERE id = "+entity.getId()
	此处 User为类名，hql 会根据类名去查找映射
#整合jbpm4.4
	添加相应的jar
#将jbpm4.4的jar交给maven管理