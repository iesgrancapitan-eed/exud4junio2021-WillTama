package exUD4Junio2021;

/**
 * Controla cuando una edad es incorrecta
 * @author hetag
 *
 */
public class EdadIncorrectaException extends Exception {

	
	private static final long serialVersionUID = 1L;

	/**
	 * Crea excepciones
	 * @param string mensaje de la excepción
	 */
	public EdadIncorrectaException(String string) {
		super(string);
	}

}