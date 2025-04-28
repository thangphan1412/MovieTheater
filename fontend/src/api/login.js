import axios  from "axios";
const API_URL = 'http://localhost:8080/api/v1/auth';
export const login = async (email, password) =>{
    try {
        const respones = await axios.post(`${API_URL}/authenticate`,{
            email: email,
            password: password
        },{
            headers: {
                'Content-Type': 'application/json'
            }
        });
        localStorage.setItem("token", respones.data.token);
        return respones.data;
    } catch (error){
        throw error;
    }
}