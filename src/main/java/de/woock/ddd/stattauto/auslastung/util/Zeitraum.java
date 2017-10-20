package de.woock.ddd.stattauto.auslastung.util;

import java.time.LocalDateTime;

public class Zeitraum {
	
	public LocalDateTime von = null;
	public LocalDateTime bis = null;
	
	public Zeitraum(LocalDateTime von, LocalDateTime bis) {
		this.von = von;
		this.bis = bis;
	}
	

}
