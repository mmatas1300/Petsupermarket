import { ProductCard } from "../../Components/ProductCard";
import { productos } from "../../Utils/placeholderData";

export const GridProducts = ()=>{
    return(
        <div className="d-flex flex-row flex-wrap justify-content-center align-items-start">
            {productos.map((producto)=>{
                return <ProductCard producto={producto} key={producto.id}/>
            })}
        </div>
    );
}