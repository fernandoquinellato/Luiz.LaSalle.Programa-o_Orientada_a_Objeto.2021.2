  /* Luiz Fernando 0050016010 */
  public static void main(String args[])
  {

    int valorUsuario;
    int multiplicador = 0;
    int total = 0;


    Scanner ler = new Scanner(System.in);
    System.out.println("Informe um número: ");
    valorUsuario = ler.nextInt();

    for (int x = 0; x < 10; x++) 
    {
            total = valorUsuario * ++multiplicador;
            System.out.println(valorUsuario + " x " + multiplicador + " = " + total);
    }

   }
