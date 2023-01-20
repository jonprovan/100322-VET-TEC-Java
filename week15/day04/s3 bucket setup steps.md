# S3 Setup
---------
## Create Bucket
1. bucket name unique
(this will be in the url
so make it pretty!)
2. AWS Region make sure it's us-east-1 (if using skillstorm account)
3. ACL disabled
4. Block all public access (uncheck this and hit agree)
5. Bucket Versioning off
6. tag
key: name
value: erica-hicks
(just labeling this  bucket as mine)
7. encryption off
8. advanced settings object lock you can leave disabled

-------------
## Upload Files
1. drag and drop to upload
- click upload
- go back to s3 instances page to find the properties and permissions tabs

## Set Properties
2. set properties
- all the way at the bottom is the static website option which needs to be enabled
- Host a static website (don't click redirect)
- Whatever html file you want the website to default to
- You can also have an error.html page that will show when 404 page not found etc.

## Set Permissions
3. set permissions
```
{
    "Version": "2012-10-17",
    "Statement": [
        {
            "Sid": "Statement1",
            "Effect": "Allow",
            "Principal": "*",
            "Action": "s3:GetObject",
            "Resource": "arn:aws:s3:::ericas-test-frontend/*"
        }
    ]
}

```
----------------
## Angular Project

```
ng build --configuration=production
```

- if you put your aws ec2 url in the environment.prod.ts file

- drag the files from the dist folder to your s3 bucket









