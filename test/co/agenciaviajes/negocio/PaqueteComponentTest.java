/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.agenciaviajes.negocio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author David
 */
public class PaqueteComponentTest {
    
    public PaqueteComponentTest() {
    }
    
    /**
     * Test de la region Tierra Santa
     * @throws java.lang.Exception
     */
    @Test
    public void testTierraSanta() throws Exception{
        System.out.println("Test region Tierra Santa");
        
        PaqueteComponent regTierraSanta = new RegionComponent("Tierra Santa");
        PaqueteComponent paisTS1 = new RegionComponent("Palestina");
        PaqueteComponent ciudadTS1 = new CiudadComponent("Belen", 2000000);
        
        //Agregar un pais a Tierra Santa
        regTierraSanta.addComponent(paisTS1);
        paisTS1.addComponent(ciudadTS1);
        
        //Verificar precio de Tierra Santa
        assertEquals("Tierra Santa", regTierraSanta.getNombre());
        assertEquals(2000000, regTierraSanta.getComponentPrecio());
        
        assertEquals("Palestina", paisTS1.getNombre());
        assertEquals(2000000, paisTS1.getComponentPrecio());
        
        PaqueteComponent ciudadTS2 = new CiudadComponent("Desierto de Judea", 1500000);
        paisTS1.addComponent(ciudadTS2);
        
        assertEquals(3500000, paisTS1.getComponentPrecio());
        
        PaqueteComponent paisTS2 = new RegionComponent("Israel");
        PaqueteComponent ciudadTS3 = new CiudadComponent("Jerusalen", 4000000);
        
        regTierraSanta.addComponent(paisTS2);
        paisTS2.addComponent(ciudadTS3);
        
        assertEquals(7500000, regTierraSanta.getComponentPrecio());
        
        
        
    }
    
}