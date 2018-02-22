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

class StackOfIntegers {//������  
    private int[] elements;//����Ȩ��Ϊprivate��int������elements  
  
    private int size;//�������ͱ���size  
    
    public StackOfIntegers() {       /*�����޲ι��췽��*/    
     //��ʼջ������ʶ=2 
        this(2);
    } 
 
     
    public StackOfIntegers(int capacity) {   //ָ��ջ����       /*�����вι��췽��*/  
        elements = new int[capacity];            //����elements��capacity��Ԫ��  
    }  
  
      
    public int push(int value) {        /*����public��Ա����push,�������Ͳ���value,����int����ֵ*/   //��ջ��������ջ������  
        if (size >= elements.length) {//���size�������鳤��  
            int[] temp = new int[elements.length + 1];//�½�����temp,������elements.length+1��Ԫ��  
            System.arraycopy(elements, 0, temp, 0, elements.length);//�������飿�������ﲻ��  
            elements = temp;//��tempֵ����elements  
        }  
  
        return elements[size++] = value;//�������е�size++��Ԫ�ص�ֵ����value������  
    }  
  
      
    public int pop() {                  /*�����Ա����pop*/   //��ջ��������ջ������  
        return elements[--size];        //���ص�--size��Ԫ��  
    }  
  
      
    public int peek() {                     //��ѯջ������  
        return elements[size - 1];//����size-1��Ԫ��  
    }  
  
  
    public boolean empty() {                //�ж�ջ�Ƿ�Ϊ��  
        return size == 0;//Ϊ��ʱ����  
    }  
  
  
    public int getSize() {                  //����ջ�Ĵ�С  
        return size;//����size��ֵ  
    }  
}