class Triangle implements Ishape
{
    int height, base;
    String color;

    Triangle(String color, int height, int base)                                                            
    {
        this.color = color;
        this.height = height;
        this.base = base;
    }

    @Override
    public double calculateArea()                                                                      
    {
        return this.height * this.base;
    }

    @Override
    public double calculatePerimeter()                                                                      
    {
        return (this.height + this.base) + Math.sqrt(this.height ^ 2 + this.base ^ 2);
    }
}
