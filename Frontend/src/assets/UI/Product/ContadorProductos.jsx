import { useState } from "react";

export const ContadorProductos = ({existencias})=>{

    const [count, setCount] = useState(1);

    const addProduct = ()=>{
        if(count === existencias)
            setCount(existencias);
        else
            setCount(count+1);
    };

    const removeProduct = ()=>{
        if(count===1)
            setCount(1);
        else
            setCount(count-1);
    };

    return(
        <div className="d-flex flex-row justify-content-center align-items-center my-1">
            <div className="mx-1">
                <button onClick={removeProduct} className="bg-green">-</button>
            </div>
            <h2 className="mx-1">
                {count}
            </h2>
            <div className="mx-1">
                <button onClick={addProduct} className="bg-green">+</button>
            </div>
        </div>
    );
}