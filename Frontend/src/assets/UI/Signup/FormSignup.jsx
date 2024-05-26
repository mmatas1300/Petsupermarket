
export const FormSignup = () => {
    return (
        <form className="p-4 row mx-3">
            <h2 className="text-center">Registrate</h2>
            <div className="col-12 col-lg-6 mt-1">
                <label htmlFor="">Nombre:</label>
                <input className="w-100" type="text" />
            </div>
            <div className="col-12 col-lg-6 mt-1">
                <label htmlFor="">Email:</label>
                <input className="w-100" type="text" />
            </div>

            <div className="col-12 col-lg-6 mt-1">
                <label htmlFor="">Dirección:</label>
                <input className="w-100" type="text" />
            </div>

            <div className="col-12 col-lg-6 mt-1">
                <label htmlFor="">Ciudad:</label>
                <input className="w-100" type="text" />
            </div>

            <div className="col-12 col-lg-6 mt-1">
                <label htmlFor="">Codigo postal:</label>
                <input className="w-100" type="text" />
            </div>

            <div className="col-12 col-lg-6 mt-1">
                <label htmlFor="">Teléfono:</label>
                <input className="w-100" type="text" />
            </div>

            <div className="col-12 col-lg-6 mt-1">
                <label htmlFor="">Contraseña:</label>
                <input className="w-100" type="password" />
            </div>

            <div className="col-12 col-lg-6 mt-1">
                <label htmlFor="">Repetir contraseña:</label>
                <input className="w-100" type="password" />
            </div>

            <div className="col-12 col-lg-6 mt-1">
                <label htmlFor="">Fecha de nacimiento:</label>
                <input className="w-100" type="date" />
            </div>

            <div className="col-12 text-center mt-3">
                <button>Registrarse</button>
            </div>
            
        </form>
    );
}