public class Casa{
  Porta p1 = new Porta();
  Porta p2 = new Porta();
  Porta p3 = new Porta();

  
  public String cor;

  public int numPortAberta =0;

  public void abrirPorta1(){
    if(p1.isOpen){
      System.out.println("A porta já está aberta!!");
    }else{
      p1.abrir();
      System.out.println("Porta1 Aberta");
numPortAberta++;
    }
    
  }
  public void abrirPorta2(){
    if(p2.isOpen){
      System.out.println("A porta já está aberta!!");
    }else{
      p2.abrir();
      System.out.println("Porta2 Aberta");
numPortAberta++;
    }
  }
  public void abrirPorta3(){
    if(p3.isOpen){
      System.out.println("A porta já está aberta!!");
    }else{
      System.out.println("Porta3 Aberta");
p3.abrir();
      numPortAberta++;
    }
  }
  public void fecharPorta1(){
    if(p1.isOpen){
      System.out.println("Porta1 Fechada");
p1.fechar();
      numPortAberta--;
    }else{
      System.out.println("A porta já está fechada!!");
    }
  }
  public void fecharPorta2(){
    if(p2.isOpen){
      System.out.println("Porta2 Fechada");
p2.fechar();
      numPortAberta--;
    }else{
      System.out.println("A porta já está fechada!!");
    }
  }
  public void fecharPorta3(){
    if(p3.isOpen){
      System.out.println("Porta3 Fechada");
      p3.fechar();
      numPortAberta--;
    }else{
      System.out.println("A porta já está fechada!!");
    }
  }

  public void mostrarPortAberta(){
    System.out.println("A casa possui "+numPortAberta+" portas abertas");
  }
  

  
}