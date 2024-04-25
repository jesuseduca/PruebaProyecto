/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;

/**
 *
 * @author admin
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }

  
    	@Test
        @Disabled       
	void testSuma() {
		Calculadora c = new Calculadora(2,4);
		int suma = c.suma();
		assertEquals(suma,6);
				
	}
	@Test
        @DisplayName("Prueba")    
	void testResta() {
		Calculadora c = new Calculadora(4,2);
		int resultado = c.resta();
		assertEquals(resultado,2);
		c = new Calculadora(2,4);
		resultado = c.resta();
		assertEquals(resultado,-2);
			
	}
	@Test
        @BeforeAll
	void testMultiplicacion() {
		Calculadora c = new Calculadora(2,4);
		int resultado = c.multiplica();
		assertEquals(resultado,8);
			
	}
	@Test
	void testDivide() {
		Calculadora c = new Calculadora(2,2);
		int resultado = c.divide();
		assertEquals(resultado,1);
	
	}
	
	@Test
	void testResta2() {
		Calculadora c = new Calculadora(4,2);
		//Calculadora d=c;
		//assertSame(d,c);
		boolean resultado = c.resta2();
		assertTrue(resultado);
		c = new Calculadora(2,4);
		resultado=c.resta2();
		assertFalse(resultado);
		//c = new Calculadora(2,4);
		//assertSame(d,c);
			
	}
	
	@Test
	void testDivide2() {
		Calculadora c = new Calculadora(4,0);
		Integer resultado = c.divide2();
		assertNull(resultado);
		c = new Calculadora(4,2);
		resultado = c.divide2();
		assertNotNull(resultado);
		assertEquals(resultado,2);
			
	}
	
	@Test
	void testFactorial() {
		//primer caso
		Calculadora c = new Calculadora(-1,'E');
		Integer resultado = c.factorial();
		assertNull(resultado);
		//segundo caso
		c = new Calculadora(0,'T');
		resultado = c.factorial();
		assertEquals(resultado,1);
		//tercer caso
		c = new Calculadora(2,'S');
		resultado = c.factorial();
		assertEquals(resultado,2);
	
	}
	
}