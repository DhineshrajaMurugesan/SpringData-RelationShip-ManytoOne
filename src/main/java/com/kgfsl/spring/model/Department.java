package com.kgfsl.spring.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author imssbora
 */
@Entity
@Table(name = "DEPARTMENT")
public class Department {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "DPT_ID")
   private long id;

   @Column(name = "NAME", nullable = false, unique = true)
   private String name;

   @OneToMany(cascade = CascadeType.ALL, mappedBy = "department")
   private List<Employee> employees = new ArrayList<Employee>();
 /**
  * @return the id
  */
 public long getId() {
     return id;
 }
 /**
  * @return the name
  */
 public String getName() {
     return name;
 }
 /**
  * @return the employees
  */
 public List<Employee> getEmployees() {
     return employees;
 }
 /**
  * @param id the id to set
  */
 public void setId(long id) {
     this.id = id;
 }
 /**
  * @param name the name to set
  */
 public void setName(String name) {
     this.name = name;
 }
 /**
  * @param employees the employees to set
  */
 public void setEmployees(List<Employee> employees) {
     this.employees = employees;
 }
 
   //Setter and Getter methods
}