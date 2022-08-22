package Model;

public class Producto {
    protected int codigo;
    protected double precio;
    protected String color;
    protected String marca;

    public Producto() {
    }

    public Producto(int codigo, double precio, String color, String marca) {
        this.codigo = codigo;
        this.precio = precio;
        this.color = color;
        this.marca = marca;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Producto [codigo=" + codigo + ", color=" + color + ", marca=" + marca + ", precio=" + precio + "]";
    }

}
