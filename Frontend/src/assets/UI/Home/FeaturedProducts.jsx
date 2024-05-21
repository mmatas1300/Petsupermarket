import { Link } from "react-router-dom";
import { productosHome } from "../../Utils/placeholderData";
import { ProductCard } from "../../Components/ProductCard";

export const FeaturedProducts = () => {

    //TODO getFeaturedProducts

    return (
        <div className="d-flex flex-column justify-content-center align-items-center my-4">
            <h1>Productos destacados</h1>
            <div className="d-flex flex-row flex-wrap justify-content-center align-items-center">
                {productosHome.map((producto) => {
                    return <ProductCard producto={producto} />
                })}
            </div>


            <Link to={'/productos'} className="text-center mt-2">
                <button>Ver más productos</button>
            </Link>
        </div>
    );
};