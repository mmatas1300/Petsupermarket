import { Stars } from "./Stars";

export const Opinion = ({ comentario }) => {
    return (
        <div className="opinion w-75 p-4 d-flex flex-column justify-content-center align-items-center my-2">
            <div className="d-flex flex-row justify-content-between w-100 my-1">
                <div className="w-50">
                    {comentario.usuario}
                </div>
                <div>
                    {<Stars num={comentario.calificacion}/>}
                </div>
            </div>
            <div>
                {comentario.comentario}
            </div>
        </div>
    );
}