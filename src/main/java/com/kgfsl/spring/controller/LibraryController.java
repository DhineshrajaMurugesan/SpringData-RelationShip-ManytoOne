package com.kgfsl.spring.controller;

//
import java.util.List;

import com.kgfsl.spring.model.Department;
import com.kgfsl.spring.model.Employee;
import com.kgfsl.spring.repository.*;

//import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;





/**
 * StudentController

 */
@RestController
 
@RequestMapping("/library")
public class LibraryController{
    @Autowired
    LibraryRepository libraryRepository;

	@RequestMapping(method = RequestMethod.GET)
  public List<Department> findDepartment() {
    // System.out.println("??????????????????"+studentRepository.findAll());
    return libraryRepository.findAll();
  }
  
  @RequestMapping(value = "/{id}",method = RequestMethod.GET)
  public Department findone(@PathVariable Long id) {
    return  libraryRepository.findOne(id);
  }
  
  @RequestMapping(method = RequestMethod.POST)
  public Department addDepartment(@RequestBody Department department) {
	  //department.setId(null);
    return libraryRepository.saveAndFlush(department);
  }
  
  @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
  public Department updateDepartment(@RequestBody Department updatedStudent, @PathVariable Long id) {
    updatedStudent.setId(id);
    return libraryRepository.saveAndFlush(updatedStudent);
  }
  
  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
  public void deleteDepartment(@PathVariable Long id) {
    libraryRepository.delete(id);
}

// public Student saveAndFlush(Student student1, Object object) {
// 	return null;
// }

}