package acm;
import java.math.*;  
import java.util.*;  
public class QingDao{  
  
    public static Map<String,Boolean> mp=new HashMap<String,Boolean>();  
    public static int nxt[]=new int[31],calc[]=new int[31],t=0;  
    public static BigInteger ans,m,n;  
      
    public static String turn_to(int nxt[])                 //为了使用Map的方便，我把每种置换转化为String作为键值存  
    {                                   //这样省去了写结构体和重载运算符，况且Java好像不支持这个  
        String res=new String();  
        for(int i=1;i<=30;i++)                       //把置换转化为String  
            if (nxt[i]<10) res+="0"+nxt[i];  
                else res+=""+nxt[i];  
        return res;  
    }  
      
    public static void turn_back(String x)                  //把String转化回置换  
    {  
        for(int i=0;i<60;i+=2)  
            nxt[i/2+1]=(int)(x.charAt(i)-48)*10+(int)x.charAt(i+1)-48;  
    }  
      
    public static int cal()                         //计算置换的循环数  
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
      
    public static int[] Rotate()                        //整体向左旋转90°，好好想清楚，不要写错了  
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
      
    public static int[] Turn_Left()                     //某一条边旋转180°  
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
      
    public static int[] Reverse()                       //面整体翻转180°  
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
      
    public static void gettransformation()                  //广搜搜索所有的置换  
    {  
        Queue<String> q=new LinkedList<String>();  
        String s=turn_to(nxt); mp.put(s,true); q.offer(s);  
        while(!q.isEmpty())  
        {  
            String now=q.poll();  
            turn_back(now); t++;                    //统计置换数  
            s=turn_to(Rotate());  
            if (!mp.containsKey(s))                 //判定该置换是否已经存在  
            {  
                mp.put(s,true); q.offer(s);         //不存在则拓展  
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
        for(Map.Entry<String,Boolean> it:mp.entrySet())           //遍历所有的置换，并且求出循环数  
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
            for(int i=1;i<=30;i++)                   //对于每一个循环数，计算其对应置换的答案  
            {  
                p=p.multiply(n);  
                ans=ans.add(p.multiply(BigInteger.valueOf(calc[i])));   //循环数为x的置换数*n^x  
            }  
            ans=ans.divide(BigInteger.valueOf(t)).mod(m);           //除以总的置换数并且取模  
            System.out.println(ans);  
        }  
    }  
}  