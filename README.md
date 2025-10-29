# Cookiecutter Simple Skeleton Service

A clean, minimal **Spring Boot Java service** template powered by [Cookiecutter](https://cookiecutter.readthedocs.io/en/latest/) and optionally [Cruft](https://cruft.github.io/cruft/).

This template generates a Java Maven service with:
- Predefined folder structure
- Automatic CamelCase conversion for class names
- Default environment configs (`application.yml`, `application-local.yml`)
- A starter service and config class

---

## 🧩 Features

- Converts hyphenated names to **CamelCase**
  - e.g. `simple-skeleton-service` → `SimpleSkeletonService`
- Organized package structure under `com.harpreetsaund.<projectname>`
- Includes `eclipse-java-style.xml` for consistent formatting
- Supports **Cruft** for version tracking and updates

---

## 🚀 Usage

```bash
cruft create https://github.com/saundharpreet/cookiecutter-simple-skeleton-service.git
```
