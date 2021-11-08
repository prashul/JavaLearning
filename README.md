# SpringBoot reading YAML configuration Files

A yaml fie is to store element configuration. Generally the properties are stored in property file for example

Property File
app.name=hello
app.description=Welcome to {app.name}



db.connection=String_URL
dbhost=127.0.0.1
db.port=1200


Data is stored in the flat format, whereas in the YAML files data is stored in hierarchy fashion, less redundancy and easy to read

Application YAML file
app:
  name: My app
  description: Welcome to {app.name}

my:
  greeting: Hello World
  list:
    values: One, Two, Three

db:
  connection: "String"
  host: 127.0.0.1
  port: 1200

hello: world


There are two approaches to read the YAML configuration
1) @ConfigurationProperties("db") 
2) @Value("${app.name}")
