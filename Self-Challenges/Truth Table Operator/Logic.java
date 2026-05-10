
public class Logic{
    public boolean idempotentOr(boolean p){
        return p == (p || p);
    }
    
    public boolean idempotentAnd(boolean p){
        return p == (p && p);
    }

    public boolean associativeOr(boolean p, boolean q, boolean r){
        return ((p || q) || r) == (p || (q || r));
    }

    public boolean associativeAnd(boolean p, boolean q, boolean r){
        return ((p && q) && r) == (p && (q && r));
    }

    public boolean commutativeOr(boolean p, boolean q){
        return (p || q) == (q || p);
    }

    public boolean commutativeAnd(boolean p, boolean q){
        return (p && q) == (q && p);
    }

    public boolean distributiveOr(boolean p, boolean q, boolean r){
        return p || (q && r) == (p || q) && (p || r);
    }
    public boolean distributiveAnd(boolean p, boolean q, boolean r){
        return p && (q || r) == (p && q) || (p || r);
    }



	public static void main(String[] args){



    }
}