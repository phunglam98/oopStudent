package Manager;

public interface IManager<T>{
    void add(T e);
    void delete(int id);
    void edit(int id, T t);
    T[] findAll();

    boolean checkId(int id);
}
