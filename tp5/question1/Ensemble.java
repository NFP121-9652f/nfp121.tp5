package question1;

import java.util.*;

public class Ensemble<T> extends AbstractSet<T> {

	protected java.util.Vector<T> table = new java.util.Vector<T>();

	public int size() {
		return table.size();
	}

	public Iterator<T> iterator() {
		return table.iterator();
	}

	//question 1_1
	// ajout de this.add() et this.contains()
	public boolean add(T t) {
		if(this.table.contains(t)){
			return false;
		} else {
			this.table.add(t);
			return true;
		} 
	}
	//la méthode addAll de la super classe va declencher l'ajout de tous les elements de la collection
	
	
	//Union, intersection, différence, différence symétrique
	//Question 1-3
	public Ensemble<T> union(Ensemble<? extends T> e) {
		Ensemble union = new Ensemble();
        union.addAll(this);
        union.addAll(e);
		return null;
	}

	//Question 1-3
	public Ensemble<T> inter(Ensemble<? extends T> e) {
		Ensemble inter = new Ensemble();
		inter.addAll(this);
		inter.retainAll(e);
		
		return inter;
	}

	//Question 1-3
	
	public Ensemble<T> diff(Ensemble<? extends T> e) {
	    Ensemble diff = new Ensemble();
        diff.addAll(this);
        diff.removeAll(this.inter(e));
        return diff; 
	}

	//Question 1-3
	Ensemble<T> diffSym(Ensemble<? extends T> e) {
	    Ensemble diffSym = new Ensemble();
        diffSym.addAll(this.union(e));
        diffSym.removeAll(this.inter(e));
        return diffSym; 
	}
	
}
