#MYSQL container instantiate

#Without expose

sudo docker run --name mysql-docker -e MYSQL_ROOT_PASSWORD=suti1234 -e MYSQL_DATABASE=demodb -e MYSQL_USER=suti -e MYSQL_PASSWORD=suti1234 -d mysql:5.6

#With expose

sudo docker run --name mysql-docker -e MYSQL_ROOT_PASSWORD=suti1234 -e MYSQL_DATABASE=demodb -e MYSQL_USER=suti -e MYSQL_PASSWORD=suti1234 -p 3307:3306 -d mysql:5.6

#Build JAR

mvn clean package

#Build image

docker build -t spring-jpa .

#Run container

#in non detached mode

sudo docker run -p 8081:8081 --link=mysql-docker spring-jpa

#in detached mode

sudo docker run -p 8081:8081 --link=mysql-docker -d spring-jpa

#add user
#POST mapping ("/users")

RequestBody
{"name": "Suti","age": 22}

#get all users
#GET mapping ("/users)
