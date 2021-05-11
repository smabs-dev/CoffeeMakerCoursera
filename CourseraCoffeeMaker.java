CoffeeMachineInterface.java

public interface CoffeeMachineInterface {
	void chooseFirstSelection();
	void chooseSecondSelection();
}
~~~~~~~~~~~~~~~~
Submit OldCoffeeMachine.java here

public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {

OldCofffeeMachine theMachine;
public void selectA() {
System.out.println(“A - Selected”);
}
Public void selectB() {
System.out.println(“B - Selected”);
}
}
~~~~~~~~~~~~~~~~
Submit CoffeeTouchscreenAdapter.java here

OldCofffeeMachine theMachine;
public CoffeeTouchscreenAdapter(OldCoffeeMachine newMachine) {
theMachine = newMachine;
}

public void chooseFirstSelection() {
theMachine.selectA();
}

public void chooseSecondSelection() {
theMachine.selectB();
}
}
~~~~~~~~~~~~~~~~
Assignment 2
Submit IComponent.java here

public interface Icomponent{
void play();
void setPlaybackSpeed(float speed);
String getName();
}
~~~~~~~~~~~~~~~~
Submit Playlist.java here

public class Playlist Implements Icomponent {

public String playlistName;
public Arrarylist<IComponent> playlist = new ArrayList();

public Playlist(String playlistName) {
this.playlistName = playlistName;
}

public void add(IComponent component) {
playlist.add(component);
}

public void remove(IComponent component) {
playlist.remove(component);
}

public void play() {
for(IComponent component : playlist) {
component.play();
}
}

public void setPlaybackSpeed(float speed) {
for(IComponent component: this.playlist) {
}
}

public String getName() {
return this.playlistName;
}
}
~~~~~~~~~~~~~~~
Submit Song.java here

public class Song implements IComponent{
public String songName
public String artist;
public float speed = 1;

public Song(String songName, String artist) {
this.songName=songName;
this.artist = artist;
}
public void play() {
}
public void setPlayBackSpeed(float speed) {
this.speed = speed;
}
}