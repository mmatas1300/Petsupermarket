import { Link } from "react-router-dom";

export const ProductCard = ({ producto }) => {
    return (
        <div className="productCard p-2 m-2">
            <Link to={`/productos/${producto.id}`} className="d-flex flex-column justify-content-center align-items-center">
                <img src={producto.imagen} alt={producto.nombre} height={170} className="m-1" />
                <p className="mt-3 text-wrap text-center">{`${producto.marca} ${producto.nombre} ${producto.contenido}`}</p>
                {producto.descuento !== 0 ? (<>
                    <p className="oferta-card d-inline">En oferta</p>
                    <p className="text-decoration-through">{`$${(producto.precio).toFixed(2)}`}</p>
                    <p className="mb-2">{`$${(producto.precio * (100 - producto.descuento) / 100).toFixed(2)}`}</p>
                </>
                ) : (<p className="mb-2">{`$${(producto.precio).toFixed(2)}`}</p>)}
            </Link>
        </div>
    );
};