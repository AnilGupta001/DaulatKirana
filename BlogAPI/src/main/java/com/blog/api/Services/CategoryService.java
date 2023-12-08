package com.blog.api.Services;

import com.blog.api.Payloads.CategoryDTO;

public interface CategoryService {
CategoryDTO createCategoryDTO(CategoryDTO categoryDTO);
CategoryDTO updateCategoryDTO(CategoryDTO categoryDTO,Integer CategoryID);
void Delete(Integer categoryID);
CategoryDTO getCategoryDTOByID(Integer categoryID);

}
