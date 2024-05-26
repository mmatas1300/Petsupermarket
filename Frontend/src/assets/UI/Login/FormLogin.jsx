import { Link } from "react-router-dom";

export const FormLogin = ()=>{
    return(
        <form className="d-flex flex-column p-5 my-5">
            <h2 className="text-center">Entra a tu cuenta</h2>
            <label htmlFor="email">Email:</label>
            <input type="email" />
            <label htmlFor="password">Contraseña:</label>
            <input type="password" />
            <button className="mt-3">Entrar</button>
            <p className="mt-3">Si aún no tienes cuenta registrate <Link to={'/signup'}>aqui</Link></p>
        </form>
    );
}