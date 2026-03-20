public class metodoComRetornoString {
    public static String mensagem(String nome) {
        return "Bem-vindo, " + nome + "!";
    }

    public static void main(String[] args) {
        String msg = mensagem("Leonardo");
        System.out.println(msg);
    }
}
