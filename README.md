# 🏢 Hibernate One-to-Many Relationship  
## Employee & Department Example

This project demonstrates a **One-to-Many relationship** using Hibernate (JPA) between **Department** and **Employee** entities.

---

## 📌 Project Overview

- One **Department** can have multiple **Employees**
- Each **Employee** belongs to one **Department**
- The foreign key is stored in the **Employee** table

---

## 🔹 Relationship Concept

Department (1)  --------  (Many) Employee

- One Department → Many Employees  
- Many Employees → One Department  

---

## 🛠 Technologies Used

- Java  
- Hibernate  
- JPA Annotations  
- MySQL  
- Maven  

---

## 🗄 Database Structure

### Department Table
- id (Primary Key)  
- name  

### Employee Table
- id (Primary Key)  
- name  
- department_id (Foreign Key)  

---

## 🔁 Hibernate Mapping Concept

### One-To-Many (Parent Side)
- Defined in Department entity
- Uses `@OneToMany`
- `mappedBy` attribute defines ownership
- Cascade operations can be applied

### Many-To-One (Child Side)
- Defined in Employee entity
- Uses `@ManyToOne`
- `@JoinColumn` defines foreign key column

---

## 🔑 Key Annotations Used

- `@Entity` → Marks class as database entity  
- `@Table` → Maps entity to table  
- `@Id` → Primary key  
- `@GeneratedValue` → Auto ID generation  
- `@OneToMany` → Defines one-to-many relationship  
- `@ManyToOne` → Defines many-to-one relationship  
- `@JoinColumn` → Specifies foreign key column  

---

## ⚙ Cascade Behavior

If CascadeType is applied:

- Saving Department → Saves Employees automatically  
- Deleting Department → Deletes related Employees  

---

## 🎯 Expected Output

- Department table created  
- Employee table created  
- One department stored  
- Multiple employees linked to that department  

---

## ✅ Conclusion

This project explains:

- Hibernate One-to-Many mapping  
- Bi-directional relationship setup  
- Foreign key handling  
- Cascade operations  
- JPA annotation-based configuration  

---

⭐ This example is useful for understanding relational mapping in Hibernate and Spring Boot applications.
