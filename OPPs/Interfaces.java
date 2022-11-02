public class Interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}

interface ChessPlayer {
    void moves(); // bluebrint h ,,,ye by default public, abstract bhi h aur chessplayer k aandar
                  // hum iski implementation nahi likh sakte because hame abstraction ko implement
                  // krna hoga, public typle ka h
}

class Queen implements ChessPlayer {
    public void moves() {// recreating function with implementation,,,,, isse public type ka banana hoga
                         // because ye by default default type ka hota h
        System.out.println("up, down, left, right, diagonal (in all 4 directions)");
    }
}

class Rook implements ChessPlayer {
    public void moves() {// recreating function with implementation,,,,, isse public type ka banana hoga
                         // because ye by default default type ka hota h
        System.out.println("up, down, left, right");
    }
}

class King implements ChessPlayer {
    public void moves() {// recreating function with implementation,,,,, isse public type ka banana hoga
                         // because ye by default default type ka hota h
        System.out.println("up, down, left, right, diagonal (by 1 step)");
    }
}



// - ------Syntax to create multiple inheritance interface-------



// interface Herbivore {
//properties ka idea dena h
// }

// interface Carnivore {
//properties ka idea dena h

// }


// class Bear implements Herbivore, Carnivore {
//properties ko implement krna h

// }