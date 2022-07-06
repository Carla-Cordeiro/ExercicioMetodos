package exercicio;

public class Main {

    public static void main(String[] args) {

        System.out.println("Exercício da Calculadora");
        Calculadora.soma(15, 13);
        Calculadora.subtracao(15, 13);
        Calculadora.multiplicacao(15, 13);
        Calculadora.divisao(15, 2);

        System.out.println("Exercício Mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(23);

        System.out.println("Exercício Empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
    }
}
