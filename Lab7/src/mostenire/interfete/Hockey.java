package mostenire.interfete;

public interface Hockey extends Sports {
   /* public void setHomeTeam(String name);
    public void setVisitingTeam(String name);*/  // sunt mostenite din interfata parinte Sports
    public void homeGoalScored();
    public void visitingGoalScored();
    public void endOfPeriod(int period);
    public void overtimePeriod(int ot);
}
