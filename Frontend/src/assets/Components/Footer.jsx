import { Link } from "react-router-dom";

export default function Footer() {
    return (
        <footer className="d-flex flex-column justify-content-center align-items-center">
            <div className="mt-4">
                <Link to={'/'}><img src="/logo.png" alt="petsupermarket logo" width={100} /></Link>
            </div>
            <div className="mt-4">
                <a href="https://www.facebook.com/profile.php?id=61554222387300"><i className="fi fi-brands-facebook"></i></a>
                <a href="https://www.instagram.com/petsupermarket.contactanos/"><i className="fi fi-brands-instagram"></i></a>
                <a href="https://twitter.com/SupermarketPet"><i className="fi fi-brands-twitter-alt-circle"></i></a>
                <a href="https://www.tiktok.com/@petsupermarket.contacten?lang=es"><i className="fi fi-brands-tik-tok"></i></a>
            </div>

            <span className="text-center mx-4">Calz. de Tlalpan 1545, Portales Nte, Benito Juárez, 03600 Ciudad de México, CDMX.</span>
            <span className="text-center mx-4 mb-4">Teléfono: 55-34-23-45-56 Email:petsupermarket.contactanos@gmail.com</span>
        </footer>
    );
}