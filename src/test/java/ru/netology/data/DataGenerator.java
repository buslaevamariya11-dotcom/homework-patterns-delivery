package ru.netology.data;

import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DataGenerator {
    private DataGenerator() {
    }

    // Генерирует дату: текущая + количество дней
    public static String generateDate(int addDays) {
        return LocalDate.now().plusDays(addDays).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }

    public static UserInfo generateUser(String locale) {
        var faker = new Faker(new Locale(locale));
        return new UserInfo(
                faker.address().city(),
                // Генерируем ФИО и сразу убираем букву ё/Ё для стабильности
                (faker.name().lastName() + " " + faker.name().firstName()).replace("ё", "е").replace("Ё", "Е"),
                faker.phoneNumber().phoneNumber()
        );
    }
}
