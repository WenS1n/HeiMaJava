package com.vesns.cn.demo03;

/**
 * @author 86504
 */
/**外部类*/
public class Body {
/**成员内部类*/
    public class Heart{
        /**内部类的方法*/
        public void beat() {
            System.out.println("心脏跳动");
            System.out.println("我叫：" + name);
        }
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Body(String name) {
        this.name = name;
    }

    public Body() {
    }

    /**外部类的方法*/
    public void methodBody() {
        System.out.println("外部类的方法");
        new Heart().beat();

    }

}
