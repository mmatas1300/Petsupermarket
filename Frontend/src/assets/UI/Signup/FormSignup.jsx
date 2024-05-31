import { useState } from "react";
import { useFormAlerta } from "../../Utils/hooks/useFormAlert";



export const FormSignup = () => {

    const {isAlert,alertMessage, setAlert,resetAlert} = useFormAlerta();

    const handleSignUp = async (event) => {
        resetAlert();
        event.preventDefault();
        const formData = new FormData(event.currentTarget);
        if (validateFormData(formData)) console.log("true")
    }

    const validateFormData = (formData) => {
        if (formData.get("nombre").length === 0){
            setAlert("Por favor escriba su nombre");
            return false;
        }
        else if (formData.get("nombre").length < 3 || formData.get("nombre").length > 69)
            return false;
        else if (formData.get("email"))
            return true;
    }

    return (
        <form onSubmit={handleSignUp} className="p-4 row mx-3">
            <h2 className="text-center">Registrate</h2>
            <div className="col-12 col-lg-6 mt-1">
                <label htmlFor="nombre">Nombre:</label>
                <input className="w-100" type="text" name="nombre" />
            </div>
            <div className="col-12 col-lg-6 mt-1">
                <label htmlFor="email">Email:</label>
                <input className="w-100" type="text" name="email" />
            </div>

            <div className="col-12 col-lg-6 mt-1">
                <label htmlFor="direccion">Dirección:</label>
                <input className="w-100" type="text" name="direccion" />
            </div>

            <div className="col-12 col-lg-6 mt-1">
                <label htmlFor="name=ciudad">Ciudad:</label>
                <input className="w-100" type="text" name="ciudad" />
            </div>

            <div className="col-12 col-lg-6 mt-1">
                <label htmlFor="cp">Codigo postal:</label>
                <input className="w-100" type="text" name="cp" />
            </div>

            <div className="col-12 col-lg-6 mt-1">
                <label htmlFor="telefono">Teléfono:</label>
                <input className="w-100" type="text" name="telefono" />
            </div>

            <div className="col-12 col-lg-6 mt-1">
                <label htmlFor="password">Contraseña:</label>
                <input className="w-100" type="password" name="password" />
            </div>

            <div className="col-12 col-lg-6 mt-1">
                <label htmlFor="passwordConfirm">Repetir contraseña:</label>
                <input className="w-100" type="password" name="passwordConfirm" />
            </div>

            <div className="col-12 col-lg-6 mt-1">
                <label htmlFor="fechaNacimiento">Fecha de nacimiento:</label>
                <input className="w-100" type="date" name="fechaNacimiento" />
            </div>

            {isAlert?(alertMessage):(<></>)}

            <div className="col-12 text-center mt-3">
                <button>Registrarse</button>
            </div>

        </form>
    );
}