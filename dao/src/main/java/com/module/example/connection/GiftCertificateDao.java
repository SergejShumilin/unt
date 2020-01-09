package com.module.example.connection;

public interface GiftCertificateDao<T> extends Dao<T>  {
    void update(T t);
}
