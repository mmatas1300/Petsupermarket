import { useParams } from "react-router-dom";
import { productos } from "../Utils/placeholderData";
import { ProductInfo } from "../UI/Product/ProductInfo";
import { Opinion } from "../UI/Product/Opinion";

export default function Products() {
    const { productId } = useParams();
    const producto = productos.find((producto) => { return producto.id == productId });


    return (
        <>
            <ProductInfo producto={producto}/>

            <div className="d-flex flex-column justify-content-center align-items-center my-5">
                <h2>Comentarios y calificaciones</h2>
                <Opinion/>
            </div>
        </>
    );
}