package com.supplier.manager.tester;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.supplier.manager.MainApp.Model.Supplier;
import com.supplier.manager.MainApp.Repo.SupplierRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class tester {

	@Autowired
	private SupplierRepository sr;
	@Test
	public void addSupplier() {
		
		Supplier sup = new Supplier();
		sup.setSupName("Sadeepa Alwis");
		sup.setSupCompany("the new DAWN");
		sup.setSupContact(779917588);
		sr.save(sup);
	}
}
