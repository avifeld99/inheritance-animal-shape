package oefeningnamiddag;

public class SUV extends Car {

    private boolean bullbar;
    private boolean fourxFour;

    public boolean getBullbar() {
        return bullbar;
    }

    public void setBullbar(boolean bullbar) {
        this.bullbar = bullbar;
    }

    public void setFourxFourDriving(boolean fourxFourDriving) {
        this.fourxFour = fourxFourDriving;
    }

    @Override
    public int getSpeed() {
        return super.getSpeed();
    }

}
