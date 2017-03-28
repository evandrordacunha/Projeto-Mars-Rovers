import static org.junit.Assert.*;

import java.io.File;
import java.nio.file.Path;

import org.junit.Test;

public class LeitorCordenadasTest {

	@Test
	public void test() {
		LeitorCordenadas leitor = new LeitorCordenadas();
		File arquivo = new File("arquivo.txt");
		leitor.ler(arquivo);
	}

}
