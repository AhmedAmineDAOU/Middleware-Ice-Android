package pack;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class VocalService {


	/**
	 * fonction du web service , prend en parametre la
	 * parole du client et renvoi une chaine de caractere
	 * qui sera interpreté en tant que commande
	 * coté client
	 * @param "analyse/{parole}" [description]
	 */
	@GET
	@Path("analyse/{parole}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getAnalyse(@PathParam("parole") String parole) {
		int index=0;
		parole=parole.toLowerCase();
		if (parole.contains("play") || parole.contains("jouer") || parole.contains("reprend")|| parole.contains("resume"))
			return "play";
		else if (parole.contains("pause"))
			return "pause";
		else if (parole.contains("stop") || parole.contains("arret"))
			return "stop";
		else if (parole.contains("augmenter"))
			return "+vol";
		else if (parole.contains("baisser"))
			return "-vol";
		else if (parole.contains("ajouter") && parole.contains("fav") )
			return "+fav";
		else if (parole.contains("retirer") ||parole.contains("supprimer") ||parole.contains("enlever"))
			return "-fav";
		else if (parole.contains("affiche") ||parole.contains("lister") ||parole.contains("chansons"))
			return "search";
		else if (parole.contains("cherche")  ){
				if (parole.contains("nom")){
					index=parole.indexOf("nom");
					return "1"+parole.substring(index+4,parole.length()).replaceAll("\\s+","");
				}
				else if (parole.contains("artist")){
					index=parole.indexOf("artist");
					return "2"+parole.substring(index+7,parole.length());
				}
				else if (parole.contains("album")){
					index=parole.indexOf("album");
					return "3"+parole.substring(index+6,parole.length()).replaceAll("\\s+","");

				}

			}
		return "nothing";
	}


}
