package controledefluxo;

/**
 * Exceção personalizada para indicar erro quando os parâmetros são inválidos.
 */
public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}