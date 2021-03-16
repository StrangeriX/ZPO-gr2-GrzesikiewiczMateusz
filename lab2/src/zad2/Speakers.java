package zad2;

public class Speakers {
    DolbyStrategy dolby;
    int countOfSpeakers;

    public Speakers(int speakers, DolbyStrategy dolby){
        this.countOfSpeakers = speakers;
        this.dolby = dolby;
    }

    public void setDolby(DolbyStrategy dolby) {
        this.dolby = dolby;
    }
    public void checkDolby(){
        this.dolby.chooseDolby();
    }
}
