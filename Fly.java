@Override
public void onEnable(){
  super.onEnable();
  MovementUtils.Damage(); //Take a damage
}
@Override
public void onDisable(){
  super.onDisable();
  mc.timer.timerSpeed = 1f; //Set a normal timer
  mc.thePlayer.motionY = -1f; //Make the player fall fast to bypass the fly check
  MovementUtils.setSpeed(0); //Stop all player movements
}
@EventTarget
public void onUpdate(EventUpdate e){
  	mc.thePlayer.onGround = false;
 	mc.timer.timerSpeed = 0.6f; //Put a slow timer
	mc.thePlayer.motionY = 0; //Make the player stay in the air
  	if(mc.thePlayer.ticksExisted % (2 * 1)== 0)  //Every 2 ticks
		MovementUtils.setSpeed(2f); //Set the player speed to 2f
	}else {
		MovementUtils.setSpeed(0);  //Stop all player movements
	}
}
