import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public abstract class JogoDaForcaBase {
        protected String caminhoArquivo;

        public JogoDaForcaBase(String caminhoArquivo) {
            this.caminhoArquivo = caminhoArquivo;
        }

        protected String[] LerArquivo() {
            try {
                List<String> linhas = Files.readAllLines(Paths.get(caminhoArquivo));
                return linhas.toArray(new String[0]);
            } catch (IOException e) {
                System.out.println("Erro ao ler arquivo: " + e.getMessage());
                return new String[0];
            }
        }

        public abstract void iniciar();
}