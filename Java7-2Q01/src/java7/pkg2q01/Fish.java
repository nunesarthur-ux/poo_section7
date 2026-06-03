package java7.pkg2q01;
public class Fish {
    private String fishName;
    private String typeOfFish;
    private int friendliness;

    public Fish() {
        this.fishName = "Unkown";
        this.typeOfFish = "Unkown";
        this.friendliness = 3;
    }

    public Fish(String fishName, String typeOfFish, int friendliness) {
        this.fishName = fishName;
        this.typeOfFish = typeOfFish;
        this.friendliness = friendliness;
        
    }

    public String getFishName() {
        return fishName;
    }

    public void setFishName(String fishName) {
        this.fishName = fishName;
    }

    public String getTypeOfFish() {
        return typeOfFish;
    }

    public void setTypeOfFish(String typeOfFish) {
        this.typeOfFish = typeOfFish;
    }

    public int getFriendliness() {
        return friendliness;
    }

    public void setFriendliness(int friendliness) {
        this.friendliness = friendliness;
    }
    
    static String nicestFish(Fish f1,Fish f2){
        if (f1.getFriendliness() > f2.getFriendliness()){
            return f1.getFishName();
        }
        return f2.getFishName();
    }
    public static Fish nicestFish(Fish... fishs){
        Fish temp = fishs[0];
        for (int i = 1; i < fishs.length; i++){
            if(fishs[i].getFriendliness() > temp.getFriendliness()){
                temp = fishs[i];
            }
        }
        return temp;
    }
    
    
    
}
