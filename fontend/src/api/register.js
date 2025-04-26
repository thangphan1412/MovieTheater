import axios from 'axios';

const API_BASE_URL = 'http://localhost:8080/api/v1/auth';

export const register = async (formData) => {
    const response = await axios.post(`${API_BASE_URL}/register`, formData);
    return response.data; // tra ve du lieu cho component xu ly
}
