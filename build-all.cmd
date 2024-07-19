echo "Build all"
start mvn package -DskipTests -f demo-3
start mvn package -DskipTests -f demo-4
start mvn package -DskipTests -f demo-5
start mvn package -DskipTests -f discovery-server
start mvn package -DskipTests -f config-server
start mvn package -DskipTests -f gateway

