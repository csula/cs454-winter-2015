# Mavenu Tutorial

1. Download maven from apache
2. Set your `JAVA_HOME` path if you have not already done it
3. Create a application folder:

```
mvn archetype:generate \
   -DgroupId=edu.calstatela.cs454.instructor.crawler \
   -DartifactId=crawler-app \
   -DarchetypeArtifactId=maven-archetype-quickstart \
   -DinteractiveMode=false
```

