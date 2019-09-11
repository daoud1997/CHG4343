import java.util.*;
import java.lang.*;

/*

*/
public class Simulator 
	{
	/*

	*/
		public static void main (String [] args)
			{
				/*
				double v1; // Gas flow rate at inlet
				double l2; // Liquid flow rate at inlet
				double yA1; // Mole fraction in gas phase at inlet
				double xA2; // Mole fraction in liquid phase at inlet
				double r; // Percent recovery of solute
				double T; // Temperature
				double D_AB_V; // Diffusion coefficient of solute in gas
				double D_AB_L; // Diffusion coefficient of solute in liquid
				double muL; // Viscosity of liquid
				double muV; // Viscosity of gas
				double rhoL; //Density of liquid
				double rhoV; //Density of gas	
				double MWA; // Molecular weight of solute
				double MWL; // Molecular weight of liquid
				double MWV; // Molecular weight of gas
				
				Scanner scan = new Scanner (System.in);
				System.out.println("Please enter the gas flow rate at the inlet: ");
				v1 = scan.nextDouble();
				System.out.println("Please enter the liquid flow rate at the inlet: ");
				l2 = scan.nextDouble();
				System.out.println("Please enter the mole fraction of the solute in the gas at the inlet: ");
				yA1 = scan.nextDouble();
				System.out.println("Please enter the mole fraction of the solute in the liquid at the inlet: ");
				xA2 = scan.nextDouble();
				System.out.println("Please enter the percent recovery of solute: ");
				r = scan.nextDouble();
				System.out.println("Please enter the operating temperature: ");
				T = scan.nextDouble();
				System.out.println("Please enter the diffusion coefficient of the solute in the gas: ");
				D_AB_V = scan.nextDouble();
				System.out.println("Please enter the diffusion coefficient of the solute in the liquid: ");
				D_AB_L = scan.nextDouble();
				System.out.println("Please enter the viscosity of the liquid: ");
				muL = scan.nextDouble();
				System.out.println("Please enter the viscosity of the gas: ");
				muV = scan.nextDouble();
				System.out.println("Please enter the viscosity of the liquid: ");
				rhoL = scan.nextDouble();
				System.out.println("Please enter the density of the gas: ");
				rhoV = scan.nextDouble();
				System.out.println("Please enter the molecular weight of the solute: ");
				MWA = scan.nextDouble();
				System.out.println("Please enter the molecular weight of the liquid: ");
				MWL = scan.nextDouble();
				System.out.println("Please enter the molecular weight of the gas: ");
				MWV = scan.nextDouble();
				*/
				
				//For testing
				double v1=100; // Gas flow rate at inlet [kg.mol/h]
				double l2=100; // Liquid flow rate at inlet [kg.mol/h]
				double yA1=0.5; // Mole fraction in gas phase at inlet [-]
				double xA2=0; // Mole fraction in liquid phase at inlet [-]
				double r=99; // Percent recovery of solute [%]
				double T=25; // Temperature [degrees C]
				double D_AB_V=0.0000135; // Diffusion coefficient of solute in gas [m2/s]
				double D_AB_L=0.00000000124; // Diffusion coefficient of solute in liquid [m2/s]
				double muL=0.00089; //Viscosity of liquid [Pa.s]
				double muV=997; //Viscosity of gas [Pa.s]
				double rhoL=0.00000985; //Density of liquid [kg/m3]
				double rhoV=1.261; //Density of gas	[kg/m3]
				double MWA=44.05; // Molecular weight of solute [g/mol]
				double MWL=18.02; // Molecular weight of liquid [g/mol]
				double MWV=28.05; // Molecular weight of gas [g/mol]

				Liquid liquid = new Liquid (l2, T, muL, rhoL, MWL);
				Gas gas = new Gas(v1, T, muV, rhoV, MWV);
				Solute solute = new Solute (yA1, xA2, r, MWA);
				AbsorptionSystem absorptionSystem = new AbsorptionSystem (liquid, gas, solute, D_AB_V, D_AB_L);
				Packing packing = new Packing (material, D_p, F_p, f_p, Ch, epsilon, a);
				PackedAbsorptionColumn = new PackedAbsorptionColumn(absorptionSystem, packing);		
				
			}	

	}	