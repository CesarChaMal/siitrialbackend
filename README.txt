Sii trial project for Adolfo Ruiz Rivas

To launch 

mvn install 
mvn spring-boot:run


This will launch in 8080 port 
The url to access is the next:

http://localhost:8080/trades?type=forward&name=testing

1)Every class in rules package represents a bussines rule, making easy to implement new rules for every product or accross products
2)A abstract factory pattern was used in order to create a
  different class according to the type variable.
3)All testing is made in test package
4)An family of products derives from Product.java, making easy to include and validate a different new products.
5)The project uses Spring boot making the configuration simple and launching the server like a java app.



