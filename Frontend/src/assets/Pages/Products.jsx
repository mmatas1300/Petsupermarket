import { CategoryButton } from "../UI/Products/CategoryButton";
import { GridProducts } from "../UI/Products/GridProducts";

export default function Products() {
    return (<>
        <div className="bg-filters container-fluid">
            <div className="row py-3 align-items-center">
                <div className="col-4 col-lg-2">
                    <div className="background-card">
                        Filtros
                    </div>
                </div>
                <div className="col-4 col-lg-5">
                    <CategoryButton animal={"Perritos"} img={"perro"} />
                </div>
                <div className="col-4 col-lg-5">
                    <CategoryButton animal={"Gatitos"} img={"gato"} />
                </div>
            </div>
        </div>

        <div className="container-fluid">
            <div className="row">
                <div className="col-4 col-lg-2 bg-filters">
                        <div className="d-flex flex-row justify-content-start align-items-center my-3">
                            <input className="form-check-input me-2 mt-1" type="checkbox" defaultValue="" id="flexCheckDefault"/>
                            <label className="form-check-label mt-1 text-truncate d-block d-lg-inline-block" htmlFor="flexCheckDefault">
                                Novedades
                            </label>

                        </div>
                        <div className="d-flex flex-row justify-content-start align-items-center my-3">
                            <input className="form-check-input me-2" type="checkbox" defaultValue="" id="flexCheckChecked" defaultChecked="" />
                            <label className="form-check-label mt-1" htmlFor="flexCheckChecked">
                                Ofertas
                            </label>

                        </div>

                        <div className="text-center background-card">Marcas</div>

                        <div className="d-flex flex-row justify-content-start align-items-center my-3">
                            <input className="form-check-input me-2 mt-1" type="checkbox" defaultValue="" id="flexCheckDefault"/>
                            <label className="form-check-label mt-1 text-truncate d-block d-lg-inline-block" htmlFor="flexCheckDefault">
                                Royal Cannin
                            </label>

                        </div>
                        <div className="d-flex flex-row justify-content-start align-items-center my-3">
                            <input className="form-check-input me-2" type="checkbox" defaultValue="" id="flexCheckChecked" defaultChecked="" />
                            <label className="form-check-label mt-1" htmlFor="flexCheckChecked">
                                Purina
                            </label>
                        </div>

                </div>
                <div className="col-8 col-lg-10">
                    <GridProducts />
                </div>
            </div>
        </div>
    </>
    )
}