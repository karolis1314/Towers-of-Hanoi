

public class algo {
	
	public void solve(int n, char rodFrom, char rodMid, char rodTo) {
		if(n==1) {System.out.println("Plate 1 from "+rodFrom+" to "+rodTo);
		return;}
		
		solve(n-1, rodFrom, rodTo, rodMid);{
			System.out.println("Plate "+n+ " from "+ rodFrom+ " to "+ rodTo);
		}
		solve(n-1, rodMid, rodFrom, rodTo);{
			
		}
	}

}
