package net.bhas.shoppingbackend1.dao;

import java.util.List;

import net.bhas.shoppingbackend1.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
	Category get(int id);

}
