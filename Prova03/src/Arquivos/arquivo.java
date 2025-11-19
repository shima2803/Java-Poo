package Arquivos;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class arquivo {

	public static void main(String[] args) throws IOException {
		Path diretorio = Paths.get("C://Users//Usuário//OneDrive//Desktop//projetos//ArquivoTest/test.txt");
		
		List<String> linhas = Files.readAllLines(diretorio);
		
		for(String linha:linhas) {
			System.out.println(linha);
		}
		
	}

}
