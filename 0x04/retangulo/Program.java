public class Program {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        retangulo.setLargura(10);
        retangulo.setAltura(2);

        if (FormaGeometrica.class.isAssignableFrom(Retangulo.class))
            System.out.println("Retangulo eh uma subclasse de FormaGeometrica");
        else
            System.out.println("Retangulo nao eh uma subclasse de FormaGeometrica");

        System.out.printf("Largura: %.2f\n", retangulo.getLargura());
        System.out.printf("Altura: %.2f\n", retangulo.getAltura());

        try {
            System.out.printf("Area: %f\n", retangulo.area());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

