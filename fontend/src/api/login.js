import axios  from "axios";
const API_URL = 'http://localhost:8080/api/v1/auth';
export const login = async (username, password) =>{
    try {
        const respones = await axios.post(`${API_URL}/authenticate`,{
            username: username,
            password: password
        });
        return respones.data;
    } catch (error){
        throw error;
    }
}