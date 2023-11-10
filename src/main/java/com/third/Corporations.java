package com.third;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Corporations {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String address;
    
    private int employeeCount;
 
    private String ceoName;

    // Constructors (you can create default and parameterized constructors if needed)

    // Getter for id
    public int getId() {
        return id;
    }

    // Setter for id
    public void setId(int id) {
        this.id = id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for address
    public String getAddress() {
        return address;
    }

    // Setter for address
    public void setAddress(String address) {
        this.address = address;
    }


    // Getter for employeeCount
    public int getEmployeeCount() {
        return employeeCount;
    }

    // Setter for employeeCount
    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }

 
    // Getter for ceoName
    public String getCeoName() {
        return ceoName;
    }

    // Setter for ceoName
    public void setCeoName(String ceoName) {
        this.ceoName = ceoName;
    }

	@Override
	public String toString() {
		return "Corporations [id=" + id + ", name=" + name + ", address=" + address + ", employeeCount=" + employeeCount
				+ ", ceoName=" + ceoName + "]";
	}
    
}
