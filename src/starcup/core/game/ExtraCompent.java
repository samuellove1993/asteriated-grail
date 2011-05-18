/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package starcup.core.game;

/**
 *角色或者阵营的置放区域
 * @author Akira.Pan
 */
public class ExtraCompent {

    /*士气*/
    private int hp;
    /*宝石*/
    private int baoshi;
    /*水晶*/
    private int shuijing;
    /*星杯*/
    private int xingbei;

    public int getBaoshi() {
        return baoshi;
    }

    public void setBaoshi(int baoshi) {
        this.baoshi = baoshi;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getShuijing() {
        return shuijing;
    }

    public void setShuijing(int shuijing) {
        this.shuijing = shuijing;
    }

    public int getXingbei() {
        return xingbei;
    }

    public void setXingbei(int xingbei) {
        this.xingbei = xingbei;
    }
}
