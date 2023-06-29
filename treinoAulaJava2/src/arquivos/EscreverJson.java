package arquivos;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class EscreverJson {

	public static void main(String[] args) throws IOException {

		Usuario usuario1 = new Usuario();
		usuario1.setLogin("joao");
		usuario1.setNome("Renan Miranda");
		usuario1.setCpf("59115");
		usuario1.setSenha("123456");
		
		
		
		
		Usuario usuario2 = new Usuario();
		usuario2.setLogin("joao");
		usuario2.setNome("Katianny Maia");
		usuario2.setCpf("59116");
		usuario2.setSenha("123456");
		
		List<Usuario> lista = new ArrayList<>();
		lista.add(usuario1);
		lista.add(usuario2);
		
		Gson  gson= new  GsonBuilder().setPrettyPrinting().create();
		String jsonUser =  gson.toJson(lista);

		System.out.println(jsonUser);
		FileWriter fw = new FileWriter("C:\\Users\\renan\\git\\repository2\\treinoAulaJava2\\src\\arquivos\\filejson.json");

		fw.write(jsonUser);
		fw.flush();
		fw.close();
		
		System.out.println("Json escrito");
		
		
		/*------------------------------Lendo um arquivo Json---------------------------------------*/
		
		
		
		
		FileReader fileReader= new FileReader("C:\\Users\\renan\\git\\repository2\\treinoAulaJava2\\src\\arquivos\\filejson.json");
		JsonArray jsonArray =(JsonArray) JsonParser.parseReader(fileReader);
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		
		for (JsonElement jsonElement : jsonArray) {
			Usuario usuario = new Gson().fromJson(jsonElement, Usuario.class);
			usuarios.add(usuario);
		}
		
		System.out.println("leitura do arquivo Json " + usuarios);
		
		
		
	}

}
