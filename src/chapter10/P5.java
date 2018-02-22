package chapter10;

public class P5 {
		  public static void main(String[] args) {
		    StackOfIntegers stack = new StackOfIntegers(2);
		    java.util.Scanner input = new java.util.Scanner(System.in);


		    System.out.print("Enter an integer: ");
		    int number = input.nextInt();

		    System.out.println("The factors for " + number + " is");

		    int factor = 2;
		    while (factor <= number) {
		      if (number % factor == 0) {
		        number = number / factor;
		        stack.push(factor);
		      }
		      else {
		        factor++;
		      }
		    }

		    // Display factors
		    while (!stack.empty()) {
		      System.out.print(stack.pop() + " ");
		    }
		  }
		}

class StackOfIntegers {//公共类  
    private int[] elements;//定义权限为private的int型数组elements  
  
    private int size;//定义整型变量size  
    
    public StackOfIntegers() {       /*定义无参构造方法*/    
     //初始栈容量标识=2 
        this(2);
    } 
 
     
    public StackOfIntegers(int capacity) {   //指定栈容量       /*定义有参构造方法*/  
        elements = new int[capacity];            //数组elements有capacity个元素  
    }  
  
      
    public int push(int value) {        /*定义public成员方法push,输入整型参数value,返回int型数值*/   //进栈，并返回栈顶数字  
        if (size >= elements.length) {//如果size大于数组长度  
            int[] temp = new int[elements.length + 1];//新建数组temp,并且有elements.length+1个元素  
            System.arraycopy(elements, 0, temp, 0, elements.length);//复制数组？？？这里不懂  
            elements = temp;//将temp值赋给elements  
        }  
  
        return elements[size++] = value;//将数组中第size++个元素的值赋给value并返回  
    }  
  
      
    public int pop() {                  /*定义成员方法pop*/   //出栈，并返回栈顶数字  
        return elements[--size];        //返回第--size个元素  
    }  
  
      
    public int peek() {                     //查询栈顶数字  
        return elements[size - 1];//返回size-1个元素  
    }  
  
  
    public boolean empty() {                //判断栈是否为空  
        return size == 0;//为空时返回  
    }  
  
  
    public int getSize() {                  //返回栈的大小  
        return size;//返回size的值  
    }  
}