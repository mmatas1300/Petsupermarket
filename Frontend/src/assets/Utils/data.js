export const createUser = async (user)=>{
    try{
        const resp = await fetch('http://localhost:8080/api/usuarios',{
            method: "POST",
            body: JSON.stringify(user),
            headers: {"Content-type": "application/json"}
        });
        return resp;
    } catch(e){
        console.log(e);
    }
}

export const login = async (user)=>{
    const resp = await fetch('http://localhost:8080/api/usuarios/login',{
        headers: {"Content-type": "application/json"},
        body: JSON.stringify(user),
        method: "POST"
    })
    const jwt = await resp.text();
    if (resp.ok) return jwt;
    return null;
}