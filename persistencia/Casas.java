package estancias.entidades;

import java.math.BigDecimal;
import java.util.Date;


public class Casas {
    private int idCasas;
    private String calle;
    private int numeroCasas;
    private int codigoPostal;
    private String ciudad;
    private String pais;
    private Date fechaDesde;
    private Date fechaHasta;
    private int tiempoMinimo;
    private int tiempoMaximo;
    private BigDecimal precioHabitacion;
    private String tipoVivienda;

    public Casas() {
    }

    public Casas(int idCasas, String calle, int numeroCasas, int codigoPostal, String ciudad, String pais, Date fechaDesde, Date fechaHasta, int tiempoMinimo, int tiempoMaximo, BigDecimal precioHabitacion, String tipoVivienda) {
        this.idCasas = idCasas;
        this.calle = calle;
        this.numeroCasas = numeroCasas;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
        this.pais = pais;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
        this.tiempoMinimo = tiempoMinimo;
        this.tiempoMaximo = tiempoMaximo;
        this.precioHabitacion = precioHabitacion;
        this.tipoVivienda = tipoVivienda;
    }

    public int getIdCasas() {
        return idCasas;
    }

    public void setIdCasas(int idCasas) {
        this.idCasas = idCasas;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumeroCasas() {
        return numeroCasas;
    }

    public void setNumeroCasas(int numeroCasas) {
        this.numeroCasas = numeroCasas;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Date getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(Date fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public Date getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(Date fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public int getTiempoMinimo() {
        return tiempoMinimo;
    }

    public void setTiempoMinimo(int tiempoMinimo) {
        this.tiempoMinimo = tiempoMinimo;
    }

    public int getTiempoMaximo() {
        return tiempoMaximo;
    }

    public void setTiempoMaximo(int tiempoMaximo) {
        this.tiempoMaximo = tiempoMaximo;
    }

    public BigDecimal getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(BigDecimal precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

    public String getTipoVivienda() {
        return tipoVivienda;
    }

    public void setTipoVivienda(String tipoVivienda) {
        this.tipoVivienda = tipoVivienda;
    }

    @Override
    public String toString() {
        return "Casas{" + "idCasas=" + idCasas + ", calle=" + calle + ", numeroCasas=" + numeroCasas + ", codigoPostal=" + codigoPostal + ", ciudad=" + ciudad + ", pais=" + pais + ", fechaDesde=" + fechaDesde + ", fechaHasta=" + fechaHasta + ", tiempoMinimo=" + tiempoMinimo + ", tiempoMaximo=" + tiempoMaximo + ", precioHabitacion=" + precioHabitacion + ", tipoVivienda=" + tipoVivienda + '}';
    }
    
            
}
