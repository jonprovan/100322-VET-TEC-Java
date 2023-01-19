# TODO:
--------
## Locally
1) Fixed the controller CORS to *
2) Fixed the db url to our AWS RDS
       Grab endpoint from AWS
       put in application.properties
3) Build the jar on EC2

## AWS EC2 Management Portal
4) Build an EC2 and add security rules
- need ssh access for my ip
- need custom TCP 8080 access for everyone
- need Aurora MySQL 3306 access for the RDS)
5) You can let AWS generate the security group rules for:
    - EC2 -> RDS
    - RDS -> EC2

## Locally
5) ssh into the EC2 to install java
    ```sudo yum install java-1.8.0-openjdk ```
   ``` exit ```

6) scp to put the jar onto the ec2
    ``` scp -i "ec2-key.pem" myapp.jar ec2-user@ec2-public-dns:/home/ec2-user ```

7) ssh in to run the jar
    ```java -jar myapp.jar```
  (Note: if you close the terminal, the process ends)
8) Try in postman or your browser to connect to the ec2:8080/hello

### To Run the Process in the Background
9) If you want to run still when you close your ssh session
     ```nohup java -jar myapp.jar &```
where & means run in background and nohup means run in background even after log out
          OR (shortcut) 
    ```java -jar myapp.jar ```
    hit `CTRL-Z` (makes it run in background)

- To kill the background process
    ```ps -ef | grep java```
    process state to find the pid then
    ```sudo kill 123456``` (where 123456 is whatever pid-you-found)
        OR 
    ```top```
    shows the processes with the most recent on top (yours!)
    ```sudo kill 123456``` (replace with whatever the pid was)

