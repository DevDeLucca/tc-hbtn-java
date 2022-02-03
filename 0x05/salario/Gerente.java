public class Gerente extends Empregado{

    public Gerente(double salarioFixo) {
        super(salarioFixo);

    }

    private double bonus;

    public double calcularBonus(Departamento departamento) {
        if (departamento.alcancouMeta()) {
            bonus =((super.getSalarioFixo() * 0.2) + ((departamento.getValorAtingidoMeta()-departamento.getValorMeta())*0.01));
        }else {
            bonus = 0;
        }
        return bonus;
    }
}