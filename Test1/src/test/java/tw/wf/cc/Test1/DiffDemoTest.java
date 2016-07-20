package tw.wf.cc.Test1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DiffDemoTest {
	DiffDemo dd;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		dd=new DiffDemo();
	}

	@After
	public void tearDown() throws Exception {
		dd=null;
	}

	@Test
	public void testGetDiff() throws Exception {
		String str1="abcde";
		String str2="abcxy";
		String expected="xy";
		String bb=dd.getDiff(str1, str2);
		assertEquals(expected, bb);
	}

}
