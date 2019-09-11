import java.util.*;
import java.lang.*;

/*

*/
public class PallRings extends Packing
	{
		public static final int HEURISTIC_DIAMETER_FACTOR = 10;
		
		//Constructors
		public PallRings (String material, double D_p, double F_p, double f_p, double Ch, double epsilon, double a)
			{
				super(material, D_p, F_p, f_p, Ch, epsilon, a);
			}
		
		public PallRings (PallRings source)
			{
				super(source);				
			}
			
		//Accessors
		
		//Mutators

		//Instance Methods
		
		public abstract PallRings clone()
			{
				return new PallRings (this);
			}
	}