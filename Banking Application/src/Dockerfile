FROM mysql:latest

ENV MYSQL_ROOT_PASSWORD=root

COPY ./testsql.sql /docker-entrypoint-initdb.d/

EXPOSE 3306

##docker build -t mysql_db . to build mysql image
##docker run mysql_db
##docker exec -it <ContainerID> bash
##mysql -p<passwrd>
##show databases ->use test -> select * from testdb

## use port 3306:3306, port must be present  
##docker run -p 3306:3306 --name mysql1 -e MYSQL_ROOT_PASSWORD=root -d mysql --default-authentication-plugin=mysql_native_password -h 127.0.0.1