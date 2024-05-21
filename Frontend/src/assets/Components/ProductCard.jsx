export const ProductCard = ({producto})=>{
    return(
        <div className="d-flex flex-column justify-content-center align-items-center productCard p-2 m-2">
            {producto.descuento!==0?(<img src="/icons/descuento.png" width={25}/>):(<></>)}
            <img src={producto.imagen} alt={producto.nombre} width={200} className="m-1" />
            <p className="mt-3 text-wrap">{`${producto.descripcion} ${producto.marca} ${producto.contenido}`}</p>
            {producto.descuento!==0?(<>
                <p className="text-decoration-through">{`$${(producto.precio).toFixed(2)}`}</p>
                <p className="mb-2">{`$${(producto.precio*(100-producto.descuento)/100).toFixed(2)}`}</p>
                </>
            ):(<p className="mb-2">{`$${(producto.precio).toFixed(2)}`}</p>)}

        </div>
    );
};