export const FormContact = () => {
    return (
        <form className="p-4 container w-75" action="">
            <div className="row">
                <h2>Comunicate con nostros</h2>
                <p>Escribe tu mensaje, nos comunicaremos lo antes posbile</p>
            </div>

            <div className="row mt-2">
                <div className="col-12 col-lg-1 d-flex align-items-center justify-content-start justify-content-lg-end pe-0">
                    <label htmlFor="">Nombre:</label>
                </div>
                <div className="col-12 col-lg-5">
                    <input className="w-100" type="text" />
                </div>
                <div className="col-12 col-lg-1 d-flex align-items-center  justify-content-start justify-content-lg-end pe-0">
                    <label htmlFor="">Correo:</label>
                </div>
                <div className="col-12 col-lg-5">
                    <input className="w-100" type="text" />
                </div>
            </div>


            <div className="row mt-2">
                <div className="col-12">
                    <label htmlFor="">Mensaje:</label>
                </div>
                <div className="col-12">
                    <textarea className="w-100" type="text" />
                </div>
            </div>

            <div className="d-block text-center mt-2">
                <button type="submit">Enviar</button>
            </div>
        </form>
    );
}