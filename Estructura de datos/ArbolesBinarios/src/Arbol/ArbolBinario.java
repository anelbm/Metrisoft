package Arbol;

public class ArbolBinario {
	NodoArbol raiz;
	
	public ArbolBinario(){
		raiz=null;
	}

	public void agregarNodo(int d, String nom){
		NodoArbol nuevo=new NodoArbol(d, nom);
		if(raiz==null){
			raiz=nuevo;
		}else{
			NodoArbol padre,aux=raiz;
			while(true){
				padre=aux;
				if(d<aux.dato){
					aux=aux.hijoIzquierdo;
				}if(aux==null){
					padre.hijoIzquierdo=nuevo;
					return;
				}else{
					aux=aux.hijoDerecho;
					if(aux==null){
						padre.hijoDerecho=nuevo;
						return;
					}
					
				}
			}
		}
	}

	public boolean estaVacio(){
		return raiz==null;
	}
	public void inOrden (NodoArbol r){
		if (r!=null){
			inOrden(r.hijoIzquierdo);
			System.out.println(r.dato + ",");
			inOrden(r.hijoDerecho);
		}
	}
	public void preOrden (NodoArbol r){
		if (r!=null){
			System.out.println(r.dato + ",");
			preOrden(r.hijoIzquierdo);
			preOrden(r.hijoDerecho);
		}
	}
	public void postOrden (NodoArbol r){
		if (r!=null){
			preOrden(r.hijoIzquierdo);
			preOrden(r.hijoDerecho);
			System.out.println(r.dato + ",");
		}
	}
}
