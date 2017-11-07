package com.mes.behavior.memo.demo2;

public class Main {
    public static void main(String [] args){
        GameRole gameRole=new GameRole();
        gameRole.initRole();
        gameRole.show();
        GameRoleCaretaker gameRoleCaretaker=new GameRoleCaretaker();
        GameRoleMemento gameRoleMemento=gameRole.bakGameRole();
        gameRoleCaretaker.setGameRoleMemento(gameRoleMemento);
        gameRole.gameOver();
        gameRole.show();
        gameRole.revertGameRole(gameRoleCaretaker.getGameRoleMemento());
        gameRole.show();
    }
}
