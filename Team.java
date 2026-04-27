public class Team {
    // Data Fields
    private String name;
    private int win_total;
    private int loss_total;
    private int tie_total;
    private int total_goals_scored;
    private int total_goals_allowed;


    // Constructors
    public Team(String name) {
        this.name = name;
    }

    // getters and setters

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getWin_total() { return win_total; }

    public void setWin_total(int win_total) { this.win_total = win_total; }

    public int getLoss_total() { return loss_total; }

    public void setLoss_total(int loss_total) { this.loss_total = loss_total; }

    public int getTie_total() { return tie_total; }

    public void setTie_total(int tie_total) { this.tie_total = tie_total; }

    public int getTotal_goals_scored() { return total_goals_scored; }

    public void setTotal_goals_scored(int total_goals_scored) { this.total_goals_scored = total_goals_scored; }

    public int getTotal_goals_allowed() { return total_goals_allowed; }

    public void setTotal_goals_allowed(int total_goals_allowed) { this.total_goals_allowed = total_goals_allowed; }

    public void print_stats() {
        System.out.println(this.name);
        System.out.print("Wins: " + this.win_total + ", ");
        System.out.print("Losses: " + this.loss_total + ", ");
        System.out.print("Ties: " + this.tie_total + ". \n");
        System.out.println("Points Scored: " + this.total_goals_scored + ". ");
        System.out.print("Points Allowed: " + this.total_goals_allowed + ". \n ");
        System.out.println();
    }
}