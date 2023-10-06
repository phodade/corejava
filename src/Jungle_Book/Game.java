package Jungle_Book;

public class Game {
	public static void main(String[] args)
	{
		 Bear b=new Bear();
		 b.name="Bhaloo";
		 b.eat();
		 b.sleep();
		 b.honeyDring();
		 b.walk();
		 
		 Human h=new Human();
		 h.name="Mowgli";
		 h.walk();
		 h.talk();
		 h.think();
		 h.drink();
		 h.eat();
		 h.sleep();
		 
		 Snake s=new Snake();
		 s.name="kaa";
		 s.sleep();
		 s.eat();
		 s.poison();
		 
		 Tiger t=new Tiger();
		 t.name="Shere Khan";
		 t.hunt();
		 t.walk();
		 t.sleep();
		 t.eat();
		 t.roar();
		 t.drink();
		 
		 Wolf w=new Wolf();
		 w.name="Akela";
		 w.hunt();
		 w.walk();
		 w.sleep();
		 w.bark();
		 w.eat();
		 w.drink();
	}

}
