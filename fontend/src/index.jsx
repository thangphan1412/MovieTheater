import React from 'react';


import 'bootstrap/dist/css/bootstrap.min.css';

import ReactDOM from 'react-dom/client';
import App from './App';
import { BrowserRouter } from 'react-router-dom';

// tao root element (note : cho react 18+)
// createRoot: muc dich ham nay la xac dinh phan tu HTML noi react hien thi
const root = ReactDOM.createRoot(document.getElementById('root'));
// Reder componet App
root.render(
    <React.StrictMode>

            <App/>


    </React.StrictMode>
)