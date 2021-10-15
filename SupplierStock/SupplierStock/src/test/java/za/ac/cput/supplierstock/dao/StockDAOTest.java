/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.supplierstock.dao;

import java.sql.SQLException;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import za.ac.cput.supplierstock.domain.Stock;

/**
 *
 * @author Alizwa
 */
public class StockDAOTest {
	
	public StockDAOTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}
	
	@Before
	public void setUp() {
	}
	
	@After
	public void tearDown() {
	}

	/**
	 * Test of save method, of class StockDAO.
	 */
	@Test
	public void testSave() throws Exception {
		System.out.println("save");
		Stock stock = new Stock(2546,"CarCylinders","Rev4Cyclinders","Alluminium","500 packages","Wharehouse D");
		StockDAO instance = new StockDAO();
		Stock expResult = stock;
		Stock result = instance.save(stock);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		
	}

	/**
	 * Test of getAll method, of class StockDAO.
	 */
	

}
