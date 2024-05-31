import { useState } from "react";
import { FormAlert } from "../Components/FormAlert";


export const useFormAlert = ()=>{
    const [isAlert, setIsAlert] = useState(false);
    const [alertMessage, setAlertMessage] = useState("");

    const setAlert = (message)=>{
        setIsAlert(true);
        setAlertMessage(<FormAlert>{message}</FormAlert>)
        
    }

    const resetAlert = ()=>{
        setIsAlert(false);
        setAlertMessage("");
    }

    return  {isAlert, alertMessage, setAlert, resetAlert}
}