javac  -d web/WEB-INF/classes web/pack/*.java
cd web
jar cvf ws.war WEB-INF/*
asadmin deploy --force ws.war
#firefox 10.120.14.137:8080/ws/analyse
