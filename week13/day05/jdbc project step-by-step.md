# Step By Step JDBC

1. Create a new maven project

2. Edit your POM to include the following ~inside~ the <project> tag

```
<properties>
		<maven.compiler.target>1.8</maven.compiler.target>
		<maven.compiler.source>1.8</maven.compiler.source>
</properties>

<dependencies>
		<dependency>
			<groupId>com.mysql</groupId>
			<artifactId>mysql-connector-j</artifactId>
			<version>8.0.31</version>
		</dependency>
</dependencies>
```

Save your POM. And right click the POM, go to Maven>Update Project
to make sure the dependencies are downloaded and the project switches to Java version 1.8

3. Create an application.properties file inside of src/main/resources
with key value pairs including your db credentials:
``` 
db.url=db.url=jdbc:mysql://localhost:3306/sales 
#make sure you have the protocol:host:port/schema
db.user=root
db.password=root
#use your password not mine!
```

4. Create a Config class with your get properties code.

```
class Config {
 static private Config config; // only one instance of this class ever exists
 private Config() { 
 public Properites getProperties() {
   try (InputStream input = InventoryDAO.class.getClassLoader()
      .getResourceAsStream("application.properties")) {
	Properties props = new Properties(); // from java.util.Properties makes    grabbing the key-value pairs easy
	props.load(input);
	return props;
   } catch (IOException e) {
	e.printStackTrace();
	return null;
   }
 }
 public Config getInstance() {
   if (config == null)
      this.config = new Config();
   return this.config;
 }
}
```

5. DAO class for each table you want to access. It should have the methods:
```
findAll()
findById(int id)
save(T entity)
update(T entity)
delete(int id) or delete(T entity)
```

6. Write each method to create a connection and run a query.

To create a connection:
Load the driver once per class. (static block at the top of your code)

Get the properties from your config class once per class. (static variable)

```
static Config config = Config.getInstance();
static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
```

Inside each method, create the connection using the DriverManager and props.












