# Домашнее задание к занятию «2.3. Patterns» (Задача №1)

![Java CI with Gradle](https://github.com/buslaevamariya11-dotcom/homework-patterns-delivery/actions/workflows/gradle.yml/badge.svg)

## Описание проекта

Автоматизация тестирования формы заказа доставки карты. Проект включает в себя:

* Генерацию случайных данных с помощью **Java Faker**;
* Использование паттерна **Data Generator**;
* Тестирование функционала перепланирования даты встречи;
* Настройку **CI (Continuous Integration)** через GitHub Actions.

## Инструкция по запуску

1. Склонируйте репозиторий:
   `git clone https://github.com/buslaevamariya11-dotcom/homework-patterns-delivery`
2. Перейдите в папку проекта.
3. Убедитесь, что в `artifacts/` лежит файл `app-replan-delivery.jar`.
4. Запустите приложение (SUT):
   `java -jar artifacts/app-replan-delivery.jar`
5. В другом окне терминала запустите тесты:
   `./gradlew test`