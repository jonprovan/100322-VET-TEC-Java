# Steps for Creating an EC2 Instance

## EC2 = Elastic Compute Cloud

- IaaS = Infrastructure as a service
   - This gives us more fine grained control over setting up the virtual machine like picking the operating system
   - Example: AWS EC2 

- PaaS = Platform as a Service
   - This  give you more control than SaaS, it is what you can use to put your proj 3 backend appliation on AWS cloud
   - an abstraction over having to set up a virtual machine yourself
   - Example: Elastic Beanstalk (AWS service we will use later this week) or 

- SaaS = Software as a Service
   - something like Gmail so it solves one of your business needs without needing much setup/configuration from you



## Getting Started in AWS

- https://skillstorm.awsapps.com/start#/ and login
VALERIE'S TROUBLESHOOTING
- Make user you are using us-e-1 bc our Skillstorm accounts are restricted to it
- Make sure you use t3.micro
----------------------------------------------------------------------------------
- Go under Nexgen Java Management Console
- Search for EC2 and we are going to select Launch Instance
- Add unique name
- Keep default OS (Amazon Linux)
- Instance Type we will NEEDS TO BE t3.micro you can also use t3.small and t3.medium (limitations on the accounts set up)
- Generate a key-pair (RSA, .pem) DO NOT PUT THIS ON GITHUB
    NOTE: TODO get access to SkillStorm account to create key-pairs, 
- Security Groups (use unique name)
    1. ssh use MyIP (NOT 0.0.0.0 bc that would give everyone ssh access to your virtual machine)
    2. custom tcp (port 8080 and CIDR 0.0.0.0/0 give everyone http access)\
- Tenancy (under Advanced - select Shared instance)


## Launching EC2 instance and Spring Boot Project
- launch instance
- ssh to connect to it for the first time, you can use 
     pwd
  to look at the working directory
- in your project, run a maven clean install
- move the .jar to a folder with the key you will need to ssh in to your ec2 instance
    scp ...
- install a jre on the ec2
   1. ssh into the ec2 instance
   2. install java version 1.8
        sudo yum install java-1.8.0-openjdk
        (check it worked by doing java -version)
- start up your spring boot project using 
    java -jar demo.jar