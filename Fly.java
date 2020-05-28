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

/*So now we are going to speak of how this very basic fly bypass Sentinel uwu
  First we make the player take a damage to disable the fly check (I discovered this randomly lmao)
  Next we says to the server that the player isn't on ground and put the motion to 0 to make the player float in the air.
  If the player go down, sentinel will detect it
  The slow timer is the base for every cubecraft movements hacks (noob)
  Next we say to the game that every 2 ticks he is going to move the player forward of 2 blocks
  And finally when we disable the hack we put a normal timer and set the motion Y to -1 to make the player fall fast and set the the speed to 0 to stop all movements of the player
  Sorry for my bad english boys x)
*/
