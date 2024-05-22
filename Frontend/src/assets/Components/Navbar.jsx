import { Link } from "react-router-dom";
import { Search as SearchIcon, CircleUserRound as UserIcon } from 'lucide-react';

export default function Navbar() {
    return (
        <nav className="navbar navbar-expand-lg">
            <div className="d-flex flex-wrap justify-content-between d-lg-flex flex-lg-nowrap flex-lg-row mx-5 w-100">
                <div className="order-1">
                    <Link to={'/'}><img src="/logo.png" alt="petsupermarket logo" width={100} /></Link>
                </div>
                <div className="order-2 align-self-center mx-3">
                    <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                        <span className="navbar-toggler-icon" />
                    </button>
                </div>

                <div className="order-3 collapse navbar-collapse d-lg-flex justify-content-lg-around align-items-lg-center" id="navbarSupportedContent">
                    <div class="d-flex flex-column d-lg-flex flex-lg-row justify-content-lg-around align-items-lg-center w-100">
                        <ul className="navbar-nav order-1 order-lg-0">
                            <li className="nav-item ml-3">
                                <Link to={'/'}>Inicio</Link>
                            </li>
                            <li className="nav-item mx-3">
                                <Link to={'/productos'}>Productos</Link>
                            </li>
                            <li className="nav-item mx-3 d-lg-none">
                                <Link to={'/nosotros'}>Mi cuenta</Link>
                            </li>
                            <li className="nav-item mx-3">
                                <Link to={'/contacto'}>Contacto</Link>
                            </li>
                            <li className="nav-item mr-3">
                                <Link to={'/nosotros'}>Nosotros</Link>
                            </li>
                        </ul>
                        <form className="order-0 order-lg-1 text-center my-3 bg-none" role="search">
                            <input className="me-2 searchNavbar" type="text" placeholder="Busca tus productos" aria-label="Search"/>
                            <button className="search-button" type="submit">
                                <SearchIcon size={20} />
                            </button>
                        </form>
                    </div>
                </div>
                <div className="d-flex flex-row align-items-center order-0  d-lg-flex flex-lg-row align-items-lg-center order-lg-3 mx-2">
                    <div className="mx-2">
                        <img src="/icons/cart.png" alt="cart" width={60} />
                    </div>
                    <div className="d-none d-lg-block">
                        <UserIcon size={40} />
                    </div>
                </div>
            </div>

        </nav>
    );
};