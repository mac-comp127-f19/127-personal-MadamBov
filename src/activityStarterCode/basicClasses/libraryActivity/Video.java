package activityStarterCode.basicClasses.libraryActivity;

public class Video implements Media{
    private String title;
    private String director;
    private int nCopies;
    private int copiesAvailable;
    public Video(String t,String d,int n){
        title=t;
        director=d;
        nCopies=n;
        copiesAvailable=n;
    }



    @Override
    public boolean checkOut() {
        if (copiesAvailable>0){
            copiesAvailable--;
        return true;}
        return false;
    }

    @Override
    public boolean checkIn() {
        if(nCopies!=copiesAvailable){copiesAvailable++;
        return true;}
        return false;
    }
    @Override
    public String toString(){
        return ("Title: " +title+" Director"+director+" Copies available: "+copiesAvailable);
    }

    @Override
    public String getTitle() {
        return title;
    }
}

