package com.bhusalmanish;

public class Main {
    public static void main(String[] args) {

        FootballPlayer joe= new FootballPlayer("Joe");
        BaseballPlayer pat= new BaseballPlayer("Pat");
        SoccerPlayer beckham= new SoccerPlayer("Beckham");

        Team<FootballPlayer> adeilaideCrows = new Team<FootballPlayer>("Adelaide Crows");
        adeilaideCrows.addPlayer(joe);                           // team class is letting add any kind of player
        //adeilaideCrows.addPlayer(pat);                           // right now and there is no check
        //adeilaideCrows.addPlayer(beckham);

        System.out.println(adeilaideCrows.numPlayers());

        Team<BaseballPlayer> baseballTeam=new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        Team <SoccerPlayer> brokenTeam=new Team<SoccerPlayer>("this wont work");
        brokenTeam.addPlayer(beckham);

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks= new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle= new Team <>("Fremantle");

        hawthorn.matchResult(fremantle,1,0);
        hawthorn.matchResult(adeilaideCrows,3,8);

        adeilaideCrows.matchResult(fremantle,2,1);
        //adeilaideCrows.matchResult(baseballTeam,1,1);

        System.out.println("Rankings");
        System.out.println(adeilaideCrows.getName()+": "+ adeilaideCrows.ranking());
        System.out.println(melbourne.getName()+": "+melbourne.ranking());
        System.out.println(fremantle.getName()+": "+fremantle.ranking());
        System.out.println(hawthorn.getName()+": "+hawthorn.ranking());
        System.out.println(adeilaideCrows.compareTo(melbourne));
        System.out.println(adeilaideCrows.compareTo(hawthorn));

    }
}
