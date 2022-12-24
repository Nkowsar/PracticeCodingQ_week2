class Square extends Rectangle
{
    Square(String color, int side) 													// Constructor 
    {
        super(color, side, side);
    }

    @Override
    public double calculateArea() 													// Calculating Area 
    {
        return super.length * super.width;
    }
    @Override
    public double calculatePerimeter() 													// Calculating Perimeter 
	{
        return 2 * (super.length + super.width);
    }

}
