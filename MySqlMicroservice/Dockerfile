# Derived from official mysql image (our base image)
#https://medium.com/@lvthillo/customize-your-mysql-database-in-docker-723ffd59d8fb

#https://medium.com/@salisuwy/building-a-spring-boot-rest-api-part-iii-integrating-mysql-database-and-jpa-81391404046a
#https://medium.com/coderscorner/connecting-to-mysql-through-docker-997aa2c090cc

#https://www.youtube.com/watch?v=w_aVnMmrASE
FROM mysql:latest
ENV MYSQL_ROOT_PASSWORD MySql@123
ENV MYSQL_DATABASE restapi
ENV MYSQL_USER kp
ENV MYSQL_PASSWORD kp@123
ADD createsql.sql /docker-entrypoint-initdb.d
EXPOSE 3306
# Add a database
#ENV MYSQL_DATABASE restapi
# Add the content of the sql-scripts/ directory to your image
# All scripts in docker-entrypoint-initdb.d/ are automatically
# executed during container startup
#COPY ./sql-scripts/ /docker-entrypoint-initdb.d/