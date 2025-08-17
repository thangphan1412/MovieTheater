import axios from 'axios';
const API_ULR="http://localhost:8080/api/v1/auth/authenticate";
export const loginApi = async (email, password) => {
    try {
        const response = await axios.post(API_ULR, email, password);
        return response.data;
    } catch (error){
        throw error;
    }

}