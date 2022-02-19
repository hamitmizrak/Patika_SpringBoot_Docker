# Getting Started

### Reference Documentation

GitHub Linki

* [GitHub Linki](https://github.com/hamitmizrak/Patika_SpringBoot_Docker)
* [H2 console](http://localhost:8081/h2-console/l)
* [Swagger](http//localhost:8081/swagger-ui.html)



```sh

1.ADIM
$     ./mvnw clean package -DskipTests


2.ADIM
$    docker-compose up
$    docker ps


3.ADIM
POSTMAN

//EKLEME
http://localhost:8080/docker/v1/create/product


//LISTELE
http://localhost:8080/docker/v1/list/product


//FIND
http://localhost:8080/docker/v1/find/product/1



//DELETE
http://localhost:8080/docker/v1/delete/product/1


4.ADIM
$    docker exec -it spring_docker_postgresqldb_1 psql -U postgres studentdb


5.ADIM
$    studentdb=#  \dt ==> Tabloları göstermek
$    studentdb=#  select * from product
$    studentdb=#  \q ==> ÇIKIŞ

```


	





