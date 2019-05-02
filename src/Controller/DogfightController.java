package Controller;

public class DogfightController {
	private int TIME_SLEEP = 30;
	
	public DogfightController (dogfightModel : IDogfightModel);
	public void orderPerform(userOrder : UserOrder);
	public void play();
	public void setViewSystem(viewSystem : IViewSystem);
	private void launchMissile(player : int);
	private void gameLoop();
	
}
