package chp2;

import java.util.Random;

//: chp2/TestNewClass.java
/**
 * TestNewClass
 * @author Administrator
 * @version 1
 * @since 20160411
 */
public class TestNewClass {
/**
 * test javadoc
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewClass.hello();
		System.out.println(NewClass.times);
		NewClass.times++;
		NewClass cl = new NewClass();
		cl.show();
		cl.addTimes();
		System.out.println(cl.getTimes());
		System.out.printf("%s\n", "=========================");
		
		// 包装器，自动装箱
		Integer num = 5;
		System.out.println(num++);
		System.out.println(num);
		System.out.printf("%s\n", "=========================");

/*		if(args.length != 3){
			System.out.println("输入3个参数！");
			return;
		}
		for(int i=0; i<3; i++){
			System.out.printf("args[%d] is %s\n", i, args[i]);
		}
*/		System.out.printf("%s\n", "=========================");
		
		TestAlias f1 = new TestAlias();
		TestAlias f2 = new TestAlias();
		f1.f = 1;
		f2.f = 2;
		System.out.printf("f1.f is: %f\nf2.f is: %f\n",f1.f, f2.f);
		f1 = f2;
		f2.f = 5;
		System.out.printf("f1.f is: %f\nf2.f is: %f\n",f1.f, f2.f);
		f1.f = 6;
		System.out.printf("f1.f is: %f\nf2.f is: %f\n",f1.f, f2.f);
		System.out.printf("%s\n", "=========================");

		int i=3;
		// 设置生成器的种子，未赋值则以当前时间作为种子
		Random rand = new Random();
		while(i >= 0)
		{
			// nextInt()设置了上限
			System.out.println("rand is:" + (rand.nextInt(100)+1));
			System.out.println("rand is:" + (rand.nextInt(100)+1));
			i--;
		}
		System.out.printf("%s\n", "=========================");
		TestAlias test = new TestAlias();
		System.out.println("输入距离和时间： ");
		test.l = 100;
		test.f = 3;
		System.out.println("speed is "+test.speed());
/*		// Java中没有sizeof！
		System.out.printf("sizeof(float) is %d",sizeof(float));
*/	
		System.out.printf("%s\n", "=========================");
		float f[] = new float[10];
		for(i=0; i<10; i++){
			f[i] = rand.nextFloat();
		}
		for(float x : f){
			System.out.println(x);
		}
	}
}
/* Output: (55% match)
 * Hello, it's:
 *///:~

class TestAlias{
	float f;
	float l;
	public float speed(){
		return l/f;
	}
}
