# The Resident Zombie

## System dependencies

The application was developed using the following tools. Other versions might work, but weren't tested:
- OpenJDK 11
- PostgreSQL 12
- Docker (recommended)

## Docker

```sh
$  docker-compose up -d
```

## Flyway Migrate

```sh
$  gradle flywayMigrate
```