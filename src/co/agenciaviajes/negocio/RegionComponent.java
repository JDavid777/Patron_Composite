package co.agenciaviajes.negocio;

import java.util.ArrayList;

/**
 * Representa una region del planeta, como continente o pais
 *
 * @author Libardo Pantoja, Ricardo Zambrano, Julio Hurtado
 */
public class RegionComponent extends PaqueteComponent {

    public ArrayList<PaqueteComponent> regionContenido = new ArrayList();

    // Complete constructor
    
   

    public RegionComponent(String nombre) {
        super(nombre);
    }
    
    @Override
    public void addComponent(PaqueteComponent component){
        if (component!=null) {
            this.regionContenido.add(component);
        }
        
    }
    // Complete demas  metodos
     @Override
    public long getComponentPrecio() {
        long precioOfAllHojas = 0;

        for (Object component : regionContenido) {
            precioOfAllHojas = precioOfAllHojas + (((PaqueteComponent) component).getComponentPrecio());
        }
        return precioOfAllHojas;
    }
    public PaqueteComponent getComponent(int location){
        return null;
    }
    public ArrayList<PaqueteComponent> getRegionContenido() {
        return regionContenido;
    }

    public void setRegionContenido(ArrayList<PaqueteComponent> regionContenido) {
        this.regionContenido = regionContenido;
    }
    
}
