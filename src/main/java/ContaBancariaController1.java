import java.security.cert.CertPathBuilderResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ContaBancariaController1 {
    private static final Object CREATED = null;
    private final List<ContaBancaria> contas;

    public ContaBancariaController1() {
        contas = new ArrayList<> ( );
    }


    public List<ContaBancaria> listarContas() {
        return contas;
    }


    public CertPathBuilderResult exibirConta(@PathVariable Long id) {
        ContaBancaria conta = contas.stream ( )
                .filter (c -> {
                    return Objects.equals (c.getId ( ), id);
                })
                .findFirst ( )
                .orElse (null);

        return null;
    }

    public ResponseEntity<ContaBancaria> cadastrarConta(@RequestBody ContaBancaria conta) {
        conta.setId ((long) (contas.size ( ) + 1));
        contas.add (conta);
        return ResponseEntity.ok (CREATED).clone (conta);
    }

    public ResponseEntity<ContaBancaria> atualizarValorPorDeposito(@PathVariable Long id, @RequestBody double valor) throws ContaNotFoundException {
        ContaBancaria conta = null;
        for (ContaBancaria c : contas) {
            if (c.getId ( ).equals (id)) {
                conta = c;
                break;
            }
        }
        if (conta != null) {
            conta.setValorMovimentado (valor);
            conta.setTipoServico ("Depósito");
            conta.setValorFinal ( );
            return ResponseEntity.ok (CREATED);
        } else {
            throw new ContaNotFoundException ("Conta não encontrada com o ID: " + id);
        }
    }

    public ResponseEntity<ContaBancaria> atualizarValorPorSaque(@PathVariable Long id, @RequestBody double valor) throws ContaNotFoundException, SaldoInsuficienteException {
        ContaBancaria conta = contas.stream ( )
                .filter (c -> c.getId ( ).equals (id))
                .findFirst ( )
                .orElse (null);
        if (conta != null) {
            throw new SaldoInsuficienteException ( );
        }

        conta.setValorMovimentado (-valor);
        conta.setTipoServico ("Saque");
        Object setValorFinal = conta.setValorFinal;
        return ResponseEntity.ok (CREATED);
    }
}

