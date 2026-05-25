public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int numberRadioStation;

    public Radio() {
        numberRadioStation = 10;
    }

    public Radio(int numberRadioStation) {
        this.numberRadioStation = numberRadioStation;
    }

    public void next() {
        if (currentRadioStation >= numberRadioStation - 1) {
            currentRadioStation = 0;
        } else {
            currentRadioStation = currentRadioStation + 1;
        }
    }

    public void prev() {
        if (currentRadioStation <= 0) {
            currentRadioStation = numberRadioStation - 1;
        } else {
            currentRadioStation = currentRadioStation - 1;
        }
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > numberRadioStation - 1) {
            return;
        }
        if (newCurrentRadioStation < 0) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void increaseVolume() {
        if (currentVolume >= 100) {
            currentVolume = 100;
        } else {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume <= 0) {
            currentVolume = 0;
        } else {
            currentVolume = currentVolume - 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            currentVolume = 100;
            return;
        }
        if (newCurrentVolume < 0) {
            currentVolume = 0;
            return;
        }
        currentVolume = newCurrentVolume;
    }
}
