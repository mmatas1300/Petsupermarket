export const Carousel = () => {
    return (
        <div id="carouselExampleInterval" className="carousel slide w-75" data-bs-ride="carousel">
            <div className="carousel-inner">
                <div className="carousel-item active" data-bs-interval={2000}>
                    <img src="/home-carousel/carrusel1lg.png" className="d-none d-md-block w-100" alt="oferta1" />
                    <img src="/home-carousel/carrusel1sm.png" className="d-block d-md-none w-100" alt="oferta1" />
                </div>
                <div className="carousel-item" data-bs-interval={2000}>
                    <img src="/home-carousel/carrusel2lg.png" className="d-none d-md-block w-100" alt="oferta2" />
                    <img src="/home-carousel/carrusel2sm.png" className="d-block d-md-none w-100" alt="oferta2" />
                </div>
                <div className="carousel-item" data-bs-interval={2000}>
                    <img src="/home-carousel/carrusel3lg.png" className="d-none d-md-block w-100" alt="oferta3" />
                    <img src="/home-carousel/carrusel3sm.png" className="d-block d-md-none w-100" alt="oferta3" />
                </div>
            </div>
            <button className="carousel-control-prev" type="button" data-bs-target="#carouselExampleInterval" data-bs-slide="prev">
                <span className="carousel-control-prev-icon" aria-hidden="true" />
                <span className="visually-hidden">Previous</span>
            </button>
            <button className="carousel-control-next" type="button" data-bs-target="#carouselExampleInterval" data-bs-slide="next">
                <span className="carousel-control-next-icon" aria-hidden="true" />
                <span className="visually-hidden">Next</span>
            </button>
        </div>
    );
};