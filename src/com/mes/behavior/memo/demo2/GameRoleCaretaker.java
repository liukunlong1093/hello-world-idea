package com.mes.behavior.memo.demo2;

/**
 * 游戏角色管理者
 */
public class GameRoleCaretaker {
    /** 游戏角色备份*/
    private GameRoleMemento gameRoleMemento;

    public GameRoleMemento getGameRoleMemento() {
        return gameRoleMemento;
    }

    public void setGameRoleMemento(GameRoleMemento gameRoleMemento) {
        this.gameRoleMemento = gameRoleMemento;
    }
}
