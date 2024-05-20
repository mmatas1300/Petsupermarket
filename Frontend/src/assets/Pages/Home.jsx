import { Carousel } from "../UI/Home/Carousel";
import { FeaturedProducts } from "../UI/Home/FeaturedProducts";

export default function Home() {
    return (

        <div className="d-flex flex-column justify-content-center align-items-center mt-4">
            <Carousel />
            <FeaturedProducts />
        </div>





    );
}