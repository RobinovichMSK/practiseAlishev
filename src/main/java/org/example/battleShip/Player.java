package org.example.battleShip;

import java.util.Scanner;

public class Player {
    private String name;
    private Board board;
    private int scoreWithoutHitting; // сумма всех палуб(точек/позиций) не подбитых кораблей
                                    // т.е. максимальная сумма 20 (1 - 4_палуб, 2 - 3_палуб, 3 - 2_палуб, 4 - 1_палуб)
                                    // 20 = 4 + 2*3 + 3*2 + 4*1
    private Scanner scanner;
    public Player(String name) {
        this.name = name;
        this.board = new Board();
        this.scoreWithoutHitting = Constants.SCORE_WITHOUT_HITTING;
        this.scanner = new Scanner(System.in);
    }

    public String getName() {
        return name;
    }

    public int getScoreWithoutHitting() {
        return scoreWithoutHitting;
    }


// уменьшение суммы палуб при попадание в палубу корабля
    public void scoreDecrease() {
        scoreWithoutHitting--;
    }

    private void shot(Position position, Player player){
        //scanner + position + player
    }

    private  void turnover(Player opponent){
        // переход хода
    }

}
