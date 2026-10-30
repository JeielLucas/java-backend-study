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
    System.out.println(media(8, 7, 9));      // esperado: 8.0
    System.out.println(media(5.5, 6.5, 8));  // aproximadamente: 6.6667
    System.out.println(media(0, 0, 0));       // esperado: 0.0
    System.out.println(media(10, 10, 10));    // esperado: 10.0

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

    System.out.println("=== Soma de 1 até N ===");
    System.out.println(somaNumeros(1)); // esperado: 1
    System.out.println(somaNumeros(5)); // esperado: 15
    System.out.println(somaNumeros(10)); // esperado: 55

    System.out.println("=== Tabuada ===");
    tabuada(3); // de 3 x 1 = 3 até 3 x 10 = 30

    System.out.println("=== Fatorial ===");
    System.out.println("0! = " + fatorial(0)); // 1
    System.out.println("1! = " + fatorial(1)); // 1
    System.out.println("5! = " + fatorial(5)); // 120

    System.out.println("=== Soma dos dígitos ===");
    System.out.println("381 → " + somaDigitos(381));  // 12
    System.out.println("7 → " + somaDigitos(7));      // 7
    System.out.println("5004 → " + somaDigitos(5004)); // 9

    System.out.println("=== Número primo ===");
    System.out.println(verificarPrimo(2)); // primo
    System.out.println(verificarPrimo(11)); // primo
    System.out.println(verificarPrimo(12)); // não primo
    System.out.println(verificarPrimo(1));  // não primo

    System.out.println("=== Calculadora ===");
    calculadora(8, 2, '+'); // esperado: 10
    calculadora(8, 2, '-'); // esperado: 6
    calculadora(8, 2, '*'); // esperado: 16
    calculadora(8, 2, '/'); // esperado: 4
    calculadora(5, 2, '/'); // esperado: 2.5
    calculadora(8, 0, '/'); // mensagem sobre divisão por zero
    calculadora(8, 2, 'x'); // mensagem sobre operação inválida

    System.out.println("=== Menor de três ===");
    System.out.println(menorNumero(5, 2, 7));    // esperado: 2
    System.out.println(menorNumero(2, 5, 7));    // esperado: 2
    System.out.println(menorNumero(5, 7, 2));    // esperado: 2
    System.out.println(menorNumero(4, 4, 9));    // esperado: 4
    System.out.println(menorNumero(-3, -1, -7)); // esperado: -7


}

void parImpar(int n){
    System.out.println((n % 2 == 0) ? "par" : "impar");
}

void converterTemperatura(double temp){
    System.out.println((temp *9/5) + 32);
}

double media(double n1, double n2, double n3){
    return ((n1+n2+n3) / 3);
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

int somaNumeros(int n){
    int total = 0;
    for(int i = 1; i <= n; i++){
        total += i;
    }
    return total;
}

void tabuada(int n){
    for(int i = 1; i <= 10; i++){
        System.out.printf("%d x %d = %d\n", n, i, n*i);
    }
}

int fatorial(int n){
    int total = 0;
    if(n == 0 || n == 1) return 1;
    else if(n == 2) return n;
    else{
        total = n * fatorial(n-1);
    }
    return total;
}

int somaDigitos(int n){
    int total = 0;
    if(n < 10){
        total += n;
    }else{
        total += n % 10;
        n = n / 10;
        total += somaDigitos(n);
    }
    return total;
}

boolean verificarPrimo(int n){
    if(n == 0 || n == 1) return false;
    else if(n == 2) return true;
    else{
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
    }
    return true;
}

void calculadora(int n1, int n2, char op) {
    switch(op){
        case '-':
            System.out.printf("%d %s %d = %d\n", n1, op, n2, n1 - n2);
            break;
        case '+':
            System.out.printf("%d %s %d = %d\n", n1, op, n2, n1 + n2);
            break;
        case '*':
            System.out.printf("%d %s %d = %d\n", n1, op, n2, n1 * n2);
            break;
        case '/':
            if(n2 == 0){
                System.out.println("O divisor tem que ser diferente de 0");
                break;
            }
            System.out.printf("%d %s %d = %.2f\n", n1, op, n2, (double) n1 / n2);
            break;
        default:
            System.out.println("Operação inválida");
            break;
    }
}

int menorNumero(int n1, int n2, int n3){
    int menor = n1 <= n2 ? n1 : n2;
    menor = menor <= n3 ? menor : n3;

    return menor;
}




