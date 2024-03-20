public class Main {
  public static void main(String[] args) {
  
    Casa c = new Casa();

    c.cor = "Azul";

    c.abrirPorta1();
    c.abrirPorta2();
    c.abrirPorta3();
    c.abrirPorta2();
    c.fecharPorta1();
    c.fecharPorta2();
    c.fecharPorta1();
    c.fecharPorta3();

    c.mostrarPortAberta();
    
  }

  
}