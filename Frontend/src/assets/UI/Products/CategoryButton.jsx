export const CategoryButton = ({animal,img}) => {
    return (
        <div className="dropdown-center">
            <button className="dropdown-toggle d-flex flex-row justify-content-center align-items-center" type="button" data-bs-toggle="dropdown" aria-expanded="false">
                <img src={`/icons/${img}-categoria.png`} alt={animal} width={50} className="d-none d-lg-block me-4" />
                {animal}
            </button>
            <ul className="dropdown-menu w-75">
                <li>
                    <a className="dropdown-item" href="#">Juguetes</a>
                </li>
                <li>
                    <a className="dropdown-item" href="#">Alimento</a>
                </li>
                <li>
                    <a className="dropdown-item" href="#">Accesorios</a>
                </li>
            </ul>
        </div>

    );
}