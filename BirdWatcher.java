
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int daysCount=birdsPerDay.length;
        int birdsLastWeek[] = new int[7];
        for(int index=0;index<7;index++)
        {
            birdsLastWeek[index]=birdsPerDay[daysCount-7+index];
        }
        return birdsLastWeek;
    }

    public int getToday() {
        int daysCount=birdsPerDay.length;
        if(daysCount==0)
            return 0;
        return birdsPerDay[daysCount-1];
    }

    public void incrementTodaysCount() {
        int daysCount=birdsPerDay.length;
        birdsPerDay[daysCount-1]++;
    }

    public boolean hasDayWithoutBirds() {
        int daysCount=birdsPerDay.length;
        for(int index=0;index<daysCount;index++)
        {
            if(birdsPerDay[index]==0)
                return true;  
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int countForFirstDays=0;
        if(numberOfDays>birdsPerDay.length)
            numberOfDays=birdsPerDay.length;
        for(int index=0;index<numberOfDays;index++)
        {
              countForFirstDays+=birdsPerDay[index];  
        }
        return countForFirstDays;
    }

    public int getBusyDays() {
        int countBusyDays=0;
        for(int index:birdsPerDay)
        {
            if(index>=5)
                countBusyDays++;
        }
        return countBusyDays;
    }
}