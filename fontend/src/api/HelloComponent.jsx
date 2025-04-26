// import React,{ useState, useEffect} from 'react';
// import axios from 'axios';
// function HelloComponent(){
//     const [message,setMessage] = useState('');
//     useEffect(()=>{
//         axios.get("http://localhost:8080/api/messages")
//             .then(response => {
//                 setMessage(response.data);
//             })
//             .catch(error => {
//                 console.log(error);
//             })
//     },[])
//     return <h1>{message}</h1>;
// }
// export default HelloComponent;