package com.kgfsl.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author imssbora
 */
@Entity
@Table(name = "EMPLOYEE")
public class Employee {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "EMP_ID")
   private long id;

   @Column(name = "NAME", nullable = false)
   private String name;

   @Column(name = "DESIGNATION")
   private String designation;

   @ManyToOne
   @JoinColumn(name = "DPT_ID")
   private Department department;
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
    * @return the designation
    */
   public String getDesignation() {
       return designation;
   }/**
    * @return the department
    */
   public Department getDepartment() {
       return department;
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
    * @param designation the designation to set
    */
   public void setDesignation(String designation) {
       this.designation = designation;
   }
   /**
    * @param department the department to set
    */
   public void setDepartment(Department department) {
       this.department = department;
   }
  
   //Setter and Getter methods
}