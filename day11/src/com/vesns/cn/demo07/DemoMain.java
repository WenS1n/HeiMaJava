package com.vesns.cn.demo07;

public class DemoMain {

    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("寒冰");

//        hero.setSkill(new SkillImpl());使用单独定义的实现类

        /*Skill skill =new Skill() {
            @Override
        public void use(){
                System.out.println("biu~biu~biu");
            }
        };

        hero.setSkill(skill);
        */

//       进一步简化，同时使用匿名内部类和匿名对象
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("biu~pia~du~biu~pia~bu");
            }
        });

        hero.attack();
    }

}
