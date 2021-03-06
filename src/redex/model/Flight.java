package redex.model;

public class Flight {
    private static int count = 0;
    private int identificator;
    private int originAirport;
    private int originHour;
    private int originMin;
    private int destinyAirport;
    private int destinyHour;
    private int destinyMin;
    
    public Flight(int originAirport, int originHour, 
            int originMin, int destinyAirport, int destinyHour, 
            int destinyMin){
        this.identificator = count + 1;
        this.originAirport = originAirport;
        this.originHour = originHour;
        this.originMin = originMin;
        this.destinyAirport = destinyAirport;
        this.destinyHour = destinyHour;
        this.destinyMin = destinyMin;
        if((originHour*60 + originMin)>(destinyHour*60 + destinyMin)){
            this.destinyHour += 24;
        }
        count++;
    }

    /**
     * @return the identificator
     */
    public int getIdentificator() {
        return identificator;
    }

    /**
     * @param identificator the identificator to set
     */
    public void setIdentificator(int identificator) {
        this.identificator = identificator;
    }

    /**
     * @return the originAirport
     */
    public int getOriginAirport() {
        return originAirport;
    }

    /**
     * @param originAirport the originAirport to set
     */
    public void setOriginAirport(int originAirport) {
        this.originAirport = originAirport;
    }

    /**
     * @return the originHour
     */
    public int getOriginHour() {
        return originHour;
    }

    /**
     * @param originHour the originHour to set
     */
    public void setOriginHour(int originHour) {
        this.originHour = originHour;
    }

    public int getOriginMin() {
        return originMin;
    }

    public void setOriginMin(int originMin) {
        this.originMin = originMin;
    }

    public int getDestinyAirport() {
        return destinyAirport;
    }

    public void setDestinyAirport(int destinyAirport) {
        this.destinyAirport = destinyAirport;
    }

    public int getDestinyHour() {
        return destinyHour;
    }

    public void setDestinyHour(int destinyHour) {
        this.destinyHour = destinyHour;
    }

    public int getDestinyMin() {
        return destinyMin;
    }

    public void setDestinyMin(int destinyMin) {
        this.destinyMin = destinyMin;
    }
    
    /* Methods */
    public void print(){
        System.out.println("Flight " + this.getIdentificator() + ": " +
                String.valueOf(this.getOriginAirport()) +
                " to " + String.valueOf(this.getDestinyAirport()) + " -> " +
                String.valueOf(this.getOriginHour()) + ":" +
                String.valueOf(this.getOriginMin()) + " - " +
                String.valueOf(this.getDestinyHour()) + ":" +
                String.valueOf(this.getDestinyMin()));
    }
    
}
