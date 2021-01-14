package DI2021.Discoteca.utils;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class UsuarioUtilsTest {

	@Test
	public void should_work() {
		Assert.assertTrue(UsuarioUtils.ValidarCalidadPassword("pass987word"));
	}
	@Test
	public void should_not_work() {
		Assert.assertFalse(UsuarioUtils.ValidarCalidadPassword("passw"));
	}

}
