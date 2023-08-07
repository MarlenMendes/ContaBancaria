import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

import java.security.cert.CertPathBuilder;

public class ResponseEntity<T> {
    public static ResponseEntity<ContaBancaria> ok(Object created) {

        return null;
    }

    @Contract(pure = true)
    public static @Nullable CertPathBuilder notFound() {
        return null;
    }

    public ResponseEntity<T> clone() {
        ResponseEntity<T> clone = clone (null);
        ResponseEntity<T> responseEntity = clone;
        ResponseEntity<T> response = responseEntity;
        return response;

    }

    public ResponseEntity<T> clone(T conta) {
        return null;
    }
}
