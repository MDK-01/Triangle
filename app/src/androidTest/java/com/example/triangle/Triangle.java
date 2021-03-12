package  com.example.triangle;

public class Triangle {
    int a;
    int b;
    int c;

    public Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public int geta()
    {
        return  a;
    }
    public  int getb()
    {
        return  b;
    }
    public int getc()
    {
        return c;
    }
    public void seta (int a)
    {
        this.a = a;
    }
    public void setd(int b)
    {
        this.b = b;
    }
    public void setc (int c)
    {
        this.c = c;
    }
    public int getP()
    {
        return a+b+c;
    }
    public double SquareGeron()
    {
        float pp = getP()/2;
        return Math.sqrt(pp*(pp-a)*(pp-b)*(pp-c));
    }
}

