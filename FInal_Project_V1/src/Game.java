public class Game {
    String gameTitle, devName, devSize;
    String[] compPlt = new String[2];
    char rating;
    double price, downloadSize;
    int playtime, avgUserScore, numUserScores;
    //added an array with tags (only 3 for now)
    String[] tags = new String[3];

    //Title get/set
    public String getTitle(){
        return gameTitle;
    }
    public void setTitle(String title){
        gameTitle = title;
    }

    //DeveloperName get/set
    public String getDeveloperName(){
        return devName;
    }
    public void setDeveloperName(String devNameIN){
        devName = devNameIN;
    }

    //DeveloperSize get/set
    public String getDeveloperSize(){
        return devSize;
    }
    public void setDeveloperSize(String devSizeIN){
        devSize = devSizeIN;
    }

    //Rating get/set
    public char getRating(){
        return rating;
    }
    public void setRating(char gameRating){
        rating = gameRating;
    }

    //Price get/set
    public double getPrice(){
        return price;
    }
    public void setPrice(double gamePrice){
        price = gamePrice;
    }

    //Compatible Platform get/set
    public void getCompPlt(){
        for (int i = 0; i < compPlt.length; i++) {
            System.out.print(compPlt[i] + " ");
        }
    }
    public void setCompPlt(String platform){
        int contains = 0;
        for(int i = 0; i < compPlt.length; i++) {
            if(compPlt[i].equals(platform)) {
                contains = 1;
            }
        }
        if(contains != 1){
            if(compPlt[0].equals("PC")||compPlt[0].equals("CONSOLE")){
                compPlt[1] = platform;
            }
            else{
                compPlt[0] = platform;
            }
        }
        else{
            System.out.println("Already Set As Compatible Platform");
        }
    }

    //Price get/set
    public double getDownloadSize(){
        return downloadSize;
    }
    public void setDownloadSize(double download){
        downloadSize = download;
    }

    //Playtime get/set
    public double getPlaytime(){
        return playtime;
    }
    public void setPlaytime(int time){
        playtime = time;
    }

    //Average User Score Add/Get
    public int getAvgUserScore(){
        return avgUserScore;
    }
    public void AddUserScore(int userScore){
        avgUserScore = (avgUserScore*numUserScores + userScore)/(numUserScores+1);
        numUserScores++;
    }


    // added a body to these two functions

    public void AddTag(String newTag){
        // asks the user for input (enter your first tag) (enter your second tag) and then these tags are entered into the attribute array.
        int contains = 0;
        for(int i = 0; i < tags.length; i++) {
            if(tags[i].equals(newTag)) {
                contains = 1;
            }
        }
        if(contains != 1){
            for(int i = 0; i < tags.length; i++) {
                if(tags[i] == null){
                    tags[i] = newTag;
                    i = tags.length;
                }
            }
        }
        else{
            System.out.println("Already Set As Tag");
        }
    }

    // something something something lmao

    // something

    // whats up bros riley's here




    public void DisplayGameInfo(){
        System.out.println("Game title: " + gameTitle);
        System.out.println("Developer name: " + devName);
        System.out.println("Developer size: " + devSize);
        System.out.println("Game rating:  " + rating);
        System.out.println("Game price: $" + price);
        System.out.println("Game size: " + downloadSize + "GB");
        System.out.println("Play time: " + playtime);
        System.out.println("User score: " + avgUserScore);
    }

}
