import java.util.*;
import java.lang.*;

/*

*/
public class PackedAbsorptionColumn
	{
		//Instance variables
		private AbsorptionSystem absorptionSystem;
		private Packing packing;
		
		//Constructors
		public PackedAbsorptionColumn (AbsorptionSystem absorptionSystem, Packing packing)
			{
				this.absorptionSystem = new AbsorptionSystem(absorptionSystem);
				this.packing = new Packing (packing);
			}
		public PackedAbsorptionColumn (PackedAbsorptionColumn source)
			{
				this.absorptionSystem = new AbsorptionSystem(source.getAbsorptionSystem());
				this.packing = new Packing (source.getPacking());					
			}
		//Accessors
		public AbsorptionSystem getAbsorptionSystem()
			{
				return this.absorptionSystem;
			}
		
		public Packing getPacking()
			{
				return this.packing;
			}
		
		//Mutators
		public void setAbsorptionSystem(AbsorptionSystem absorptionSystem)
			{
				this.absorptionSystem = new AbsorptionSystem (absorptionSystem);
			}
		
		public void setPacking(Packing packing)
			{
				this.packing = new Packing (packing);
			}
		//Instance Methods
		/*

		*/
		public double calculateColumnDiameter ()
			{
				double D_c; // Diameter of column [m]
				D_c = 30*( packing.getNominalPackingSize() )/1000; // on excel the formulas for calc. of diameter changes with packing
				return D_c;
			}
		/*

		*/
		public double calculateCrossSectionalAreaColum ()
			{
				double S; // Cross sectional area of column [m2]
				S = ( math.PI * math.pow(calculateColumnDiameter(),2) )/ 4 ; 
				return S;			
			}
		/*

		*/
		public double calculateHeightTransferUnit ()
			{
				double H; // Height of a transfer unit [m]
				return H;
			}
		/*

		*/
		public double calculateColumnHeight ()
			{
				double z; // Height of the tower [m]
				return z;
			}
		/*

		*/
		public double calculateActualColumnHeight ()
			{
				double z_actual; // Actual height of the tower (highest of zv and z) [m]
				return z_actual;
			}
	    /*

		*/
		public double calculateGasMassVelocity()
			{
				double gasMassVelocity;
				gasMassVelocity = ( absorptionSystem.getGas().getGasFlowRateInlet() * absorptionSystem.getGas().getMolecularWeightGas() )/ calculateCrossSectionalAreaColumn () );
				return gasMassVelocity;
			}
		/*

		*/
		public double calculateLiquidMassVelocity()
			{
				double liquidMassVelocity;
				liquidMassVelocity = ( absorptionSystem.getLiquid().getLiquidFlowRateInlet() * absorptionSystem.getLiquid().getMolecularWeightLiquid() )/ calculateCrossSectionalAreaColumn () );
				return liquidMassVelocity;
			}	
		/*

		*/
		public double [] calculateMassTransferCoefficients()
			{
				double [] massTransferCoefficients = new double [2];
				massTransferCoefficients[1] = math.pow( (( calculateCrossSectionalAreaColumn ()/ absorptionSystem.getGas().getGasFlowRateInlet()  ) * ( 0.226/ packing.getMassTransferPackingFactor()) * math.pow(absorptionSystem.getcalculateSchmidtGas()/0.66, 0.5)*math.pow(calculateLiquidMassVelocity()/6.782,-0.5)*math.pow(calculateGasMassVelocity()/0.678, 0.35)),-1);
				massTransferCoefficients[2]= math.pow ((( calculateCrossSectionalAreaColumn ()/ absorptionSystem.getGas().getGasFlowRateInlet() )*(0.357/packing.getMassTransferPackingFactor()) * math.pow(absorptionSystem.getcalculateSchmidtLiquid()/372, 0.5)*math.pow(((calculateLiquidMassVelocity()/absorptionSystem.getLiquid().getViscosityLiquid())/(6.782/0.0008937)),0.3),-1));
				return massTransferCoefficients;
			}
	}



