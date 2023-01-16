# Steps for Creating an EC2 Instance

EC2 = Elastic Compute Cloud

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
- Go under Nexgen Java Management Console
- Search for EC2 and we are going to select Launch Instance
---------------------------------------------------------------------------------
VALERIE'S TROUBLESHOOTING
- Make user you are using us-east as the location (listed next to your name in the top right corner of the managment console) bc our Skillstorm accounts are restricted to it
- Make sure you use t3.micro (your accounts are restricted from using larger more expensive cpu options)
----------------------------------------------------------------------------------
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
- ssh to connect to it for the first time, from the directory with your .pem file in it
    ssh -i "ec2-key.pem" ec2-user@ec2-3-whatever-yours-is.compute-1.amazonaws.com
  To look at the working directory, you can use 
     pwd
- In Spring Tool Suite right click on your project's POM.xml and Run As> maven install (or run a maven clean install)
- move the .jar from the project's target folder to a folder with the key you will need to ssh in to your ec2 instance
- from the directory with the key and jar run the command to copy the jar from your computer to the ec2 instance (and put it in the home/ec2-user directory)
    scp -i "ec2-key.pem" demo.jar ec2-user@your-url-here.compute-1.amazonaws.com:/home/ec2-user
- now you can ssh back into the ec2 instance with the same ssh command from  before
- check that the .jar file was copied over by running the command 
     ls
- to run the jar, we need a jre installed
   to install a jre on the ec2
   1. ssh into the ec2 instance if you aren't already
   2. install java version 1.8
        sudo yum install java-1.8.0-openjdk
        (check it worked by doing running
         java -version
        )
- start up your spring boot project using 
    java -jar demo.jar
- in a browser, type in
   your-url-here.compute-1.amazonaws.com:8080 (or whatever port you set up yours to run on)
   (to get the url you can go to your ec2 instances in your aws managment console, and it will show the public dns in the information section)