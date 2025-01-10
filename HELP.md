### **Debian**

podman build -f Dockerfile -t podman-java-jar:latest
podman run --name spring_rest -dt -p 8080:8080/tcp podman-java-jar:latest

### **Windows**

docker build -f Dockerfile -t podman-java-jar:latest .
docker run --name spring_rest -dt -p 8080:8080/tcp podman-java-jar:latest

docker run --name spring_rest -dt -p 8080:8080/tcp avrylkov/podman-java-jar:latest

### **Test**

http://localhost:8080/info