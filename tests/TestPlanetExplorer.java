import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	/*@Test (expected=PlanetExplorerException.class)
	public void test_VoziloUCelijiSaPreprekom() throws PlanetExplorerException{
		PlanetExplorer explorer = new PlanetExplorer(3,3 ,"(0,1)");
		explorer.executeCommand("fflr");
	}*/
	@Test
	public void test_SamoJednomNapred() throws PlanetExplorerException{
		PlanetExplorer explorer = new PlanetExplorer(3,3 ,"(2,2)");
		String result=explorer.executeCommand("f");
		assertEquals("(0,1,N)", result);
	}
	@Test
	public void test_SamoJednomDesno() throws PlanetExplorerException{
		PlanetExplorer explorer = new PlanetExplorer(3,3 ,"(2,2)");
		String result=explorer.executeCommand("r");
		assertEquals("(0,0,E)", result);
	}
	@Test
	public void test_SamoJednomLevo() throws PlanetExplorerException{
		PlanetExplorer explorer = new PlanetExplorer(3,3 ,"(2,2)");
		String result=explorer.executeCommand("l");
		assertEquals("(0,0,W)", result);
	}
	@Test
	public void test_SamoJednomNazad() throws PlanetExplorerException{
		PlanetExplorer explorer = new PlanetExplorer(3,3 ,"(2,2)");
		String result=explorer.executeCommand("b");
		assertEquals("(0,2,N)", result);
	}
	@Test (expected=PlanetExplorerException.class)
	public void test_VoziloUCelijiSaPreprekom() throws PlanetExplorerException{
		PlanetExplorer explorer = new PlanetExplorer(3,3 ,"(0,1)");
		explorer.executeCommand("fflr");
	}
	
}
