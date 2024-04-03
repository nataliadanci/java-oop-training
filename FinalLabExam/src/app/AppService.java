package app;

import java.util.List;

public interface AppService<T> {

    T create(T object);
    List<T> search(String value);
    boolean delete(T object);
}
