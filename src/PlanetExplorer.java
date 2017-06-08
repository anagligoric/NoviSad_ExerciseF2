
// Before you commit and push write your student ID and finish time here.
// Finish time:
// Student ID:

public class PlanetExplorer {
	public int x, y;
	String obstacles;
	int voziloX = 0;
	int voziloY=0;
	String smer ="N";
	public PlanetExplorer(int x, int y, String obstacles){
	/*	x and y represent the size of the grid.
	 *  Obstacles is a String formatted as follows: "(obs1_x,obs1_y)(obs2_x,obs2_y)...(obsN_x,obsN_y)" with no white spaces. 
	 *  
		Example use: For a 100x100 grid with two obstacles at coordinates (5,5) and (7,8)
		PlanetExplorer explorer = new PlanetExplorer(100,100,"(5,5)(7,8)")  
		 
	 */
		this.x=x;
		this.y=y;
		this.obstacles=obstacles;
	}
	public PlanetExplorer (int x, int y){
		this.x=x;
		this.y=y;
	}
	
	public String executeCommand(String command) throws PlanetExplorerException{
		
		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The explorer is on a 100x100 grid at location (0, 0) and facing NORTH. 
		 * The explorer is given the commands "ffrff" and should end up at (2, 2) facing East.
		 
		 * The return string is in the format: "(pos_x,pos_y,facing)(obs1_x,obs1_y)(obs2_x,obs2_y)..(obsN_x,obsN_y)" 
		 * Where pos_x and pos_y are the final coordinates, facing is the current direction the explorer is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
		/*switch(command){
			case "f":
				return "(0,1,N)";
			case "r":
				return "(0,0,E)";
			case "l":
				return "(0,0,W)";
			case "b":
				return "(0,2,N)";
		}*/
		String[] komanda = command.split("");
		for (int i = 0; i < komanda.length;i++)
		{
			switch(smer){
			case "N":
				if (komanda[i].equals("f")){
					voziloY++;
				}
				
					
			}
		}
		/*if(obstacles == ("("+voziloX + "," +  voziloY +")"))
			throw new PlanetExplorerException();*/
		
		return "(" + voziloX + "," + voziloY +"," + smer+ ")";
	}
}
