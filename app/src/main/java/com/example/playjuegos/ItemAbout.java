package com.example.playjuegos;
/*Para definir el array de datos del adaptador podemos crear una clase ItemAbout que contenga los atributos necesarios para montar los
elementos del RecyclerView (int Imagen, String Nombre, String Año). La imagen es de tipo int porque obtendremos la referencia usando R.drawable.imagen*/
public class ItemAbout  {
    int img;
    String nombre;
    String anyo;

    public ItemAbout(int img, String nombre, String anyo) {
        this.img = img;
        this.nombre = nombre;
        this.anyo = anyo;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAnyo() {
        return anyo;
    }

    public void setAnyo(String anyo) {
        this.anyo = anyo;
    }
}
