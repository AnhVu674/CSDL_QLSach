package Controller;

import java.util.ArrayList;

public interface DAO_Interface <T> {
public int insert(T t);
public int upDate(T t);
public int delete(T t);
public ArrayList<T> selectAll();
public T selectByID(T t);
public ArrayList<T> selectCondition(String condition);
}
