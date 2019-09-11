import java.util.*;
import java.lang.*;

/*

*/
public class BerlSaddles extends Packing
	{
		public static final int HEURISTIC_DIAMETER_FACTOR = 15;
		
		//Constructors
		public BerlSaddles (String material, double D_p, double F_p, double f_p, double Ch, double epsilon, double a)
			{
				super(material, D_p, F_p, f_p, Ch, epsilon, a);
			}
		
		public BerlSaddles (BerlSaddles source)
			{
				super(source);				
			}
		
		//Accessors
		
		
		//Mutators

		//Instance Methods
		
			public abstract BerlSaddles clone()
			{
				return new BerlSaddles (this);
			}
	}