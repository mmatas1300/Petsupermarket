import { Value } from "../UI/About/Value";

export default function About() {
    return (
        <div className="container-fluid text-center">
            <div className="row">
                <div className="mt-4">
                    <img src="/logo.png" alt="Logo petsupermarket" width={200} />
                </div>
            </div>
            <div className="row justify-content-center my-3">
                <div className="w-75">Nuestra plataforma nace de la preocupación por el bienestar de
                    perros y gatos, ofreciendo productos y servicios de alta calidad que
                    priorizan su salud y comodidad. Nos esforzamos por ser una opción
                    accesible para dueños comprometidos y profesionales del cuidado
                    animal, proporcionando una experiencia de compra enfocada en el amor
                    y el cuidado de las mascotas.
                </div>
            </div>
            <div className="row mision-container my-5 py-4 mx-5">
                <div className="col-12 col-md-6">
                    <h1>Misión</h1>
                    <p className="mx-3">
                        Brindar a los dueños de animales de compañía (perros y gatos) una experiencia de compra satisfactoria al ofrecer productos y servicios enfocados a la salud y comodidad de sus mascotas.
                    </p>
                </div>
                <div className="col-12 col-md-6">
                    <h1 className="mt-3 mt-lg-0">Visión</h1>
                    <p className="mx-3">
                        Nos vemos como una plataforma líder en el comercio de productos para mascotas, aspiramos a ser la primera opción para la adquisición de artículos que beneficien a perros y gatos, contribuyendo al cuidado y amor que amerita cada mascota.
                    </p>
                </div>
            </div>

            <div className="row my-5 mx-5">
                <div className="col-12 my-3">
                    <h1>Valores</h1>
                </div>
                <Value name={"Calidad"} img={"certificate"} cols={"col-12 col-md-4"}>Buscamos que nuestros clientes tengan la confianza de que están recibiendo lo mejor para sus animales de compañía.</Value>
                <Value name={"Transparencia"} img={"transparency"} cols={"col-12 col-md-4"}>Protegemos la privacidad y los datos proporcionados por nuestros clientes.</Value>
                <Value name={"Innovación"} img={"idea"} cols={"col-12 col-md-4"}> Mantenemos la disposición para adaptarnos rápidamente a los cambios, necesidades del mercado y tendencias en la industria de las mascotas.</Value>
                <Value name={"Responsabilidad social y ambiental"} img={"growth"} cols={"col-12 col-md-6"}>Compromiso con el bienestar de las mascotas: priorizamos el bienestar de las mascotas. Tratamos de compartir prácticas y productos que beneficien la vida de los animales.</Value>
                <Value name={"Trabajo en Equipo"} img={"team"} cols={"col-12 col-md-6"}>Promovemos la colaboración y comunicación entre los integrantes de nuestro equipo para garantizar un servicio integral a nuestros clientes.</Value>
            </div>



        </div>
    );
}



