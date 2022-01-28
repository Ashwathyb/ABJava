public class Unicorns extends Animal
{
    private String color;

    public Unicorns(String name, char gender, int yob, String color)
    {   super(name, gender, yob);
        this.color = color;
    }

    public String getColor()
    {   return color;
    }

    public void setColor(String color)
    {   this.color = color;
    }

    public void eat()
    {   System.out.println("Munch munch");
    }

    public void talk()
    {   System.out.println("Can We Pretend That Airplanes in The Night Sky are Shooting Stars");
    }

    public void chase()
    {   System.out.println(super.getName() + " rules hell");
    }

    @Override
    public String toString()
    {   return super.toString() + "\tcolor: " + color;
    }
}
