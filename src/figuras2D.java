public class figuras2D {
    int nlados;
    float lado;

    //constructor
    public figuras2D(int nlados, float lado) {
        this.nlados = nlados;
        this.lado = lado;
    }

    //GETTES AND SETTERS
    public int getNlados() {
        return nlados;
    }
    public void setNlados(int nlados) {
        this.nlados = nlados;
    }

    public float getLado() {
        return lado;
    }
    public void setLado(float lado) {
        this.lado = lado;
    }

    //METODO
   public void areaCuadrada(int lado) {
        return this.lado * this.lado;

    };

    private float perimetroCuadrado() {
        return 0
    };


}
