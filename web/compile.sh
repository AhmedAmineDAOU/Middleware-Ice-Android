javac  -d WEB-INF/classes pack/*.java
jar cvf ws.war WEB-INF/*
asadmin deploy --force ws.war
#firefox 10.120.14.137:8080/ws/analyse
