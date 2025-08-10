import React from 'react';
import "../../assets/css/componentCss/headerCss/preHeader.css"
export default function PeHeader() {
    return(
        <div className="title" >
            <a className="title-e" href="/register">Đăng ký</a>
            <a className="title-e" href="/login">Đăng nhập</a>
        </div>

    );
}