import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Blog {

	private List<Post> posts;

	public Blog() {
		super();
		posts = new ArrayList<>();
	}

	public void adicionarPostagem(Post postagem) {
		posts.add(postagem);
	}
	
	public void ordenarPosts() {
		posts.sort(Comparator.comparing(Post::getAutor));
	}

	public Set<String> obterTodosAutores() {
		Set<String> autores = new TreeSet<>();
		
		posts.forEach(post -> {
			String nomeTemp = post.getAutor();
			autores.add(nomeTemp);
		});
	
		return autores;
	}
	
	

	public Map<String, Integer> obterContagemPorCategoria() {

		Map<String, Integer> mapaCategorias = new TreeMap<String, Integer>();

		int total=0;
		
		for(int i = 0; i < posts.size(); i++) {
			for(int j = 0; j < posts.size() ; j++) {
				if(posts.get(i).getCategoria().equals(posts.get(j).getCategoria())) {
					total++;
				}
			}
			mapaCategorias.put(posts.get(i).getCategoria(), total);
			total = 0;
		}
		return mapaCategorias;
	}

}
