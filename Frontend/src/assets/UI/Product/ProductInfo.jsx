export const ProductInfo = ({producto}) => {
    return (
        <div className="d-flex flex-lg-row flex-column justify-content-center align-items-center mt-4">
            <div className="mx-4">
                <img src={producto.imagen} alt={producto.nombre} height={350} />
            </div>

            <div className="w-50">
                <div>
                    <h1>{`${producto.nombre} ${producto.marca} ${producto.contenido}`}</h1>
                </div>
                <div>
                    {producto.descripcion}
                </div>
                <div>
                    Existencias: {producto.existencia}
                </div>
                <div className="text-center mt-3">
                    {producto.descuento !==0?
                        (<> 
                            <p className="oferta-card d-inline">En oferta</p>
                            <div className="my-2">
                                {`Precio de $${(producto.precio).toFixed(2)} a $${(producto.precio * (100 - producto.descuento) / 100).toFixed(2)}`}
                            </div>


                        </>):
                        (<div className="my-2">{`Precio: $${(producto.precio).toFixed(2)}`}</div>)}
                </div>
                <div className="text-center mt-3">
                    <button>Añadir al carrito</button>
                </div>
            </div>
        </div>
    );
}