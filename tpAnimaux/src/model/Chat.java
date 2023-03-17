package model;

public class Chat extends AnimalDomestique {
	public Chat(String nom, String propriétaire) {
		super(nom, propriétaire);
	}
	
	public String cri() {
		return "MIAOUUU";
	}
}
