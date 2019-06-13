package co.agenciaviajes.cliente;

import co.agenciaviajes.negocio.CiudadComponent;
import co.agenciaviajes.negocio.RegionComponent;
import co.agenciaviajes.negocio.PaqueteComponent;

/**
 *
 * @author Libardo Pantoja, Ricardo Zambrano, Julio Hurtado
 */
public class ClienteMain {

    public static void main(String[] args) {
        // Ejemplo de un paquete a Europa, que visitará tres paises: Italia, España y Francia
        PaqueteComponent principal = new RegionComponent("Europa");
        PaqueteComponent pais1 = new RegionComponent("Italia");
        PaqueteComponent pais2 = new RegionComponent("Francia");
        PaqueteComponent pais3 = new RegionComponent("España");

        PaqueteComponent ciudad1 = new CiudadComponent("Roma", 1000000);
        PaqueteComponent ciudad2 = new CiudadComponent("Paris", 2000000);
        PaqueteComponent ciudad3 = new CiudadComponent("Madrid", 3000000);
        PaqueteComponent ciudad4 = new CiudadComponent("Valencia", 2000000);

        principal.addComponent(pais1);
        principal.addComponent(pais2);
        principal.addComponent(pais3);

        pais1.addComponent(ciudad1);
        pais2.addComponent(ciudad2);
        pais3.addComponent(ciudad3);
        pais3.addComponent(ciudad4);

        // El cliente se refiere tanto a los componentes compuestos, como a los individuales, de manera uniforme
        System.out.println(" Región = "
                + principal.getNombre() + " " + principal.getComponentPrecio() + " Pesos");
        System.out.println(" Pais 1 = "
                + pais1.getNombre() + " " + pais1.getComponentPrecio() + " Pesos");
        System.out.println(" Pais 2 = "
                + pais2.getNombre() + " " + pais2.getComponentPrecio() + " Pesos");
        System.out.println(" Pais 3 = "
                + pais3.getNombre() + " " + pais3.getComponentPrecio() + " Pesos");
        
    
        PaqueteComponent regTierraSanta = new RegionComponent("Tierra Santa");
        PaqueteComponent paisTS1 = new RegionComponent("Palestina");
        PaqueteComponent paisTS2 = new RegionComponent("Egipto");
        PaqueteComponent paisTS3 = new RegionComponent("Israel");

        PaqueteComponent ciudadTS1 = new CiudadComponent("Belen", 2000000);
        PaqueteComponent ciudadTS2 = new CiudadComponent("Monte Sinaí", 2500000);
        PaqueteComponent ciudadTS3 = new CiudadComponent("Jerusalén", 4200000);
        PaqueteComponent ciudadTS4 = new CiudadComponent("Nazaret", 1000000);

        regTierraSanta.addComponent(paisTS1);
        regTierraSanta.addComponent(paisTS2);
        regTierraSanta.addComponent(paisTS3);

        paisTS1.addComponent(ciudadTS1);
        paisTS2.addComponent(ciudadTS2);
        paisTS3.addComponent(ciudadTS3);
        paisTS3.addComponent(ciudadTS4);
        
        System.out.println("---------------------------------");
        System.out.println(" Región = "
                + regTierraSanta.getNombre() + " " + regTierraSanta.getComponentPrecio() + " Pesos");
        System.out.println(" Pais 1 = "
                + paisTS1.getNombre() + " " + paisTS1.getComponentPrecio() + " Pesos");
        System.out.println(" Pais 2 = "
                + paisTS2.getNombre() + " " + paisTS2.getComponentPrecio() + " Pesos");
        System.out.println(" Pais 3 = "
                + paisTS3.getNombre() + " " + paisTS3.getComponentPrecio() + " Pesos");
        // Si se requiere, personalizar los datos:
//        ((CiudadComponent) ciudad1).setHotel(new Hotel("Hotel Italia"));
//        String tours[] = {"Coliseo de Roma", "Basilica San Pedro", "Panteon de Roma"};
//        ((CiudadComponent) ciudad1).setCityTour(new CityTour(tours));
//
//        String alimentacion[] = {"Desayuno ejecutivo", "Almuerzo a la carta", "No incluye cena"};
//        ((CiudadComponent) ciudad1).setPlanAlimentacion(new PlanAlimentacion(alimentacion));
//
//        try {
//            ((CiudadComponent) ciudad1).setVuelo(new Vuelo("Avianca", new SimpleDateFormat("dd/MM/yyyy hh:mm").parse("05/06/2019 10:30"), new SimpleDateFormat("dd/MM/yyyy hh:mm").parse("07/06/2019 13:30")));
//        } catch (ParseException ex) {
//            Logger.getLogger(ClienteMain.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        CiudadComponent ciu = (CiudadComponent) ciudad1;
//        System.out.println("Ciudad: " + ciu.getNombre() + ", " 
//                + ciu.getHotel().getNombre() + ", " 
//                + Arrays.toString(ciu.getPlanAlimentacion().getAlimentacion()) + "' "
//                + Arrays.toString(ciu.getCityTour().getTours()) + ", " 
//                + ciu.getVuelo().getAerolinea() + ", "
//                + ciu.getVuelo().getFechaHoraLlegada().toString() + ", "
//                + ciu.getVuelo().getFechaHoraSalida().toString() + ", "
//        );
    }
}
