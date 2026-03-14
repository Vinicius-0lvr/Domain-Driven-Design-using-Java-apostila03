public class ExemploCarro {

    public static void  main(String [] args ) {
        //Criar um objeto do tipo Carro
        Carro gol = new Carro();

        //Colocar Valores nos atributos do objeto
        gol.cor = "Prata";
        gol.velocidadeMaxima = 190;
        gol.ano = 2010;
        gol.automatico = false; //true (verdadeiro), false (falso)
        gol.peso = 600;
        gol.modelo ="Gol special Bola";
        gol.altura = 1.5f; //f no final para definir que o valor é float

        //Exibir os valores dos atributos do objeto
        System.out.println("Modelo:" + gol.modelo); // sout
        System.out.println( "Ano:" + gol.ano);
        System.out.println("Cor: " + gol.cor);
        System.out.println("Velocidade maxima:" + gol.velocidadeMaxima);
        System.out.printf("Peso:" + gol.peso);
        System.out.println("Altura:" +gol.altura );
        System.out.println("Automatico: "+ gol.automatico);

        //criar um novo objetoo do tipo carro

       //Colocar valores para 2 atributos e exibir esses valores

        Carro Civic = new Carro();

        Civic.automatico = true;
        Civic.cor = "Preto";
        Civic.peso = 190;
        Civic.velocidadeMaxima = 250;
        Civic.modelo = "Geração 10";
        Civic.ano   =  2021;



        System.out.println("Modelo:" + Civic.modelo); // sout
        System.out.println( "Ano:" + Civic.ano);
        System.out.println("Cor: " + Civic.cor);
        System.out.println("Velocidade maxima:" + Civic.velocidadeMaxima);
        System.out.printf("Peso:" + Civic.peso);


    }

}
