podman build -f Dockerfile -t podman-java-jar:latest

podman run --name spring_rest -dt -p 8080:8080/tcp podman-java-jar:latest