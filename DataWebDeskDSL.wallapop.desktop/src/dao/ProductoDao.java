/*
	Autores : Pedro Miguel Carmona Broncano && Ruben Marin Lucas
	Proyecto de la asignatura DMSS
*/

package dao;

import java.util.List;
import model.Producto;

public interface ProductoDao
{
	List<Producto> getAllProductos();
	Producto getProductoByPrecio(int precio);
	Producto getProductoByNombre(String nombre);
	Producto getProductoByCategoria(String categoria);
	Producto getProductoByIdentificador(int identificador);
	void saveProducto(Producto producto);
	void deleteProducto(Producto producto);
}
