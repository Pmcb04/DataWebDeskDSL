/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Proyecto de la asignatura DMSS
*/

package dao;

import java.util.*;
import model.Producto;


public class ProductoDaoImpl implements ProductoDao
{
	// list is working as a database
	private List<Producto> productos;

	//-------------------------------------------------------------------------------------
	// Metodo constructor de la clase Producto
	//-------------------------------------------------------------------------------------	
	public ProductoDaoImpl(){
		productos = new ArrayList<Producto>();
	}

	//-------------------------------------------------------------------------------------
	// Metodo getAll()
	//-------------------------------------------------------------------------------------
    @Override
    public List<Producto> getAllProductos() {
        return productos;
    }

	//-------------------------------------------------------------------------------------
	// Metodo getProductoByPrecio()
	//-------------------------------------------------------------------------------------
	@Override
    public Producto getProductoByPrecio(int precio) {
        
		Producto producto = new Producto();

		int i = 0;
		boolean enc = false;

		while(i < productos.size() && !enc){
			if(productos.get(i).getPrecio() == precio){
				producto = productos.get(i);
				enc = true;
			}
		}

		return producto;
	}

	//-------------------------------------------------------------------------------------
	// Metodo getProductoByNombre()
	//-------------------------------------------------------------------------------------
	@Override
    public Producto getProductoByNombre(String nombre) {
        
		Producto producto = new Producto();

		int i = 0;
		boolean enc = false;

		while(i < productos.size() && !enc){
			if(productos.get(i).getNombre().equals(nombre)){				producto = productos.get(i);
				enc = true;
			}
		}

		return producto;
	}

	//-------------------------------------------------------------------------------------
	// Metodo getProductoByCategoria()
	//-------------------------------------------------------------------------------------
	@Override
    public Producto getProductoByCategoria(String categoria) {
        
		Producto producto = new Producto();

		int i = 0;
		boolean enc = false;

		while(i < productos.size() && !enc){
			if(productos.get(i).getCategoria().equals(categoria)){				producto = productos.get(i);
				enc = true;
			}
		}

		return producto;
	}

	//-------------------------------------------------------------------------------------
	// Metodo getProductoByIdentificador()
	//-------------------------------------------------------------------------------------
	@Override
    public Producto getProductoByIdentificador(int identificador) {
        
		Producto producto = new Producto();

		int i = 0;
		boolean enc = false;

		while(i < productos.size() && !enc){
			if(productos.get(i).getIdentificador() == identificador){
				producto = productos.get(i);
				enc = true;
			}
		}

		return producto;
	}



	//-------------------------------------------------------------------------------------
	// Metodo save()
	//-------------------------------------------------------------------------------------
	@Override
    public void saveProducto(Producto producto) {
        productos.add(producto);
    }

	//-------------------------------------------------------------------------------------
	// Metodo delete()
	//-------------------------------------------------------------------------------------
    @Override
    public void deleteProducto(Producto producto) {
         productos.remove(producto);
    }
}
