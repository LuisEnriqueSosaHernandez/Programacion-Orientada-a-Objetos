class numero 
{
    int a;
    int b;
    int c;
    
    public void setA(int a)
    {
        this.a=a;
    }
    public int getA()
    {
        return a;
    }
    public void setB(int b)
    {
        this.b=b;
    }
    public int getB()
    {
        return b;
    }
    public void setC(int c)
    {
        this.c=c;
    }
    public int getC()
    {
        return c;
    }
    
    int me;
   
    public int Mayor()
    {
        if(a>b)
        {
            if (a>c)
            {
                me=a;
            }
        
            else
            {
                me=c;
            }
        }
        else if(b>c)
        {
            me=b;
        }
        else
        {
        me=c;
        }
        return me;
    }
}