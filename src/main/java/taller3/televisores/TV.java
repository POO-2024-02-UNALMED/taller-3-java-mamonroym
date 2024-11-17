package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal = 1;
    private int precio = 500;
    private boolean estado;
    private int volumen = 1;
    private Control control;
    public static int numTV;

    public static void main (String[] args) { }
    
    public TV (Marca marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;
        TV.numTV ++;
    }

    public Marca getMarca() {
        return marca;
        }
    public void setMarca (Marca marca) {
        this.marca = marca;
        }
    public int getCanal() {
        return canal;
        }
    public void setCanal (int canal) {
        this.canal = canal;
        }
    public int getPrecio() {
        return precio;
        }
    public void setPrecio (int precio) {
        this.precio = precio;
        }
    public int getVolumen() {
        return volumen;
        }
    public void setVolumen (int volumen) {
        this.volumen = volumen;
        }
    public Control getControl() {
        return control;
        }
    public void setControl (Control control) {
        this.control = control;
        }
    public int getNumTV() {
        return TV.numTV;
        }
    public void setNumTV (int numTV) {
        TV.numTV = numTV;
        }

    public void turnOn() {
        this.estado = true;
        }
    public void turnOff() {
        this.estado = false;
        }
    
    public boolean getEstado() {
        return estado;
        }

    public void canalUp() {
        if (this.estado) {
            if (this.canal >= 1 && this.canal <= 119) {
                this.canal++;
            }
        }
    }
    public void canalDown() {
        if (this.estado) {
            if (this.canal >= 2 && this.canal <= 120) {
                this.canal--;
            }
        }
    }
    public void volumenUp() {
        if (this.estado) {
            if (this.volumen >= 0 && this.volumen <= 6) {
                this.volumen++;
            }
        }
    }
    public void volumenDown() {
        if (this.estado) {
            if (this.volumen >= 1 && this.volumen <= 7) {
                this.volumen--;
            }
        }
    }
}