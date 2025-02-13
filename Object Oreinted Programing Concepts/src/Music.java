abstract class Instrument {
    abstract void play();
}
class Piano extends Instrument{
    void play(){
        System.out.println("Piano is playing  tan tan tan ");
    }
}
class Flute extends Instrument {
    void play(){
        System.out.println("Flute is playing  toot toot toot ");
    }
}
class Guitar extends Instrument {
    void play(){
        System.out.println("Guitar is playing  tin  tin  tin ");
    }
}
class Music {
    public static void main(String []phantom){
        Instrument [] instruments = new Instrument[10];
        instruments[0]= new Piano();
        instruments[1]= new Flute();
        instruments[3]= new Flute();
        instruments[5]= new Guitar();
        instruments[2]= new Guitar();
        instruments[4]= new Piano();
        for(Instrument x: instruments){
            try{
                System.out.println(x.getClass().getName());
                x.play();
            }
            catch(Exception e){
                System.out.println("Abstract Method of Instrument.\nException: "+e.getMessage());
            }
           
        }
    }
}
