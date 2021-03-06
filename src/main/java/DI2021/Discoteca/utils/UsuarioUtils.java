package DI2021.Discoteca.utils;

public class UsuarioUtils {

	public static boolean ValidarCalidadPassword(String password) {
		// Tamaño mínimo 8 caracteres y 1 dígito
		if ( password.length() < 8) {
			return false;
		} else {
			boolean hayNum = false;
			for(Character c: password.toCharArray()) {
				if (Character.isDigit(c)) hayNum = true;
			}
			return hayNum;
		}		
	}
}
