package edu.iitdu.jdgen.reflection;

import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;

import org.junit.BeforeClass;
import org.junit.Test;

import edu.iitdu.jdgen.dummy.Circle;
import edu.iitdu.jdgen.dummy.Point;

public class DefaultValueProviderTest {

	private static DefaultValueProvider defaultValueProvider;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		defaultValueProvider = new DefaultValueProvider();
	}

	@Test
	public void getValue_Boolean() throws InstantiationException, IllegalAccessException, InvocationTargetException {
		Boolean actual = defaultValueProvider.getValueFor(Boolean.class);

		assertEquals(false, actual);
	}

	@Test
	public void getValue_Byte() throws InstantiationException, IllegalAccessException, InvocationTargetException {
		Byte actual = defaultValueProvider.getValueFor(Byte.class);

		assertEquals(new Byte((byte) 0), actual);
	}

	@Test
	public void getValue_Charecter() throws InstantiationException, IllegalAccessException, InvocationTargetException {
		Character actual = defaultValueProvider.getValueFor(Character.class);

		assertEquals(new Character('A'), actual);
	}

	@Test
	public void getValue_Double() throws InstantiationException, IllegalAccessException, InvocationTargetException {
		Double actual = defaultValueProvider.getValueFor(Double.class);

		assertEquals(new Double(0.0), actual);
	}

	@Test
	public void getValue_Float() throws InstantiationException, IllegalAccessException, InvocationTargetException {
		Float actual = defaultValueProvider.getValueFor(Float.class);

		assertEquals(new Float(0.0), actual);
	}

	@Test
	public void getValue_Integer() throws InstantiationException, IllegalAccessException, InvocationTargetException {
		Integer actual = defaultValueProvider.getValueFor(Integer.class);

		assertEquals(new Integer(0), actual);
	}

	@Test
	public void getValue_Long() throws InstantiationException, IllegalAccessException, InvocationTargetException {
		Long actual = defaultValueProvider.getValueFor(Long.class);

		assertEquals(new Long(0), actual);
	}

	@Test
	public void getValue_Short() throws InstantiationException, IllegalAccessException, InvocationTargetException {
		Short actual = defaultValueProvider.getValueFor(Short.class);

		assertEquals(new Short((short) 0), actual);
	}
	
	@Test
	public void getValue_SimpleNonPrimitive() throws InstantiationException, IllegalAccessException, InvocationTargetException{
		Point actual = defaultValueProvider.getValueFor(Point.class);
		
		assertEquals(0, (int)actual.getX());
		assertEquals(0, (int)actual.getY());
	}
	
	@Test
	public void getValue_ComplexNonPrimitive() throws InstantiationException, IllegalAccessException, InvocationTargetException{
		Circle actual = defaultValueProvider.getValueFor(Circle.class);
		
		assertEquals(0, (int)actual.getLeftTop().getX());
		assertEquals(0, (int)actual.getLeftTop().getY());
		assertEquals(0, (int)actual.getRadius());
	}
}
