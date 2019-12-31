package dmspallas.microservices.limitsservice.bean;

public class LimitsConfiguration {
    private int minimumValue;
    private int maximumValue;

    protected LimitsConfiguration(){

    }

    public LimitsConfiguration(int minimumValue, int maximumValue){
        this.maximumValue = maximumValue;
        this.minimumValue = minimumValue;
    }

    public int getMinimumValue() {
        return minimumValue;
    }

    public void setMinimumValue(int minimumValue) {
        this.minimumValue = minimumValue;
    }

    public int getMaximumValue() {
        return maximumValue;
    }

    public void setMaximumValue(int maximumValue) {
        this.maximumValue = maximumValue;
    }
}
