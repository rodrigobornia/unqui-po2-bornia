package tpAdapterTemplate.ejercicio3;

import java.util.List;
import java.util.stream.Collectors;

public class LinkEnComun extends FiltroBusqueda{

	@Override
	public void agregarSiCumpleFiltro(WikipediaPage p, WikipediaPage page, List<WikipediaPage> filtradas) {
		if(tienenLinkEnComun(p, page)){
			filtradas.add(p);
		}
	}

	public Boolean tienenLinkEnComun(WikipediaPage p, WikipediaPage page) {
		return p.getLinks().stream().filter(page.getLinks()::contains).collect(Collectors.toList()).size() >= 1;
	}

	

	

}
