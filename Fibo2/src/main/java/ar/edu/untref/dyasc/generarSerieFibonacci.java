import java.util.ArrayList;
import java.util.List;


public class generarSerieFibonacci {
	public List<Integer> generarFibo(int nroFibo) {
        List<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(0);
        fibonacci.add(1);

        for (int i = 2; i < nroFibo; i++) {
            int next = fibonacci.get(i - 1) + fibonacci.get(i - 2);
            fibonacci.add(next);
        }

        return fibonacci;
    }
}
