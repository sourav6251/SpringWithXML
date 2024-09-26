package com.XML;


public class TeamB implements Service{
    public int amount;
    public int time;
    public int teamMember;

    public TeamB(int amount,int time ,int teamMember){
        this.amount=amount;
        this.time=time;
        this.teamMember=teamMember;
    }


    @Override
    public void webDevelopment() {
        System.out.println("No of Team Member: "+teamMember);
        System.out.println("Project finish Time: "+time+"months");
        System.out.println("Amount: "+amount);

    }

    @Override
    public void appDevelopment() {
        System.out.println("No of Team Member: "+teamMember);
        System.out.println("Project finish Time: "+time+"months");
        System.out.println("Amount: "+amount);

    }

    @Override
    public void teamName() {
        System.out.println("Team name is: BBB ");

    }
}
