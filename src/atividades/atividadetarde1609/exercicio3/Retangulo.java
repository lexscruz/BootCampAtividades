package atividades.atividadetarde1609.exercicio3;

public class Retangulo {

    public void calculaArea(double ladoA, double ladoB){
        double area = ladoA * ladoB;
        System.out.println("A área é: " + area);
    }

    public void calculaPerimetro(double ladoA, double ladoB){
        double perimetro = (ladoA * 2) + (ladoB * 2);
        System.out.println("O perímetro é: " + perimetro);
    }

    public double quantidadePiso(double areaLajota, double areaTotal){
        double qtdLajotas = areaTotal / areaLajota;
        return qtdLajotas;
    }

    public double quantidadeRodaPe(double comprimentolajota, double perimetro){
        double qtdRodaPe = perimetro / comprimentolajota;
        return qtdRodaPe;
    }
}
