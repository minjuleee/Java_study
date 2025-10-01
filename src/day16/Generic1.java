package day16;

import java.util.ArrayList;

import utils.Mu;

public class Generic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food ramen = new Food("라면", "영혼없이 끓이거나 뿌셔먹기");
		
		// OldBox
		OldBox ob = new OldBox();
		ob.add(ramen);
		Mu.p(((Food) ob.get(0)).getRecipe());
		
		// NewBox
		NewBox<Food> nb = new NewBox();
		nb.add(ramen);
		Mu.p(nb.get(0).getRecipe());
	}

}

class Food {
	String name;
	String recipe;
	
	Food(String name, String recipe){
		this.name = name;
		this.recipe = recipe;
	}
	
	String getRecipe() {
		return recipe;
	}
}

class OldBox {
	ArrayList items = new ArrayList();
	
	void add(Object o) {
		items.add(o);
	}
	
	Object get(int index) {
		return items.get(index);
	}
}

class NewBox<T> {
	// T, E, (K, V) : T=Type, E=Element, K=Key, V=Value
	ArrayList<T> items = new ArrayList();
	
	void add(T o) {
		items.add(o);
	}
	
	T get(int index) {
		return items.get(index);
	}
}

class StrangeBox<DisneyLand>{
	DisneyLand name;
}




