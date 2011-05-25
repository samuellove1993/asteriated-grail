/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package starcup.core.game.card;

/**
 *
 * @author Akira.Pan
 */
public abstract class BaseCard implements ICard {

    private String no;
    private String name;
    private String type;
    private String attr;
    private BaseCard(){
    };

    public BaseCard(String no, String name, String type, String attr) {
        this.no = no;
        this.name = name;
        this.type = type;
        this.attr = attr;
    }
    
    
    public String getAttribute() {
         return this.attr;
    }

    public String getName() {
        return this.name;
    }

    public String getNo() {
        return this.no;
    }

    public String getType() {
       return this.type;
    }
    
}
