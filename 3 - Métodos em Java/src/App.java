public class App {
    public static void main(String[] args) throws Exception {
        ativarSoneca();
        String mensagemDoAlarme = agendarAlarme(7, 11); // guardando o valor do retorno na variável mensagem
        System.out.println(mensagemDoAlarme);

    }

    /*
     * sintaxe de declaração de métodos no Java
     * <tipo do retorno do método> identificador(<tipo> parâmetros) {
     * <bloco de comandos>
     * }
     */

    /*
     * void é um método que não retorna nada
     * ele somente executa uma lógica
     */
    static void ativarSoneca() {
        System.out.println("Só mais 5 minutos :P");
    }

    /*
     * se for executar o código do jeito que está
     * nãoi vai funcionar, pois quando a jvm for executada ela vai procurar
     * primeiro o que tem dentro do método principal da classe
     * então é preciso chamar/invocar o método. então no método principal a gente
     * chama da seguinte forma:
     * ativarSoneca()
     */

    /*
     * mesmmo invocando o método como dito a cima, ainda vai dar erro
     * pois o método principal está chamando um método estático e
     * métodos estáticos só chamam outros métodos estáticos
     * 
     */

    /*
     * então no método void ativarSoneca(), precisa converter ele para estático
     * também
     * ficando da seguinte forma:
     * static void ativarSoneca()
     */

    /*
     * agora basta executar o programa
     */

    static String agendarAlarme(int hora, int minutos) { // quando for definir os parâmetros é preciso passar tipo
        // é feito da mesma forma que se cria uma variável
        return "Seu alarme foi configurado às " + hora + ":" + minutos;
    }

    /*
     * quando tiver um método que retorna alguma coisa, quando for invocar o método
     * primeiro guarda o valor desse retorno em uma variável para poder usar da
     * forma como quiser
     */
}
