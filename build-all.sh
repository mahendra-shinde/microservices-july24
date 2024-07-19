echo "Build all"
mvn package -DskipTests -f demo-3
mvn package -DskipTests -f demo-4
mvn package -DskipTests -f demo-5
mvn package -DskipTests -f discovery-server
mvn package -DskipTests -f config-server
mvn package -DskipTests -f gateway

