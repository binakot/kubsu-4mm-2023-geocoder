package ru.kubsu.geocoder.dto;

/**
 * Ошибка.
 *
 * @param status Статус
 * @param error  Ошибка
 * @param path   Путь
 */
public record RestApiError(
    Integer status,
    String error,
    String path
) {
    public RestApiError() {
        this(0, "", "");
    }
}
