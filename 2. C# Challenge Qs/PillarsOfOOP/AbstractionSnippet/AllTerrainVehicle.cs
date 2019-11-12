class AllTerrainVehicle{  
     
	 //necessary functions of the ATV
	 public void AccelerationGas {get;set;}
     public void Clutch {get;set;}
	 public void Brakes {get;set;}	 
     public void SteeringWheel {get;set;}    
	 
	 /////Hidden using the Private Access modifier  
     private void FourWheelDrive(){  
	 //enables traction for all 4 tires
	 //only gets called when Clutch is accessed
     }	 

     private void GearShift(){
	 //only gets called when Clutch is accessed
     }
	 
	 private void Exhaust(){
	//only gets called when AccelerationGas is accessed
     }  
} 