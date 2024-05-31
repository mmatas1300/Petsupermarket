import { useState } from "react";
import { createUser } from "../../Utils/data";
import { useFormAlert } from "../../hooks/useFormAlert";
import { useNavigate } from "react-router-dom";


export const FormSignup = () => {

    const navigate = useNavigate();
    const {isAlert,alertMessage, setAlert,resetAlert} = useFormAlert();
    const [isButtonDisabled, setIsButtonDisabled] = useState(false);

    const handleSignUp = async (event) => {
        setIsButtonDisabled(true);
        resetAlert();
        event.preventDefault();
        const formData = new FormData(event.currentTarget);
        if (validateFormData(formData)){
            const user = {
                nombre: formData.get("nombre"),
                email: formData.get("email"),
                direccion: formData.get("direccion"),
                ciudad: formData.get("ciudad"),
                cp: formData.get("cp"),
                telefono: formData.get("telefono"),
                password: formData.get("password"),
                fechaNacimiento: formData.get("fechaNacimiento")
            }
            const resp = await createUser(user);
            if (!resp.ok) setAlert("Sus datos no son validos, pongase en contacto");
            else {
                setAlert("Registro exitoso");
                setTimeout(()=>{navigate("/login")},1500);
            }
        }
        setIsButtonDisabled(false);

    }

    const validateFormData = (formData) => {
        const emailRegex = /^\w+([\.-]?\w+)+@\w+([\.:]?\w+)+(\.[a-zA-Z0-9]{2,3})+$/;
        const fechaNacimiento = new Date(formData.get("fechaNacimiento")).getFullYear();
        if (formData.get("nombre").length === 0){
            setAlert("Por favor escriba su nombre");
            return false;
        }
        else if (formData.get("nombre").length < 3 || formData.get("nombre").length > 69){
            setAlert("Su nombre es muy largo");
            return false;
        }
        else if (!emailRegex.test(formData.get("email"))){
            setAlert("Por favor escriba un email valido");
            return false;
        }
        else if (formData.get("email").length > 110){
            setAlert("Su correo electrónico es muy largo");
            return false;
        }
        else if (formData.get("direccion").length > 299){
            setAlert("Su dirección es muy larga");
            return false;
        }
        else if (formData.get("ciudad").length > 44){
            setAlert("Su ciudad es muy larga");
            return false;
        }
        else if (formData.get("cp").length > 9){
            setAlert("Su código postal es muy largo");
            return false;
        }
        else if (formData.get("telefono").length<8){
            setAlert("Introduzca un número válido");
            return false;
        }
        else if (formData.get("telefono").length > 29){
            setAlert("Introduzca un número válido");
            return false;
        }
        else if (formData.get("password").length <4){
            setAlert("Su contraseña es muy corta");
            return false;
        }
        else if (formData.get("password").length >16){
            setAlert("Su contraseña es muy larga");
            return false;
        }
        else if (formData.get("password") !== formData.get("passwordConfirm")){
            setAlert("La contraseña no coincide");
            return false;
        }
        else if (!(new Date().getFullYear() - 17 > fechaNacimiento)){
            setAlert("Debe ser mayor de edad para registrarse");
            return false;
        }
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
                <button disabled={isButtonDisabled}>Registrarse</button>
            </div>

        </form>
    );
}