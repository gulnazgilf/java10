public class Radio {

    private int currentStation;
    private int currentVolume;
    private int stationAmount;



    public Radio(){
        stationAmount = 10;

    }

    public Radio(int stationAmount) {
        this.stationAmount = stationAmount;
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > stationAmount - 1) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void next() {
        if (currentStation == stationAmount - 1) {
            currentStation = 0;
        } else {
            currentStation++;
        }

    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = stationAmount - 1;
        } else {
            currentStation--;
        }
    }

    public void increaseVolume() {
        if (currentVolume == 100) {
            this.currentVolume = currentVolume;
        }
        if (currentVolume < 100) {
            this.currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume == 0){
            this.currentVolume = currentVolume;
        } if (currentVolume > 0) {
            this.currentVolume --;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

}

