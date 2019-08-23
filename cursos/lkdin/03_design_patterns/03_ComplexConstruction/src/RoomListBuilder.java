import java.util.ArrayList;

public class RoomListBuilder {
    
    private ArrayList listOfRooms;
    
    public RoomListBuilder addList() {
        this.listOfRooms = new ArrayList();
        return this;
    }
    
    public RoomListBuilder addRoom(Room room){
        listOfRooms.add(room);  
        return this;
    }        

    public RoomBuilder addRoom() {
        return new RoomBuilder(this);
    }
       
    public ArrayList buildList(){
        return listOfRooms;
    }
}
