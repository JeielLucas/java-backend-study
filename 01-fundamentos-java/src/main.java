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

    System.out.println("=== Maior e menor ===");
    maiorMenor(new int[]{4, 9, 2});   // menor: 2, maior: 9
    maiorMenor(new int[]{-3, 0, 8});  // menor: -3, maior: 8
    maiorMenor(new int[]{5, 5, 5});   // menor: 5, maior: 5

    System.out.println("=== Busca por posição ===");
    System.out.println(buscarPosicao(new int[]{4, 9, 2}, 9)); // 2
    System.out.println(buscarPosicao(new int[]{4, 9, 2}, 5)); // -1
    System.out.println(buscarPosicao(new int[]{4, 9, 4}, 4)); // 1, primeira ocorrência

    System.out.println("=== Contagem de vogais ===");
    System.out.println(contarVogais("Computador")); // 4
    System.out.println(contarVogais("A E i o U"));   // 5
    System.out.println(contarVogais("rhythm"));      // 0
    System.out.println(contarVogais("banana"));      // 3

    System.out.println("=== Palíndromo ===");
    System.out.println(palindromo("Ame a ema")); // true
    System.out.println(palindromo("Java"));      // false
    System.out.println(palindromo("A"));         // true
    System.out.println(palindromo("a bba"));     // true, ignorando espaço e maiúsculas

    System.out.println("=== Palavras distintas ===");
    palavrasDistintas(new String[]{"java", "spring", "java", "sql", "spring"}); // esperado: java, spring, sql
    palavrasDistintas(new String[]{"casa", "sol", "casa"}); // esperado: casa, sol
    palavrasDistintas(new String[]{"map", "map", "map"}); // esperado: map
    palavrasDistintas(new String[]{}); // esperado: nenhuma palavra
    palavrasDistintas(new String[]{"Java", "java", "Java"}); // esperado: Java, java

    System.out.println("=== Frequência de palavras ===");
    contarFrequencias(new String[]{"java", "spring", "java"}); // java: 2, spring: 1
    contarFrequencias(new String[]{"map", "map", "set"}); // map: 2, set: 1
    contarFrequencias(new String[]{"sol"}); // sol: 1
    contarFrequencias(new String[]{}); // nenhuma entrada, mapa vazio
    contarFrequencias(new String[]{"Java", "java", "Java"}); // Java: 2, java: 1

    System.out.println("=== Tarefa ===");
    Tarefa tarefa1 = new Tarefa("Estudar Java");
    Tarefa tarefa2 = new Tarefa("Fazer exercícios");

    System.out.println(tarefa1.getTitulo() + " | concluída: " + tarefa1.isConcluida());// Estudar Java | concluída: false
    System.out.println(tarefa2.getTitulo() + " | concluída: " + tarefa2.isConcluida()); // Fazer exercícios | concluída: false

    tarefa1.concluir();
    System.out.println(tarefa1.getTitulo() + " | concluída: " + tarefa1.isConcluida()); // Estudar Java | concluída: true
    System.out.println(tarefa2.getTitulo() + " | concluída: " + tarefa2.isConcluida()); // Fazer exercícios | concluída: false

    tarefa1.concluir();
    System.out.println(tarefa1.isConcluida()); // true, continua concluída

  


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

void maiorMenor(int[] arr){
    int maior = arr[0];
    int menor = arr[0];

    for(int i = 1; i < arr.length; i++){
        if(arr[i] > maior){
            maior = arr[i];
        }else if(arr[i] < menor){
            menor = arr[i];
        }
    }
    System.out.printf("menor: %d, maior: %d\n", menor, maior);
}

int buscarPosicao(int[] arr, int num){
    for(int i = 0; i < arr.length; i++){
        if(arr[i] == num){
            return i + 1;
        }
    }
    return -1;
}

int contarVogais(String palavra){
    int contador = 0;
    palavra = palavra.toLowerCase();
    for(int i = 0; i < palavra.length(); i++){
        char letra = Character.toLowerCase(palavra.charAt(i));
        if("aeiou".indexOf(letra) >= 0){
            contador++;
        }
    }

    return contador;
}

boolean palindromo(String palavra){
    int tamanho = palavra.length();
    int i = 0;
    int j = tamanho - 1;
    while(i < j){
        if(palavra.charAt(i) == ' '){
            i++;
        }else if(palavra.charAt(j) == ' '){
            j--;
        }
        else if(Character.toLowerCase(palavra.charAt(i)) == Character.toLowerCase(palavra.charAt(j))){
            i++;
            j--;
        }else{
            return false;
        }
    }
    return true;
}

void palavrasDistintas(String[] arr){
    Set<String> set = new LinkedHashSet<>();
    if(arr.length != 0){
        for(int i = 0; i < arr.length; i++){
            set.add(arr[i]);
        }
    }else{
        System.out.println("Nenhuma palavra");
        return;
    }
    System.out.println(set);
}

void contarFrequencias(String[] arr){
    Map<String, Integer> frequencia = new HashMap<>();
    for (String s : arr) {
        int contador = frequencia.getOrDefault(s, 0);
        if (contador != 0) {
            frequencia.put(s, contador + 1);
        } else {
            frequencia.put(s, 1);
        }
    }

    System.out.println(frequencia);
}






