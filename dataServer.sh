#slice2java --output-dir generated interfaces/Printer.ice
#compile Server
javac -d classes -classpath classes:lib/ice-3.7.0.jar:lib/sqlite-jdbc-3.21.0.jar:lib/mp3agic-0.8.1.jar server/Server.java PrinterI.java generated/Demo/*.java
#compile Client
#javac -d classes -classpath classes:lib/ice-3.7.0.jar:lib/sqlite-jdbc-3.21.0.jar:lib/mp3agic-0.8.1.jar client/Client.java PrinterI.java generated/Demo/*.java
#classpath
export CLASSPATH=$CALSSPATH:./classes:./lib/ice-3.7.0.jar:./lib/sqlite-jdbc-3.21.0.jar:./lib/mp3agic-0.8.1.jar
#gnome-terminal -x sh -c  "sleep 3;  java Client;sleep 10";

java Server
#gnome-terminal -e 

