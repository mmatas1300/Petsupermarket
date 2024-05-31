import { Link } from "react-router-dom";
import { useFormAlert } from "../../hooks/useFormAlert";
import { useNavigate } from "react-router-dom";
import { login } from "../../Utils/data";
import { useState } from "react";
import Cookies from "universal-cookie";

export const FormLogin = ()=>{

    const navigate = useNavigate();
    const {isAlert,alertMessage, setAlert,resetAlert} = useFormAlert();
    const [isButtonDisabled, setIsButtonDisabled] = useState(false);

    const validateFormData = (formData) => {
        const emailRegex = /^\w+([\.-]?\w+)+@\w+([\.:]?\w+)+(\.[a-zA-Z0-9]{2,3})+$/;
        if (!emailRegex.test(formData.get("email"))){
            setAlert("Por favor escriba un email valido");
            return false;
        }
        else if (formData.get("email").length > 110){
            setAlert("Su correo electrónico es muy largo");
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
            return true;
    }

    const handleSubmit = async (event)=>{
        setIsButtonDisabled(true);
        event.preventDefault();
        resetAlert();
        const formData = new FormData(event.currentTarget);
        if(validateFormData(formData)){
            const user ={
                email: formData.get("email"),
                password: formData.get("password")
            }
            const jwt = await login(user);
            if(jwt){
                const cookies = new Cookies();
                cookies.set("session-token", jwt);
                setAlert("Iniciando sesion...")
                setTimeout(()=>{navigate('/');},1500);
            }
            else{
                setAlert("Credenciales invalidas")
            }
        }
        setIsButtonDisabled(false);
    }


    return(
        <form onSubmit={handleSubmit} className="d-flex flex-column p-5 my-5">
            <h2 className="text-center">Entra a tu cuenta</h2>
            <label htmlFor="email">Email:</label>
            <input type="email" name="email" />
            <label htmlFor="password">Contraseña:</label>
            <input type="password" name="password" />
            {isAlert?(alertMessage):(<></>)}
            <button disabled={isButtonDisabled} className="mt-3">Entrar</button>
            <p className="mt-3">Si aún no tienes cuenta registrate <Link to={'/signup'}>aqui</Link></p>
        </form>
    );
}