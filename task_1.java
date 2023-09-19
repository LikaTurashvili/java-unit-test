@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
	assertEquals("Является взрослым, если возраст превышает 18 лет", true, isAdult); // Напиши код здесь
}
