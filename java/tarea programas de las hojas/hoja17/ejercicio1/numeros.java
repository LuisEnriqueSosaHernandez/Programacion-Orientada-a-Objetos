
public class numeros {
    int x,y;
    
    public void setX(int x)
    {
        this.x=x;
    }
    
    public int getX()
    {
        return x;
    }
    
    public void setY(int y)
    {
        this.y=y;
    }
    
    public int getY()
    {
        return y;
    }
    
    public int imprime()
    {
        int sum,res,mul;
        mul=x*y;
        res=x-y;
        sum=x+y;
        if (x==y)
        {
            System.out.print("se multiplican por ser iguales: \n"+ mul);
        }
        else if (x>y)
        {
            System.out.print("se restan por ser mayor el 1°: \n"+ res);
        }
        else
        {
            System.out.print("se suman por ser diferentes: \n" + sum);
        }
        return 0;
    }
}
