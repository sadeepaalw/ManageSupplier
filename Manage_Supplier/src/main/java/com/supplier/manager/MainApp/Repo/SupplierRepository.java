package com.supplier.manager.MainApp.Repo;

import org.springframework.data.repository.CrudRepository;

import com.supplier.manager.MainApp.Model.Supplier;

public interface SupplierRepository extends CrudRepository<Supplier, Integer> {

}
