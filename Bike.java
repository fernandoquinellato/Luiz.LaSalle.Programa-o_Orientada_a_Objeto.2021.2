public class Bike {

    //atributos
    public String marca;
    public String cor;
    public Time qtdMarchas;
   

    //construtor
    public Bike(){
        qtdMarchas = new Time();
    }

    
    //metodos
    public void andar()
    {
        if(qtdMarchas<1) qtdMarchas+1;
        System.out.println( this.marca + " andar " );
    }

    public void frear()
    {
        if(qtdMarchas>1) qtdMarchas-1;
        System.out.println( this.marca + " frear " );
    }
}



