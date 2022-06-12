
# EarCommerce

A Ecommerce application we help user to buy perfect earring on choice.We have collection of many earring available jo chooses and buy it ! 
## Tech Stack We Used

 - [Java]()
 - [JSP]()
 - [Servelet]()
  - [Hibernate]()
 - [Html]()
 - [CSS]()
  - [Java]()
 - [Bootstrap]()
 - [MySql]()


## Authors

- [@nishant](https://github.com/nishu9162306344)



## Roadmap

- hibernate-configuration
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE hibernate-configuration PUBLIC 
  "-//Hibernate/Hibernate Configuration DTD 3.0//EN" 
  "http://www.hibernate.org/dtd/hibernate-configuration-3.0.dtd">
<!-- Version 8 MySQL hiberante-cfg.xml example for Hibernate 5 -->
<hibernate-configuration>
  <session-factory>
    <property name="connection.driver_class">com.mysql.cj.jdbc.Driver</property>
    <!-- property name="connection.driver_class">com.mysql.jdbc.Driver</property -->
    <property name="connection.url">jdbc:mysql://localhost/ercommerce</property>
    <property name="dialect">org.hibernate.dialect.MySQL8Dialect</property>
    <property name="connection.username">root</property>
    <property name="connection.password">root</property>
   
    <property name="show_sql">true</property>
    <property name="format_sql">true</property>
    <property name="hbm2ddl.auto">update</property>
 
  </session-factory>
</hibernate-configuration>
