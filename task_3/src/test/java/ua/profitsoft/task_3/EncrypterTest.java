package ua.profitsoft.task_3;

import org.junit.jupiter.api.*;
import static ua.profitsoft.task_3.Encrypter.encrypt;

class EncrypterTest {

	@Test
	void test1() {
		Assertions.assertEquals("00 0 0 0 00 000 0 000", encrypt("G"));
	}

	@Test
	void test2() {
		Assertions.assertEquals("00 0 0 0 00 000 0 000 00 0 0 0 00 00 0 0000", encrypt("GO"));
	}

	@Test
	void testJavaWord() {
		Assertions.assertEquals(
				"00 0 0 0 00 00 0 0 00 0 0 0 00 00 0 00 00 0000 0 0 00 0 0 000 00 0 0 00 00 00 0 00 00 0000 0 0",
				encrypt("Java"));
	}
}
