package view;
public class Main {

    public static void main(String[] args) {


        Produto note = new Produto("Notebook Gamer", 4500.00, 2);
        System.out.println("Produto: " + note.getNome());
        System.out.println("Valor total em estoque: R$" + note.calcularTotal());


        Cliente cli = new Cliente("Carlos Pereira", "123.456.789-00", "carlos.p@email.com");
        cli.exibirDados(); // O método já imprime no console


        ContaBancaria conta = new ContaBancaria("1234-5", "Mariana Costa", 1000.00);
        System.out.println("Titular: " + conta.getTitular() + ", Saldo inicial: R$" + conta.getSaldo());
        conta.depositar(250.50);
        conta.sacar(400.00);
        conta.sacar(1000.00);


        Computador pc = new Computador("Dell", "Intel i7", 16);
        pc.ligar();


        Calculadora calc = new Calculadora();
        System.out.println("Soma (10 + 5): " + calc.somar(10, 5));
        System.out.println("Divisão (10 / 2): " + calc.dividir(10, 2));
        System.out.println("Divisão (10 / 0): " + calc.dividir(10, 0));


        ConversorTemperatura conv = new ConversorTemperatura();
        double tempC = 25.0;
        double tempF = conv.converterCelsiusParaFahrenheit(tempC);
        System.out.println(tempC + "°C equivalem a " + tempF + "°F");
        System.out.println(tempF + "°F equivalem a " + conv.converterFahrenheitParaCelsius(tempF) + "°C");


        Pessoa p = new Pessoa("Lucas", 30, 1.75);
        p.falar();


        Aluno aluno = new Aluno("Beatriz", "MAT-202511", 8.5);
        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Média: " + aluno.calcularMedia());


        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1200);
        livro.abrir();


        System.out.println("\n--- Teste: Moeda ---");
        Moeda meuValor = new Moeda("Real Brasileiro", 500.00);

        double cotacaoDoDia = 5.15; // Ex: 1 Dólar = R$ 5,15

        System.out.println("Valor a converter: R$" + meuValor.getValorEmReal());
        System.out.println("Cotação do Dólar: R$" + cotacaoDoDia);

        double valorEmDolar = meuValor.converterParaDolar(cotacaoDoDia);

        // Formatando a saída para duas casas decimais
        System.out.printf("Valor convertido: US$ %.2f%n", valorEmDolar);

    }
}