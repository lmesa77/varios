package com.lwy.varios;

/**
 *
 * @author LWY
 * @param <T>
 */
public abstract class Criterio<T> {

    public abstract int Comparar(T t1, T t2);
}
