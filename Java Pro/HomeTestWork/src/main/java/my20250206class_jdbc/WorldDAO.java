package my20250206class_jdbc;

import java.util.List;
import java.util.Optional;

public interface WorldDAO<T, Id> {
    List<T> getAll();
    Optional<T> getById(Id id);
    void add(T data);
    void update(T data);
    void delete(T data);
}
