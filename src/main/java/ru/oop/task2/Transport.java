package ru.oop.task2;

/**
 * Транспорт с возможностью передвижения
 */
public interface Transport extends Positioned{

    /**
     * Передвижение транспорта в определённую позицию
     */
    void go(Person person, Position destination);
}
