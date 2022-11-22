public class Radio {

    private int currentStation;
    private int currentVolume;

    int getCurrentStation() {
        return currentStation;
    }
    public void setCurrentStation(int newCurrentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void next() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation++;
        }

    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation--;
        }
    }

    public void increaseVolume(){
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume(){
        if (currentVolume < 10) {
            currentVolume = currentVolume - 1;
        }
    }
    public int getCurrentVolume() {
        return currentVolume;
    }
    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }
}
