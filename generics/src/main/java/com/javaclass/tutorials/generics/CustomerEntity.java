package com.javaclass.tutorials.generics;

public class CustomerEntity extends BasicEntity{
    private String name;
    private String family;
    private String nationalCode;


    public CustomerEntity(Long id,String name, String family, String nationalCode) {
        super(id);
        this.name = name;
        this.family = family;
        this.nationalCode = nationalCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    @Override
    public String toString() {
        return "CustomerEntity{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", nationalCode='" + nationalCode + '\'' +
                '}';
    }
}
