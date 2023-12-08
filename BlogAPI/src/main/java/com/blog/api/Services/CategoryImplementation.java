package com.blog.api.Services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.api.Entity.Category;
import com.blog.api.Exception.ConfigDataResourceNotFoundException;
import com.blog.api.Payloads.CategoryDTO;
import com.blog.api.Repositorys.CategoryReposity;
@Service
public class CategoryImplementation  implements CategoryService{
@Autowired
private CategoryReposity categoryReposity;
@Autowired 
private ModelMapper mapper;

	
	@Override
	public CategoryDTO createCategoryDTO(CategoryDTO categoryDTO) {
		categoryReposity.save(mapper.map(categoryDTO, Category.class));
		return categoryDTO;
	}

	@Override
	public CategoryDTO updateCategoryDTO(CategoryDTO categoryDTO, Integer CategoryID) {
	CategoryDTO categoryDTO2=getCategoryDTOByID(CategoryID);
	Category category=mapper.map(categoryDTO2, Category.class);
	category.setTitle(categoryDTO.getTitle());
	category.setDescription(categoryDTO.getDescription());
    categoryReposity.save(category);
    return categoryDTO;
	}

	@Override
	public void Delete(Integer categoryID) {
		CategoryDTO categoryDTO=getCategoryDTOByID(categoryID);
		categoryReposity.delete(mapper.map(categoryDTO, Category.class));
		
	}

	@Override
	public CategoryDTO getCategoryDTOByID(Integer categoryID) {
		Category categoryDTO=null;
	try {
	categoryDTO=categoryReposity.findById(categoryID).orElseThrow(()->new ConfigDataResourceNotFoundException("Category","ID",categoryID));
	} catch (ConfigDataResourceNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return mapper.map(categoryDTO, CategoryDTO.class);
	}

}
