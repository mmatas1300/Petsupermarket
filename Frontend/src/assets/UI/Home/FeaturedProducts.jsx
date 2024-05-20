import { Link } from "react-router-dom";

export const FeaturedProducts = ()=>{

    //TODO getFeaturedProducts

    return(
        <div className="d-flex flex-column justify-content-center align-item-center mt-4">
            <h1>Productos destacados</h1>

            

            <Link to={'/productos'} className="text-center">
                <button>Ver más productos</button>
            </Link>

        </div>
    );
};