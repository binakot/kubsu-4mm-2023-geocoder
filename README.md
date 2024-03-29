# Кеширующий сервис геокодирования

Практическая работа
спецкурса лекций "Технологии программирования"
4 курса специальности 4ММ
кафедры математического моделирования
Кубанского государственного университета.

## Стек

* Java 17
* Spring Boot
* PostgreSQL
* Docker
* GitHub CI

---

## Сборка

```bash
$ ./gradlew clean build test check
```

---

## Локальный запуск

Предварительно требуется запустить `PostgreSQL` базу данных:

```bash
$ docker run \
    --name geocoder-postgres \
    -e POSTGRES_PASSWORD=geocoder \
    -d postgres:15
```

Далее запускаем приложение:

```bash
$ ./gradlew bootRun
```

---

## Запуск через Docker Compose

Собираем `Docker` образ и запускаем стек приложений через `Docker Compose`:

```bash
$ docker build -t geocoder:latest .
$ docker compose up -d
```
