package org.innopolis.kuzymvas.unicomparable.hashmap;

import org.innopolis.kuzymvas.unicomparable.datastructures.KeyValuePair;
import org.innopolis.kuzymvas.exceptions.KeyNotPresentException;
import org.innopolis.kuzymvas.unicomparable.UniComparable;

public interface HashMap {

    /**
     * Помещает в хранилище пару ключ-значение. В случае, если ключ уже находится на хранение, заменяет его значение на заданное в аргументе.
     *
     * @param key   - ключ для добавления
     * @param value - значение для добавления
     */
    void put(UniComparable key, Object value);

    /**
     * Заменяет значение у указанного ключа на заданное. Бросает исключение при отсуствии заданного ключа в хранилище
     *
     * @param key   - ключ, для которого выполняется замена
     * @param value - значение, на которое следует заменить текущее
     * @throws KeyNotPresentException - выбрасывается при отсутствии ключа в хранилище
     */
    void replace(UniComparable key, Object value) throws KeyNotPresentException;

    /**
     * Возвращает значение, связанное с указанным ключем. Бросает исключение при отсуствии заданного ключа в хранилище
     *
     * @param key - ключ, для которого следует вернуть значение
     * @return - значение, связанное с заданным ключем
     * @throws KeyNotPresentException - выбрасывается при отсутствии заданного ключа в хранилище
     */
    Object get(UniComparable key) throws KeyNotPresentException;

    /**
     * Удаляет пару ключ-значение с заданным ключем из хранилища. Бросает исключение при отсуствии заданного ключа в хранилище
     *
     * @param key - ключ, который определяет удаляемую пару
     * @return - значение, связанное с удаленным ключем
     * @throws KeyNotPresentException - выбрасывается при отсутствии заданного ключа в хранилище
     */
    Object remove(UniComparable key) throws KeyNotPresentException;

    /**
     * Проверяет наличие заданного ключа в хранилище
     *
     * @param key - проверяемый ключ
     * @return - true, если ключ найден в хранилище, false - в противном случае
     */
    boolean containsKey(UniComparable key);

    /**
     * Проверяет наличие заданной пары ключ-значение в хранилище
     *
     * @param pair - проверяемая пара
     * @return - true, если пара найдена в хранилище, false - в противном случае
     */
    boolean containsPair(KeyValuePair pair);

    /**
     * Возвращает количество пар ключ-значение, находящихся в хранилище
     *
     * @return - количество пар ключ-значение.
     */
    int size();
}
