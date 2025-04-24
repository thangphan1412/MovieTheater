import React from 'react';
import ReactDOM from 'react-dom/client';
import App from "./App";
import 'bootstrap/dist/css/bootstrap.min.css';


// tao root element (note : cho react 18+)
// createRoot: muc dich ham nay la xac dinh phan tu HTML noi react hien thi
const root = ReactDOM.createRoot(document.getElementById('root'));
// Reder componet App
root.render(
    <React.StrictMode>
        <App/>
        {/*<Learn/>*/}
    </React.StrictMode>
)