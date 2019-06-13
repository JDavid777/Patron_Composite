package co.agenciaviajes.negocio;

/**
 * Ciudades a visitar
 * @author Libardo Pantoja, Ricardo Zambrano, Julio Hurtado
 */
public class CiudadComponent extends PaqueteComponent {

    private int precio;

    private Vuelo vuelo;
    private Hotel hotel;
    private CityTour cityTour;
    private PlanAlimentacion planAlimentacion;
    
    // Completar constructor, getters and setters

    public CiudadComponent(String nombre,int precio) {
        super(nombre);
        this.precio = precio;
    }

    public CiudadComponent(int precio, Vuelo vuelo, Hotel hotel, CityTour cityTour, PlanAlimentacion planAlimentacion, String nombre) {
        super(nombre);
        this.precio = precio;
        this.vuelo = vuelo;
        this.hotel = hotel;
        this.cityTour = cityTour;
        this.planAlimentacion = planAlimentacion;
    }

    @Override
    public long getComponentPrecio() {
        //To change body of generated methods, choose Tools | Templates.
        return getPrecio();
    }
    
    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public CityTour getCityTour() {
        return cityTour;
    }

    public void setCityTour(CityTour cityTour) {
        this.cityTour = cityTour;
    }

    public PlanAlimentacion getPlanAlimentacion() {
        return planAlimentacion;
    }

    public void setPlanAlimentacion(PlanAlimentacion planAlimentacion) {
        this.planAlimentacion = planAlimentacion;
    }


    

}
