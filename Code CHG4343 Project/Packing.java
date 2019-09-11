import java.util.*;
import java.lang.*;

/*

*/
public abstract class Packing
	{
		//Instance variables
		private String material; // Packing material 
		private double D_p; // Nominal packing size [mm]
		private double F_p; // Packing factor [m-1]
		private double f_p; // Mass transfer packing factor [-]
		private double Ch; // Hydraulic packing factor [-]
		private double epsilon; // Bed void fraction [-]
		private double a; // Specific area of packing [m2/m3]
		
		//Constructors
		public Packing (String material, double D_p, double F_p, double f_p, double Ch, double epsilon, double a)
			{
				this.material = material;
				this.D_p = D_p;
				this.F_p = F_p;
				this.f_p = f_p;
				this.Ch = Ch;
				this.epsilon = epsilon;
				this.a = a;
			}
		
		public Packing (Packing source)
			{
				this.material = source.getMaterial();
				this.D_p = source.getNominalPackingSize();
				this.F_p = source.getPackingFactor();
				this.f_p = source.getMassTransferPackingFactor();
				this.Ch = source.getHydraulicPackingFactor();
				this.epsilon = source.getBedVoidFraction();
				this.a = source.getSpecificAreaPacking();
			}
		
		//Accessors	
		public String getMaterial()
			{
				return this.material;
			}
		public double getNominalPackingSize()
			{
				return this.D_p;
			}
		public double getPackingFactor()
			{
				return this.F_p;
			}
		public double getMassTransferPackingFactor()
			{
				return this.f_p;
			}
		public double getHydraulicPackingFactor()
			{
				return this.Ch;
			}
		public double getBedVoidFraction()
			{
				return this.epsilon;
			}
		public double getSpecificAreaPacking()
			{
				return this.a;
			}
		//Mutators
		public void setMaterial(String material)
			{
				this.material=material;
			}
		public void setNominalPackingSize(double D_p)
			{
				this.D_p=D_p;
			}
		public void setPackingFactor(double F_p)
			{
				this.F_p = F_p;
			}
		public void setMassTransferPackingFactor(double f_p)
			{
				this.f_p = f_p;
			}
		public void setHydraulicPackingFactor(double Ch)
			{
				this.Ch = Ch;
			}
		public void setBedVoidFraction(double epsilon)
			{
				this.epsilon = epsilon;
			}
		public void setSpecificAreaPacking(double a)
			{
				this.a = a;
			}
		//Instance Methods	
		
		public abstract Packing clone();
	}