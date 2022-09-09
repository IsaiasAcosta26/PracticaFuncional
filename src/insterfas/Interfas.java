package insterfas;

public class Interfas implements Interfas04{
    @Override
    public int inter01(int numero1, int numero2) {
      return numero1 + numero2;
    }

    @Override
    public String interf02() {
        return null;
    }

    public static void main(String[] args) {
        Interfas04 interf = new Interfas();
        System.out.println( interf.inter01(4,6));
//        interf.inter01(4,6);
    }

}
