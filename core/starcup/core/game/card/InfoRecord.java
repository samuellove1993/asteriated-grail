/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package starcup.core.game.card;

/**
 *CSV文件中或数据库中对应的一条记录信息
 * @author Akira.Pan
 */
public class InfoRecord {

    private String version;
    private String no;
    private String type;
    private String attr;
    private String skillType;
    private String name;
    private int count;

    public String getAttr() {
        return attr;
    }

    public void setAttr(String attr) {
        this.attr = attr;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getSkillType() {
        return skillType;
    }

    public void setSkillType(String skillType) {
        this.skillType = skillType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
