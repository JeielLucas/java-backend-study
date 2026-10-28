void main(){

    System.out.println("=== Par ou ímpar ===");
    parImpar(8);
    parImpar(7);
    parImpar(0);

    System.out.println("=== Temperatura ===");
    converterTemperatura(0);
    converterTemperatura(25);
    converterTemperatura(-40);

    System.out.println("=== Média ===");
    media(8, 7, 9);
    media(5.5, 6.5, 8);

    System.out.println("=== Retângulo ===");
    retangulo(4, 3);
    retangulo(5, 5);

    System.out.println("=== Conversão de segundos ===");
    converterSegundos(3661);
    converterSegundos(59);
    converterSegundos(3600);

    System.out.println("=== Maior de três números ===");
    maiorNumero(7, 3, 5);
    maiorNumero(3, 7, 5);
    maiorNumero(3, 5, 7);
    maiorNumero(7, 7, 5);

    System.out.println("=== Classificação de nota ===");
    classificarNota(4.9);
    classificarNota(5.0);
    classificarNota(6.9);
    classificarNota(7.0);
    classificarNota(10.0);

    System.out.println("=== Ano bissexto ===");
    anoBissexto(1900);
    anoBissexto(2000);
    anoBissexto(2024);
    anoBissexto(2023);

    System.out.println("=== Desconto ===");
    descontoCompra(80);
    descontoCompra(100);
    descontoCompra(199);
    descontoCompra(200);
    descontoCompra(250);
}

void parImpar(int n){
    System.out.println((n % 2 == 0) ? "par" : "impar");
}

void converterTemperatura(double temp){
    System.out.println((temp *9/5) + 32);
}

void media(double n1, double n2, double n3){
    System.out.println((n1+n2+n3) / 3);
}

void retangulo(double l, double h){
    System.out.println("Area: " + l * h);
    System.out.println("Perimetro: " + 2 * (l + h));
}

void converterSegundos(int tempo){
    int horas;
    int minutos;
    int segundos;

    horas = tempo/3600;
    int tempoRestante = tempo % 3600;
    minutos = tempoRestante/60;
    segundos = tempoRestante % 60;

    System.out.printf("%ds pode ser dividido em %d horas, %d minutos e %d segundos.\n", tempo, horas, minutos, segundos);
}

void maiorNumero(int num1, int num2, int num3){

    int maior = num1 >= num2 ? num1 : num2;
    if(num3 >= maior){
        maior = num3;
    }
    System.out.println("O maior numero é: " + maior);
}


void classificarNota(double nota){
    if(nota < 5){
        System.out.println("Reprovado");
    }else if(nota < 7){
        System.out.println("Recuperação");
    }else{
        System.out.println("Aprovado");
    }
}

void anoBissexto(int ano){
    if(ano % 100 == 0 && ano % 400 == 0){
        System.out.println("O ano é bissexto");
    }else if(ano % 100 != 0 && ano % 4 == 0){
        System.out.println("O ano é bissexto");
    }else{
        System.out.println("O ano não é bissexto");
    }
}

void descontoCompra(int valorCompra){
    if(valorCompra >= 200){
        System.out.println("Valor com desconto = R$" + valorCompra * 0.8);
    }else if(valorCompra >= 100){
        System.out.println("Valor com desconto = R$" + valorCompra * 0.9);
    }else{
        System.out.println("Valor da compra não é aplicavel para desconto, valor total = R$" + valorCompra);
    }
}



