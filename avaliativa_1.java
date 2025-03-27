import java.util.Scanner;

public class avaliativa_1 {
    private String nome;
    private double peso;
    private double altura;

    public avaliativa_1(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }


    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public String classificarIMC() {
        double imc = calcularIMC();
        if (imc < 18.5) {
            return "Baixo peso - Recomenda-se procurar um médico para avaliação criteriosa.";
        } else if (imc < 24.9) {
            return "Peso adequado - Tudo indica que está bem, mas é importante avaliar outros parâmetros corporais.";
        } else if (imc < 29.9) {
            return "Sobrepeso - Consulte um médico e reveja hábitos para reverter o quadro.";
        } else if (imc < 34.9) {
            return "Obesidade grau I - Importante buscar orientação médica e nutricional.";
        } else if (imc < 39.9) {
            return "Obesidade grau II - Indica um quadro mais evoluído, busque acompanhamento médico.";
        } else {
            return "Obesidade grau III - Risco alto de doenças associadas, procure um médico urgentemente.";
        }
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " m");
        System.out.println("IMC: " + calcularIMC());
        System.out.println("Classificação: " + classificarIMC());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite seu peso (kg): ");
        double peso = scanner.nextDouble();
        
        System.out.print("Digite sua altura (m): ");
        double altura = scanner.nextDouble();
        
        scanner.close();
        
        avaliativa_1 pessoa = new avaliativa_1(nome, peso, altura);
        pessoa.exibirInformacoes();
    }
}
