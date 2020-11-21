package entidades;

public class Mesa {

    private int id_mesa;
    private int capacidad;
    private boolean estado;

    public Mesa() {
    }

    public Mesa(int capacidad, boolean estado) {
        this.capacidad = capacidad;
        this.estado = estado;
    }

    public Mesa(int id_mesa, int capacidad, boolean estado) {
        this.id_mesa = id_mesa;
        this.capacidad = capacidad;
        this.estado = estado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getId_mesa() {
        return id_mesa;
    }

    public void setId_mesa(int id_mesa) {
        this.id_mesa = id_mesa;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return id_mesa + "";
    }

}
