package cs301.birthdaycake;

public class CakeModel {
    private boolean areCandlesLit;
    private int numCandles;
    private boolean hasFrosting;
    private boolean hasCandles;

    public CakeModel()
    {
        areCandlesLit = true;
        numCandles = 2;
        hasFrosting = true;
        hasCandles = true;
    }

    public void toggleLit()
    {
        areCandlesLit = !(areCandlesLit);
    }

    public void toggleCandles()
    {
        hasCandles = !(hasCandles);
    }

    public void setNumCandles(int num)
    {
        numCandles = num;
    }

    public boolean areCandlesLit()
    {
        return areCandlesLit;
    }

    public boolean hasCandles()
    {
        return hasCandles;
    }

    public int getNumCandles()
    {
        return numCandles;
    }
}
