package acm;
import java.math.*;  
import java.util.*;  
public class QingDao{  
  
    public static Map<String,Boolean> mp=new HashMap<String,Boolean>();  
    public static int nxt[]=new int[31],calc[]=new int[31],t=0;  
    public static BigInteger ans,m,n;  
      
    public static String turn_to(int nxt[])                 //Ϊ��ʹ��Map�ķ��㣬�Ұ�ÿ���û�ת��ΪString��Ϊ��ֵ��  
    {                                   //����ʡȥ��д�ṹ������������������Java����֧�����  
        String res=new String();  
        for(int i=1;i<=30;i++)                       //���û�ת��ΪString  
            if (nxt[i]<10) res+="0"+nxt[i];  
                else res+=""+nxt[i];  
        return res;  
    }  
      
    public static void turn_back(String x)                  //��Stringת�����û�  
    {  
        for(int i=0;i<60;i+=2)  
            nxt[i/2+1]=(int)(x.charAt(i)-48)*10+(int)x.charAt(i+1)-48;  
    }  
      
    public static int cal()                         //�����û���ѭ����  
    {  
        int res=0;  
        boolean v[]=new boolean[31];  
        for(int i=1;i<=30;i++)  
            if (!v[i])  
            {  
                for(int j=i;!v[j];j=nxt[j]) v[j]=true;  
                res++;  
            }  
        return res;  
    }  
      
    public static int[] Rotate()                        //����������ת90�㣬�ú����������Ҫд����  
    {  
        int nxe[]=new int[31];  
        System.arraycopy(nxt,1,nxe,1,30);  
        for(int i=7;i<=9;i++)  
        {  
            nxe[i]=nxt[i+15];  
            nxe[i+15]=nxt[i];  
        }  
        nxe[12]=nxt[27];nxe[27]=nxt[12];  
        nxe[28]=nxt[30];nxe[30]=nxt[28];  
        return nxe;  
    }  
      
    public static int[] Turn_Left()                     //ĳһ������ת180��  
    {  
        int nxe[]=new int[31];  
        nxe[1]=nxt[3];nxe[2]=nxt[6];  
        nxe[3]=nxt[9];nxe[6]=nxt[8];  
        nxe[9]=nxt[7];nxe[8]=nxt[4];  
        nxe[7]=nxt[1];nxe[4]=nxt[2];  
          
        nxe[15]=nxt[12];nxe[10]=nxt[30];  
        nxe[11]=nxt[29];nxe[12]=nxt[28];  
        nxe[30]=nxt[27];nxe[29]=nxt[26];  
        nxe[28]=nxt[25];nxe[27]=nxt[13];  
        nxe[26]=nxt[14];nxe[25]=nxt[15];  
        nxe[13]=nxt[10];nxe[14]=nxt[11];  
          
        nxe[16]=nxt[22];nxe[19]=nxt[23];  
        nxe[22]=nxt[24];nxe[23]=nxt[21];  
        nxe[24]=nxt[18];nxe[21]=nxt[17];  
        nxe[18]=nxt[16];nxe[17]=nxt[19];  
          
        nxe[5]=nxt[5];nxe[20]=nxt[20];  
        return nxe;  
    }  
      
    public static int[] Reverse()                       //�����巭ת180��  
    {  
        int nxe[]=new int[31];  
        for(int i=1;i<=12;i++)  
        {  
            nxe[i]=nxt[i+15];  
            nxe[i+15]=nxt[i];  
        }  
        nxe[15]=nxt[13];nxe[13]=nxt[15];  
        nxe[28]=nxt[30];nxe[30]=nxt[28];  
        nxe[14]=nxt[14];nxe[29]=nxt[29];  
        return nxe;  
    }  
      
    public static void gettransformation()                  //�����������е��û�  
    {  
        Queue<String> q=new LinkedList<String>();  
        String s=turn_to(nxt); mp.put(s,true); q.offer(s);  
        while(!q.isEmpty())  
        {  
            String now=q.poll();  
            turn_back(now); t++;                    //ͳ���û���  
            s=turn_to(Rotate());  
            if (!mp.containsKey(s))                 //�ж����û��Ƿ��Ѿ�����  
            {  
                mp.put(s,true); q.offer(s);         //����������չ  
            }  
            s=turn_to(Turn_Left());  
            if (!mp.containsKey(s))   
            {  
                mp.put(s,true); q.offer(s);  
            }  
            s=turn_to(Reverse());  
            if (!mp.containsKey(s))   
            {  
                mp.put(s,true); q.offer(s);  
            }  
        }  
    }  
      
    public static void main(String[] args)  
    {  
        Scanner cin=new Scanner(System.in);  
        int T_T=cin.nextInt(),tot=0;  
        for(int i=1;i<=30;i++)  
            nxt[i]=i;  
        gettransformation();  
        for(Map.Entry<String,Boolean> it:mp.entrySet())           //�������е��û����������ѭ����  
        {  
            turn_back(it.getKey());  
            calc[cal()]++;  
        }  
        for(int T=1;T<=T_T;T++)  
        {  
            ans=BigInteger.ZERO;  
            n=cin.nextBigInteger();  
            m=cin.nextBigInteger();  
            BigInteger p=BigInteger.ONE;  
            for(int i=1;i<=30;i++)                   //����ÿһ��ѭ�������������Ӧ�û��Ĵ�  
            {  
                p=p.multiply(n);  
                ans=ans.add(p.multiply(BigInteger.valueOf(calc[i])));   //ѭ����Ϊx���û���*n^x  
            }  
            ans=ans.divide(BigInteger.valueOf(t)).mod(m);           //�����ܵ��û�������ȡģ  
            System.out.println(ans);  
        }  
    }  
}  