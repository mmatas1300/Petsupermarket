import { FormContact } from "../UI/Contact/FormContact";

export default function Contact() {
    return (
        <div className="my-5 container">
            <div className="row">
                    <FormContact />
            </div>
            <div className="row text-center my-4">
                <h2>Tambien puedes buscarnos en:</h2>
                <div className="mt-4">
                    <a href="https://www.facebook.com/profile.php?id=61554222387300"><i className="fi fi-brands-facebook"></i></a>
                    <a href="https://www.instagram.com/petsupermarket.contactanos/"><i className="fi fi-brands-instagram"></i></a>
                    <a href="https://twitter.com/SupermarketPet"><i className="fi fi-brands-twitter-alt-circle"></i></a>
                    <a href="https://www.tiktok.com/@petsupermarket.contacten?lang=es"><i className="fi fi-brands-tik-tok"></i></a>
                </div>
                <div className="w-75 mx-auto my-2">
                    o en Calz. de Tlalpan 1545, Portales Nte, Benito Juárez, 03600 Ciudad de México, CDMX. de lunes a viernes de 7 a.m. a 5 p.m.
                </div>
            </div>


        </div>

    );
}