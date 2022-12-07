package com.nttdata.dao;

import java.util.List;

public interface CommonDAO<T> {

	void insert(T paramT);

	List<T> searchAll();

	T searchById(Long id);

	void delete(T paramT);

	void update(T paramT);

}
