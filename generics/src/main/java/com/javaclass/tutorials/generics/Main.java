package com.javaclass.tutorials.generics;

public class Main {
    public static void main(String[] args) throws DuplicateEntityException {

        GenericRepository<CustomerEntity> repository=new GenericRepository<>();
        repository.add(new CustomerEntity(1L,"Ali","Alipoor","1234567890"));
        System.out.println(repository.findById(1L));
        System.out.println(repository.findById(0L));

        repository.add(new CustomerEntity(2L,"John","Doe","9876543210"));

        System.out.println(repository.findAll());

        repository.removeById(1L);
        System.out.println(repository.findAll());

        repository.update(new CustomerEntity(2L, "Mohammad", "Alavi", "9876543210"));

        System.out.println(repository.findAll());
    }
}
