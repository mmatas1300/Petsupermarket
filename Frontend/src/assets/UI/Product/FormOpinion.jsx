import { Rating } from "@mui/material";
import { useState } from "react";
import { Star as StarIcon } from 'lucide-react';

export const FormOpinion = () => {

    const [starValue, setStarValue] = useState(0);

    const handleSubmit = (event) => {
        event.preventDefault();
        const formData = new FormData(event.currentTarget);
        console.log(formData.get("comentario"));
        console.log(starValue)
    }
    
    return (
        <form onSubmit={handleSubmit} className="w-75 d-flex flex-column justify-content-center align-items-center py-3">
            <textarea className="w-95 my-2" type="text" name="comentario" placeholder="Danos tu opinión del producto" />
            <Rating name="simple-controlled" value={starValue} icon={<StarIcon color="#008f7a"/>}
                onChange={(event, newValue) => {
                    setStarValue(newValue);
                }}
            />
            <button className="my-2" type="submit">Enviar</button>
        </form>
    );
}