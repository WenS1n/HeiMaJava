package com.vesns.cn.demo07;

public class Hero {

    private String name;
//    英雄的名称
    private Skill skill;
//    英雄的技能


    public Hero() {
    }

    public Hero(String name, Skill skill) {
        this.name = name;
        this.skill = skill;
    }

    public void attack() {
        System.out.println("我叫大鹌鹑正在使用" + name + ",开始释放技能：");
        skill.use();
//        调用接口中的抽象方法
        System.out.println("释放技能完成.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
}
