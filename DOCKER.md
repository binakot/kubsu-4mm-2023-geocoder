https://hub.docker.com/_/postgres

```bash
$ docker run \
    --name geocoder-postgres \
    -e POSTGRES_PASSWORD=geocoder \
    -d postgres:15

$ docker exec -it geocoder-postgres /bin/bash
```

```bash
$ ./gradlew bootJar
$ docker build --build-arg JAR_FILE="./build/libs/geocoder-0.0.1-SNAPSHOT.jar" -t geocoder:latest .
$ docker compose up -d
```
