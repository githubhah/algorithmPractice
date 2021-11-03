/**
 * 算法概述练习
 */
public class Demo01<eat3> {
    public static void main(String[] args) {
        eat4(3);
    }

    //线性执行   T(n)=3n
    public static void eat1(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("等待1分钟");
            System.out.println("等待2分钟");
            System.out.println("吃1cm面包");
        }
    }

    //对数计算  T(n)=5logn
    public static void eat2(int n) {
        for (int i = n; i > 1; i /= 2) {
            System.out.println("等待1分钟");
            System.out.println("等待2分钟");
            System.out.println("吃一半面包");
        }
    }

    //常量计算T(n)=2
    public static void eat3(int n) {
        System.out.println("等待1分钟");
        System.out.println("等待2分钟");
        System.out.println("吃一半面包");
    }

    //多项式计算  T(n)=0.5n*2 + 0.5n
    public static void eat4(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println("等待1分钟");
                System.out.println("等待2分钟");
            }
        System.out.println("吃一半面包");
        }

    }
}
