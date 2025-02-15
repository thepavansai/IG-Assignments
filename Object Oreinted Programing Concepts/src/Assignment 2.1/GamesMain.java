class Game{
    void dispinfo(){
        System.out.println("Game");
    }
}
class Cricket extends Game{
    void dispinfo(){
        System.out.println("Cricket Game");
    }
}
class Football extends Game{
    void dispinfo(){
        System.out.println("Football Game");
    }
}
class Tennis extends Game{
    void dispinfo(){
        System.out.println("Tennis Game");
    }
}

class GamesMain {
    public static void main (String []phantom){
        Game[] games= new Game[5];
        games[0]= new Cricket();
        games[0].dispinfo();
        games[1]=new Game();
        games[1].dispinfo();
        games[2]= new Tennis();
        games[2].dispinfo();
        games[3]= new Football();
        games[3].dispinfo();
    }
}